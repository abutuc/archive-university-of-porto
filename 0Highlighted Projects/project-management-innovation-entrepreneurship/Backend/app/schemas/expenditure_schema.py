from pydantic import BaseModel
from uuid import UUID
from typing import Optional
from datetime import datetime


class UpdateExpenditure(BaseModel):
    id: Optional[UUID] = None
    expense_id: Optional[UUID] = None
    expenditure_type: str
    car_type: Optional[str] = None
    license_plate: Optional[str] = None
    km_travelled: Optional[float] = None
    fuel: Optional[float] = None
    parking_tolls: Optional[float] = None
    value: Optional[float] = None

    class Config:
        from_attributes = True


class CreateExpenditure(BaseModel):
    expense_id: Optional[UUID] = None
    expenditure_type: str
    car_type: Optional[str] = None
    license_plate: Optional[str] = None
    km_travelled: Optional[float] = None
    fuel: Optional[float] = None
    parking_tolls: Optional[float] = None
    value: Optional[float] = None

    class Config:
        from_attributes = True


class ExpenditureOut(BaseModel):
    id: UUID
    expense_id: UUID
    expenditure_type: str
    car_type: Optional[str] = None
    license_plate: Optional[str] = None
    km_travelled: Optional[float] = None
    fuel: Optional[float] = None
    parking_tolls: Optional[float] = None
    value: Optional[float] = None
    created_at: datetime

    class Config:
        from_attributes = True
