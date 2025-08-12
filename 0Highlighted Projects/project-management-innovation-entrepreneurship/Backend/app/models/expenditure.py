from ..database import Base
from sqlalchemy import Column, String, TIMESTAMP, text, ForeignKey, Float
from sqlalchemy.orm import relationship, Mapped
from sqlalchemy.dialects.postgresql import UUID
import uuid


class Expenditure(Base):
    __tablename__ = "expenditures"

    id = Column(UUID, primary_key=True, nullable=False, default=uuid.uuid4)
    expense_id = Column(UUID, ForeignKey("expenses.id", ondelete="CASCADE"), nullable=False)
    expenditure_type = Column(String, ForeignKey("expenditure_types.id"),  nullable=False)
    car_type = Column(String, nullable=True)
    license_plate = Column(String, nullable=True)
    km_travelled = Column(Float, nullable=True)
    fuel = Column(Float, nullable=True)
    parking_tolls = Column(Float, nullable=True)
    value = Column(Float, nullable=True)
    created_at = Column(TIMESTAMP(timezone=True), server_default=text('now()'))

    expense: Mapped["Expense"] = relationship("Expense", back_populates="expenditures", lazy="joined")