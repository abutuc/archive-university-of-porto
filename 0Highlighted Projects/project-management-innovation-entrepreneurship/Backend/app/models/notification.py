from sqlalchemy import Column, String, Boolean, ForeignKey, TIMESTAMP, func
from sqlalchemy.dialects.postgresql import UUID
from sqlalchemy.orm import relationship
from sqlalchemy import Enum as SQLEnum
from enum import Enum
from ..database import Base
import uuid

class NotificationPurposeEnum(str, Enum):
    WAITING_FOR_REVIEW = "WAITING_FOR_REVIEW" # The report is waiting for review. Used for notify FO or Accountant
    REPORT_APPROVED_BY_FO = "REPORT_APPROVED_BY_FO" # The report is approved by FO. Used for notify Collaborator
    JUSTIFICATION_CORRECTION_REQUIRED = "JUSTIFICATION_CORRECTION_REQUIRED" # Used for notify Collaborator that his report needs correction
    ADDITIONAL_STEPS_REQUIRED = "ADDITIONAL_STEPS_REQUIRED" # Used for notify Collaborator that his report needs additional steps
    APPROVED = "APPROVED" # Used for notify Collaborator that his report is approved
    

class Notification(Base):
    __tablename__ = "notifications"

    id = Column(UUID, primary_key=True, index=True, default=uuid.uuid4)
    user_id = Column(String, ForeignKey("users.id", ondelete="CASCADE"), nullable=False)
    report_id = Column(String, ForeignKey("reports.id", ondelete="CASCADE"), nullable=False)
    triggered_by_user_id = Column(String, ForeignKey("users.id", ondelete="CASCADE"), nullable=False)
    is_read = Column(Boolean, default=False, nullable=False)
    notification_purpose = Column(SQLEnum(NotificationPurposeEnum), nullable=False)
    created_at = Column(TIMESTAMP(timezone=True), server_default=func.now(), nullable=False)

    report = relationship("Report", back_populates="notifications")
    user = relationship("User", foreign_keys=[user_id], back_populates="notifications")
    triggered_by_user = relationship("User", foreign_keys=[triggered_by_user_id])
