from __future__ import annotations

from sqlalchemy import Column, String, Boolean, ForeignKey, TIMESTAMP, func
from sqlalchemy.dialects.postgresql import UUID
from sqlalchemy.orm import relationship, Mapped
from ..database import Base
from typing import Optional, TYPE_CHECKING
import uuid
from .report import Report

if TYPE_CHECKING:
    from .user import User

class Review(Base):
    __tablename__ = "reviews"

    id = Column(UUID, primary_key=True, index=True, default=uuid.uuid4)
    reviewer_id = Column(String, ForeignKey("users.id", ondelete="SET NULL"), nullable=True)  # změněno
    report_id = Column(String, ForeignKey("reports.id", ondelete="CASCADE"), nullable=False)
    approved = Column(Boolean, default=False, nullable=False)
    observations = Column(String, nullable=True)
    created_at = Column(TIMESTAMP(timezone=True), server_default=func.now(), nullable=False)

    report: Mapped["Report"] = relationship("Report", back_populates="review")
    reviewer: Mapped[Optional["User"]] = relationship("User", back_populates="reviews")
