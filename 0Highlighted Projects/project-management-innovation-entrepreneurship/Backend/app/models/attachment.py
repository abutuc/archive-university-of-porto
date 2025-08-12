from ..database import Base
from sqlalchemy import Column, String, ForeignKey, TIMESTAMP, text
from sqlalchemy.dialects.postgresql import UUID
from sqlalchemy.orm import relationship, Mapped
import uuid


class Attachment(Base):
    __tablename__ = "attachments"

    id = Column(UUID, primary_key=True, default=uuid.uuid4)
    file_name = Column(String, nullable=False)
    file_path = Column(String, nullable=False)
    created_at = Column(TIMESTAMP(timezone=True), server_default=text('now()'))
    expense_id = Column(UUID, ForeignKey("expenses.id", ondelete="CASCADE"))

    expense: Mapped["Expense"] = relationship("Expense", back_populates="attachments")