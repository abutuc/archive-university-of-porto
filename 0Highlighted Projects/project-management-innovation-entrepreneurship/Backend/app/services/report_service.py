from ..schemas import report_schema as schema
from ..database import get_db
from fastapi import Depends, HTTPException, Form, Request, UploadFile, File
from sqlalchemy.orm import Session, joinedload
from sqlalchemy import case, func
from uuid import UUID
from typing import List, Optional
from starlette import status
from .. import models
from ..utils.notification_utils import notify_reviewer
from ..utils.emails_utils import send_email_notification
from ..services import expenditure_service, expense_service
from ..schemas import report_schema
from ..constants.constants import FINANCIAL_OFFICER, ACCOUNTANT
from ..util.files_helper import save_receipt_files, delete_receipt_file
import json
import datetime


def update_report(
    id: str,
    report: schema.UpdateFullReport,
    db: Session = Depends(get_db)
):
    """
    Update an expenditure in the database.
    """
    existing_report = (
        db.query(models.report.Report)
        .filter(models.report.Report.id == id)
        .first()
    )

    if existing_report is None:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail=f"The report with id: {id} does not exist",
        )

    if existing_report.status not in [
        models.Report.StatusEnum.JUSTIFICATION_CORRECTION_REQUIRED,
        models.Report.StatusEnum.ADDITIONAL_STEPS_REQUIRED
    ]:
        return None

    report_data = report.dict(exclude={"expenses"})

    for key, value in report_data.items():
        setattr(existing_report, key, value)

    # Check if it's an update request
    if existing_report.status == models.Report.StatusEnum.JUSTIFICATION_CORRECTION_REQUIRED:
        existing_report.is_update_request = True

    existing_report.status = models.Report.StatusEnum.PENDING_ACCOUNTANT_REVIEW if existing_report.is_pending_accountant_review else models.Report.StatusEnum.PENDING_FO_REVIEW

    return existing_report


def handle_deletes(delete_data, db: Session):
    """
    Handle the deletes in the report.
    """
    for expense_id in delete_data.expenses:
        expense_service.delete_expense(
            expense_id,
            db
        )
    for expenditure_id in delete_data.expenditures:
        expenditure_service.delete_expenditure(
            expenditure_id,
            db
        )


def handle_report_data_update_or_create(
    id: str,
    full_report: report_schema.UpdateFullReport,
    db: Session,
    request: Request,
    files: Optional[List[UploadFile]] = File(None)
):
    """
    Function that handles the infomration that needs to be updated,
    deleted or added in the report.
    """

    if full_report.delete:
        handle_deletes(full_report.delete, db)

    report = update_report(id, full_report, db)
    if not report:
        return {"message": "The report cannot be updated"}

    for expense in full_report.expenses:
        if not expense.id:
            new_expense = expense_service.create_expense(expense,
                                                         db)
            current_expense_id = new_expense["id"]
            if files:
                    expense_attachments = [file for file in files if file.filename in expense.attachments]

                    if expense_attachments:
                        save_receipt_files(
                            collaborator_uuid=request.state.user["id"],
                            collaborator_name=request.state.user["name"],
                            report_id=id,
                            expense_id=current_expense_id,
                            files=expense_attachments,
                        )

                    for file in expense_attachments:
                        file_path = f"{request.state.user['id']}_{request.state.user['name'].replace(' ', '_')}/R_{id}/E_{current_expense_id}/{file.filename}"
                        attachment = models.attachment.Attachment(
                            file_name=file.filename,
                            file_path=file_path,
                            expense_id=current_expense_id
                        )
                        db.add(attachment)
        else:
            current_expense = expense_service.update_expense(expense,
                                                             db)

            actual_expense = db.query(models.expense.Expense).filter(models.expense.Expense.id == expense.id).first()

            expense_attachments = []

            if files:
                expense_attachments = [file for file in files if file.filename in expense.attachments]

                if expense_attachments:
                    save_receipt_files(
                        collaborator_uuid=request.state.user["id"],
                        collaborator_name=request.state.user["name"],
                        report_id=id,
                        expense_id=actual_expense.id,
                            files=expense_attachments,
                    )

                for file in expense_attachments:
                    file_path = f"{request.state.user['id']}_{request.state.user['name'].replace(' ', '_')}/R_{id}/E_{actual_expense.id}/{file.filename}"
                    attachment = models.attachment.Attachment(
                        file_name=file.filename,
                        file_path=file_path,
                        expense_id=actual_expense.id
                    )
                    db.add(attachment)

            for attachment in actual_expense.attachments:
                if attachment.file_name not in expense.attachments:
                    db.delete(attachment)
                    delete_receipt_file(
                        collaborator_uuid=request.state.user["id"],
                        collaborator_name=request.state.user["name"],
                        report_id=id,
                        expense_id=actual_expense.id,
                        file=attachment.file_name,
                    )

            current_expense_id = current_expense["id"]

        for expenditure in expense.expenditures:
            if expenditure.id:
                expenditure_service.update_expenditure(expenditure, db)
            else:
                expenditure.expense_id = current_expense_id
                expenditure_service.create_expenditure(
                    expenditure,
                    db)
    financial_officers = db.query(models.user.User).filter(
            models.user.User.job_title == FINANCIAL_OFFICER
            ).all()

    for officer in financial_officers:
        notify_reviewer(report_id=id, user_id=officer.id, triggered_by_user_id=report.user_id, db=db)

    financial_officers_emails = [officer.email for officer in financial_officers]
    if financial_officers_emails:
        send_email_notification(
            to_emails=financial_officers_emails,
            email_template="financial_officer",
            email_context={
                "report_id": id,
                "report_description": full_report.description,
                "report_status": models.Report.StatusEnum.PENDING_FO_REVIEW
            }
        )

    db.commit()
    return {"message": "Report updated successfully"}


def get_all_reports(request, db):
    user = request.state.user
    job_title = user["job_title"]

    try:
        base_query= db.query(
            models.report.Report.id,
            models.report.Report.is_update_request,
            models.report.Report.description,
            models.report.Report.project_client,
            models.report.Report.created_at,
            models.report.Report.status,
            models.user.User.name.label("collaborator_name")
        ).join(
            models.user.User, models.report.Report.user_id == models.user.User.id
        )

        if job_title == FINANCIAL_OFFICER:
            reports = base_query.filter(
                models.report.Report.status == models.report.StatusEnum.PENDING_FO_REVIEW
            ).all()

        elif job_title == ACCOUNTANT:
            reports = base_query.order_by(
                case(
                    (models.report.Report.status == models.report.StatusEnum.PENDING_ACCOUNTANT_REVIEW, 0),
                    (models.report.Report.status == models.report.StatusEnum.PENDING_FO_REVIEW, 1),
                    else_=2
                )
            ).all()

        else:
            reports = base_query.filter(
                models.report.Report.user_id == user["id"]
            ).all()

        return reports or []

    except Exception as e:
        raise HTTPException(status_code=status.HTTP_500_INTERNAL_SERVER_ERROR,
                            detail=str(e))


def create_full_report(
    request: Request,
    db: Session,
    data: str = Form(...),
    files: Optional[List[UploadFile]] = File(None),
):
    try:
        user = request.state.user
        parsed_data = report_schema.CreateReport(**json.loads(data))

        new_report: models.Report.Report = models.report.Report(**parsed_data.dict(exclude={"expenses"}), user_id=user["id"])
        new_report.status = models.Report.StatusEnum.PENDING_FO_REVIEW
        new_report.id = generate_custom_uuid(db)

        db.add(new_report)
        db.commit()
        db.refresh(new_report)

        created_expenses = []

        if parsed_data.expenses:
            for expense in parsed_data.expenses:
                expense_data = expense.dict(exclude={"report_id", "expenditures", "attachments"})
                new_expense = models.expense.Expense(**expense_data, report_id=new_report.id)
                db.add(new_expense)
                db.commit()
                db.refresh(new_expense)
                created_expenses.append(new_expense)

                if files:
                    expense_attachments = [file for file in files if file.filename in expense.attachments]

                    if expense_attachments:
                        save_receipt_files(
                            collaborator_uuid=request.state.user["id"],
                            collaborator_name=request.state.user["name"],
                            report_id=new_report.id,
                            expense_id=new_expense.id,
                            files=expense_attachments,
                        )

                    for file in expense_attachments:
                        file_path = f"{request.state.user['id']}_{request.state.user['name'].replace(' ', '_')}/R_{new_report.id}/E_{new_expense.id}/{file.filename}"
                        attachment = models.attachment.Attachment(
                            file_name=file.filename,
                            file_path=file_path,
                            expense_id=new_expense.id
                        )
                        db.add(attachment)

                if expense.expenditures:
                    for expenditure in expense.expenditures:
                        expenditure_data = expenditure.dict(exclude={"expense_id"})
                        new_expenditure = models.expenditure.Expenditure(
                            **expenditure_data, expense_id=new_expense.id
                        )
                        db.add(new_expenditure)

        financial_officers = db.query(models.user.User).filter(
            models.user.User.job_title == FINANCIAL_OFFICER
            ).all()
        for officer in financial_officers:
            notify_reviewer(report_id=new_report.id, user_id=officer.id, triggered_by_user_id=new_report.user_id, db=db)

        db.commit()

        financial_officers_emails = [officer.email for officer in financial_officers]
        if financial_officers_emails:
            send_email_notification(
                to_emails=financial_officers_emails,
                email_template="financial_officer",
                email_context={
                    "report_id": new_report.id,
                    "report_description": new_report.description,
                    "report_status": new_report.status
                }
            )

        return {"message": "Report created successfully"}

    except Exception as e:
        db.rollback()
        raise HTTPException(status_code=status.HTTP_500_INTERNAL_SERVER_ERROR,
                            detail=str(e))


def get_monthly_expenditure_summary(db: Session):
    results = db.query(
        models.expenditure.Expenditure.expenditure_type,
        func.extract('year', models.expenditure.Expenditure.created_at).label('year'),
        func.extract('month', models.expenditure.Expenditure.created_at).label('month'),
        func.sum(models.expenditure.Expenditure.value).label('amount')
    ).group_by(
        models.expenditure.Expenditure.expenditure_type,
        func.extract('year', models.expenditure.Expenditure.created_at),
        func.extract('month', models.expenditure.Expenditure.created_at)
    ).all()

    summary: dict[str, list[report_schema.MonthlySummaryItem]] = {}

    for expenditure_type, year, month, amount in results:
        label = str(expenditure_type)
        item = report_schema.MonthlySummaryItem(
            year=int(year),
            month=int(month),
            amount=float(amount)
        )
        if label not in summary:
            summary[label] = []
        summary[label].append(item)

    return summary


def get_report_by_id(id: str, db: Session):
    report = db.query(models.report.Report)\
        .options(
            joinedload(models.report.Report.expenses)
            .joinedload(models.expense.Expense.expenditures),
            joinedload(models.report.Report.expenses)
            .joinedload(models.expense.Expense.attachments),
            joinedload(models.report.Report.review)
            .joinedload(models.review.Review.reviewer)
        )\
        .filter(models.report.Report.id == id)\
        .first()

    if report is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND,
                            detail=f"The report with id: {id} does not exist")

    report.name_of_employee = db.query(models.user.User).filter(
        models.user.User.id == report.user_id
        ).first().name

    # Sort expenses by created_at (primary) and id (secondary)
    if report.expenses:
        report.expenses.sort(key=lambda expense: (expense.created_at, expense.id))
        
        # Sort expenditures within each expense
        for expense in report.expenses:
            if expense.expenditures:
                expense.expenditures.sort(key=lambda expenditure: (expenditure.created_at, expenditure.id))


    return report


def delete_report(id: UUID, db: Session):
    report = db.query(models.report.Report).filter(
        models.report.Report.id == id
        ).first()

    if report is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND,
                            detail=f"The report with id: {id} does not exist")
    db.delete(report)
    db.commit()
    return {"message": "Report deleted successfully"}


def generate_custom_uuid(db: Session):

    today = datetime.date.today()
    creation_year = today.year

    nr_of_days_since_year_start = (today - datetime.date(creation_year, 1, 1)).days + 1
    number_of_current_reports = db.query(models.report.Report).count()

    custom_uuid = f"ER-{creation_year}-{nr_of_days_since_year_start}-{number_of_current_reports + 1}"

    return custom_uuid
