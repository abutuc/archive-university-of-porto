from __future__ import annotations

from ..database import Base
from sqlalchemy import Column, String, TIMESTAMP, text, ForeignKey, Enum, Float, Boolean
from sqlalchemy.orm import relationship, Mapped
from sqlalchemy.dialects.postgresql import UUID
from typing import List, Optional, TYPE_CHECKING
from .expense import Expense
from .notification import Notification
import uuid

import enum

if TYPE_CHECKING:
    from .user import User
    from .review import Review

class StatusEnum(str, enum.Enum):
    PENDING_FO_REVIEW = "PENDING_FO_REVIEW"
    PENDING_ACCOUNTANT_REVIEW = "PENDING_ACCOUNTANT_REVIEW"
    APPROVED = "APPROVED"
    JUSTIFICATION_CORRECTION_REQUIRED = "JUSTIFICATION_CORRECTION_REQUIRED"
    ADDITIONAL_STEPS_REQUIRED = "ADDITIONAL_STEPS_REQUIRED"


class Report(Base):
    __tablename__ = "reports"

    id = Column(String, primary_key=True, nullable=False)
    user_id = Column(String, ForeignKey("users.id"), nullable=False)
    description = Column(String, nullable=False)
    status = Column(Enum(StatusEnum), nullable=False)

    company = Column(String, ForeignKey("companies.id"),  nullable=False)
    direction = Column(String, ForeignKey("directions.id"),  nullable=False) 
    unit = Column(String, ForeignKey("units.id"),  nullable=False)
    office = Column(String, ForeignKey("offices.id"),  nullable=False)
    type_of_employee = Column(String, ForeignKey("employee_types.id"),  nullable=False)
    type_of_document = Column(String, ForeignKey("document_types.id"),  nullable=False)
    project_client = Column(String, nullable=False)
    is_pending_accountant_review = Column(Boolean, nullable=False, default=False)
    is_update_request = Column(Boolean, nullable=False, default=False)
    created_at = Column(TIMESTAMP(timezone=True), server_default=text('now()'))

    total_expenditure = Column(Float, nullable=False, default=0)
    advance_payments = Column(Float, nullable=False, default=0)
    company_payments = Column(Float, nullable=False, default=0)
    receive_pay = Column(Float, nullable=False, default=0)

    user: Mapped["User"] = relationship("User", back_populates="reports", passive_deletes=True)
    expenses: Mapped[List["Expense"]] = relationship("Expense", back_populates="report", cascade="all, delete-orphan", passive_deletes=True)
    notifications: Mapped[List["Notification"]] = relationship("Notification", back_populates="report", cascade="all, delete-orphan", passive_deletes=True)
    review: Mapped[Optional["Review"]] = relationship("Review", back_populates="report", uselist=False, cascade="all, delete-orphan", passive_deletes=True)
