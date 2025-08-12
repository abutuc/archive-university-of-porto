from sqlalchemy.orm import Session
from fastapi import Depends
from sqlalchemy.dialects.postgresql import UUID
from typing import List

from ..models.notification import Notification, NotificationPurposeEnum
from ..database import get_db
from ..models.user import User


def notify_all_accountants(report_id: UUID,
                           accountants: List[User],
                           triggered_by_user_id: str,
                           db: Session = Depends(get_db)):
    for accountant in accountants:
        create_notification(report_id,
                            accountant.id,
                            triggered_by_user_id,
                            NotificationPurposeEnum.WAITING_FOR_REVIEW,
                            db)


def notify_reviewer(report_id: UUID,
                    user_id: str,
                    triggered_by_user_id: str,
                    db: Session = Depends(get_db)) -> Notification:
    return create_notification(report_id,
                               user_id,
                               triggered_by_user_id,
                               NotificationPurposeEnum.WAITING_FOR_REVIEW,
                               db)


def create_notification(report_id: UUID,
                        user_id: str,
                        triggered_by_user_id: str,
                        notification_purpose: NotificationPurposeEnum,
                        db: Session = Depends(get_db)) -> Notification:
    notification = Notification(
        report_id=report_id,
        user_id=user_id,
        triggered_by_user_id=triggered_by_user_id,
        notification_purpose=notification_purpose)
    db.add(notification)
    db.flush()
    db.refresh(notification)
    return notification
