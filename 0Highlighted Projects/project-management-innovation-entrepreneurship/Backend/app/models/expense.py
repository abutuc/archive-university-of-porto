from ..database import Base
from sqlalchemy import Column, String, TIMESTAMP, text, ForeignKey, Date, Time
from sqlalchemy.orm import relationship, Mapped
from sqlalchemy.dialects.postgresql import UUID
from typing import List
from .expenditure import Expenditure
from .attachment import Attachment
import uuid


class Expense(Base):
    __tablename__ = "expenses"

    id = Column(UUID, primary_key=True, nullable=False, default=uuid.uuid4)
    report_id = Column(String, ForeignKey("reports.id", ondelete="CASCADE"), nullable=False)
    departure_date = Column(Date, nullable=False)
    departure_time = Column(Time, nullable=False)
    arrival_date = Column(Date, nullable=False)
    arrival_time = Column(Time, nullable=False)
    travel_type = Column(String, ForeignKey("travel_types.id"),  nullable=False)
    departure_place = Column(String, nullable=False)
    meeting_place = Column(String, nullable=False)
    arrival_place = Column(String, nullable=False)
    created_at = Column(TIMESTAMP(timezone=True), server_default=text('now()'))

    report: Mapped["Report"] = relationship("Report", back_populates="expenses")
    expenditures: Mapped[List["Expenditure"]] = relationship("Expenditure", back_populates="expense", cascade="all, delete-orphan", lazy="joined", passive_deletes=True)
    attachments: Mapped[List["Attachment"]] = relationship("Attachment", back_populates="expense", cascade="all, delete-orphan", passive_deletes=True)
