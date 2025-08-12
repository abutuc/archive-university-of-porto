from pydantic import BaseModel
from datetime import datetime
from uuid import UUID
from ..models.notification import NotificationPurposeEnum


class NotificationOut(BaseModel):
    id: UUID
    user_id: str
    report_id: str
    is_read: bool
    notification_purpose: NotificationPurposeEnum
    created_at: datetime
    report_type: str
    report_status: str
    created_by: str

    class Config:
        from_attributes = True
