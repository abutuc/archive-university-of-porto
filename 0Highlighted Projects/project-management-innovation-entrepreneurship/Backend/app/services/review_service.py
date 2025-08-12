from fastapi import APIRouter, Depends, HTTPException, Request
from sqlalchemy.orm import Session
from starlette import status
from uuid import UUID

from ..models.review import Review
from ..models.user import User
from ..models.report import Report, StatusEnum
from ..models.notification import NotificationPurposeEnum
from ..schemas.review_schema import CreateReview, PatchReview, ReviewOut
from ..schemas.user_schema import UserOut
from ..constants.constants import FINANCIAL_OFFICER, ACCOUNTANT
from ..utils.notification_utils import create_notification, notify_all_accountants
from ..utils.emails_utils import send_email_to_all_accountants, send_email_notification

def create_review(request: Request, review: CreateReview, db: Session):
    reviewer = db.query(User).filter(User.id == request.state.user["id"]).first()
    if not reviewer:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Reviewer not found")

    report = db.query(Report).filter(Report.id == review.report_id).first()
    if not report:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Report not found")

    if report.status != StatusEnum.PENDING_FO_REVIEW and report.status != StatusEnum.PENDING_ACCOUNTANT_REVIEW:
        raise HTTPException(status_code=status.HTTP_400_BAD_REQUEST, detail="Report is not pending for review")

    if report.status == StatusEnum.PENDING_FO_REVIEW and request.state.user["job_title"] != FINANCIAL_OFFICER:
        raise HTTPException(status_code=status.HTTP_403_FORBIDDEN, detail="Report needs to be currently validated by FO")

    if report.status == StatusEnum.PENDING_ACCOUNTANT_REVIEW and request.state.user["job_title"] != ACCOUNTANT:
        raise HTTPException(status_code=status.HTTP_403_FORBIDDEN, detail="Report needs to be currently validated by Accountant")

    db_review = Review(**review.dict())
    db_review.reviewer_id = reviewer.id
    db.add(db_review)

    update_report_status(report, review.approved, reviewer.id, db)

    db.commit()
    db.refresh(db_review)

    return ReviewOut(
        id=db_review.id,
        reviewer_id=db_review.reviewer_id,
        report_id=db_review.report_id,
        approved=db_review.approved,
        observations=db_review.observations,
        created_at=db_review.created_at,
        reviewer=UserOut.from_orm(reviewer)
    )


def update_review(id: UUID, review: PatchReview, db: Session):
    db_review = db.query(Review).filter(Review.id == id).first()
    if not db_review:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Review not found")

    for key, value in review.dict(exclude_unset=True).items():
        setattr(db_review, key, value)

    if review.approved is not None:
        report = db_review.report
        update_report_status(report, review.approved, db_review.reviewer_id, db)

    db.commit()
    db.refresh(db_review)

    reviewer = db_review.reviewer
    return ReviewOut(
        id=db_review.id,
        reviewer_id=db_review.reviewer_id,
        report_id=db_review.report_id,
        approved=db_review.approved,
        observations=db_review.observations,
        created_at=db_review.created_at,
        reviewer=UserOut.from_orm(reviewer)
    )


def get_review_by_id(id: UUID, db: Session):
    db_review = db.query(Review).filter(Review.id == id).first()
    if not db_review:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Review not found")

    reviewer = db_review.reviewer
    return ReviewOut(
        id=db_review.id,
        reviewer_id=db_review.reviewer_id,
        report_id=db_review.report_id,
        approved=db_review.approved,
        observations=db_review.observations,
        created_at=db_review.created_at,
        reviewer=UserOut.from_orm(reviewer)
    )


def get_all_reviews_from_user(reviewer_id: str, db: Session):
    reviews = db.query(Review).filter(Review.reviewer_id == reviewer_id).order_by(Review.created_at.desc()).all()
    reviewer = db.query(User).filter(User.id == reviewer_id).first()

    if not reviewer:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Reviewer not found")

    return [
        ReviewOut(
            id=review.id,
            reviewer_id=review.reviewer_id,
            report_id=review.report_id,
            approved=review.approved,
            observations=review.observations,
            created_at=review.created_at,
            reviewer=UserOut.from_orm(reviewer)
        )
        for review in reviews
    ]


def delete_review(id: UUID, db: Session):
    review = db.query(Review).filter(Review.id == id).first()
    if not review:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Review not found")

    db.delete(review)
    db.commit()
    return {"message": "Review deleted"}


def update_report_status(report: Report, approved: bool, reviewer_id: str, db: Session):
    notification_for_collaborator: NotificationPurposeEnum = None

    if report.status == StatusEnum.PENDING_FO_REVIEW:
        if approved:
            report.status = StatusEnum.PENDING_ACCOUNTANT_REVIEW
            report.is_update_request = False

            notification_for_collaborator = NotificationPurposeEnum.REPORT_APPROVED_BY_FO
            accountants = db.query(User).filter(User.job_title == ACCOUNTANT).all()
            notify_all_accountants(report.id, accountants, report.user_id, db)
            send_email_to_all_accountants(report.id, accountants)
        else:
            report.status = StatusEnum.JUSTIFICATION_CORRECTION_REQUIRED
            notification_for_collaborator = NotificationPurposeEnum.JUSTIFICATION_CORRECTION_REQUIRED

    elif report.status == StatusEnum.PENDING_ACCOUNTANT_REVIEW:
        if approved:
            if str(report.type_of_document) == "EXPENSE_REPORT":
                report.status = StatusEnum.APPROVED
                report.is_pending_accountant_review = False
                report.is_update_request = False
                notification_for_collaborator = NotificationPurposeEnum.APPROVED
            else:
                report.status = StatusEnum.ADDITIONAL_STEPS_REQUIRED
                report.is_pending_accountant_review = False
                notification_for_collaborator = NotificationPurposeEnum.ADDITIONAL_STEPS_REQUIRED
        else:
            report.status = StatusEnum.JUSTIFICATION_CORRECTION_REQUIRED
            report.is_pending_accountant_review = True
            notification_for_collaborator = NotificationPurposeEnum.JUSTIFICATION_CORRECTION_REQUIRED

    # Notify the collaborator about the review result
    if notification_for_collaborator:
        create_notification(report.id, report.user_id, reviewer_id, notification_for_collaborator, db)
        send_email_notification(
                to_emails=[report.user.email],
                email_template=notification_for_collaborator.value,
                email_context={
                    "report_id": report.id
                }
            )
