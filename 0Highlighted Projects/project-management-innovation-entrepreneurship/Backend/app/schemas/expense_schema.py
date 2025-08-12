from pydantic import BaseModel
from uuid import UUID
from typing import Optional, List
from datetime import date, time, datetime
from . import expenditure_schema, attachment_schema


class UpdateExpense(BaseModel):
    id: Optional[UUID] = None
    report_id: Optional[str] = None
    departure_date: Optional[date] = None
    departure_time: Optional[time] = None
    arrival_date: Optional[date] = None
    arrival_time: Optional[time] = None
    travel_type: Optional[str] = None
    departure_place: Optional[str] = None
    meeting_place: Optional[str] = None
    arrival_place: Optional[str] = None
    attachments: Optional[List[str]] = []
    expenditures: Optional[List[expenditure_schema.UpdateExpenditure]] = None

    class Config:
        from_attributes = True


class CreateExpense(BaseModel):
    report_id: Optional[str] = None
    departure_date: date
    departure_time: time
    arrival_date: date
    arrival_time: time
    travel_type: str
    departure_place: str
    meeting_place: str
    arrival_place: str
    attachments: Optional[List[str]] = []
    expenditures: Optional[list[expenditure_schema.CreateExpenditure]] = []

    class Config:
        from_attributes = True


class ExpenseOut(BaseModel):
    id: UUID
    report_id: str
    departure_date: date
    departure_time: time
    arrival_date: date
    arrival_time: time
    travel_type: str
    departure_place: str
    meeting_place: str
    arrival_place: str
    created_at: datetime
    expenditures: List[expenditure_schema.ExpenditureOut] = []
    attachments: List[attachment_schema.AttachmentOut] = []

    class Config:
        from_attributes = True
