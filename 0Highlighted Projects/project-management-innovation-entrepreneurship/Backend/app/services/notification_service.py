from fastapi import HTTPException
from starlette import status
from sqlalchemy.orm import Session
from ..models.notification import Notification
from ..models.report import Report
from ..models.user import User
from ..schemas.notification_schema import NotificationOut


def get_unread_notifications_for_user(user_id: str, db: Session):
    notifications = db.query(Notification) \
            .filter(Notification.user_id == user_id) \
            .filter(Notification.is_read == False) \
            .order_by(Notification.created_at.desc()) \
            .all()

    result = []
    for n in notifications:
        report = db.query(Report).filter(Report.id == n.report_id).first()
        result.append(NotificationOut(
            id=n.id,
            user_id=n.user_id,
            report_id=n.report_id,
            is_read=n.is_read,
            notification_purpose=n.notification_purpose,
            created_at=n.created_at,
            report_type=report.type_of_document,
            report_status=report.status,
            created_by=n.triggered_by_user.name
        ))

    return result


def mark_notification_as_read(id: str, db: Session):
    notification = db.query(Notification).filter(Notification.id == id).first()
    if not notification:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND,
                            detail="Notification not found")
    notification.is_read = True
    db.commit()
    return {"message": "Notification marked as read"}

