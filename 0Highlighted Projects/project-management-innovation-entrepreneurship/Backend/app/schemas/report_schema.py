from pydantic import BaseModel, RootModel
from uuid import UUID
from typing import Optional, List
from . import expense_schema, review_schema
from datetime import datetime
from ..models.report import StatusEnum


class DeleteReportInfo(BaseModel):
    expenses: Optional[List[UUID]] = None
    expenditures: Optional[List[UUID]] = None

    class Config:
        from_attributes = True


class UpdateFullReport(BaseModel):
    description: Optional[str] = None
    company: Optional[str] = None
    direction: Optional[str] = None
    unit: Optional[str] = None
    office: Optional[str] = None
    type_of_employee: Optional[str] = None
    type_of_document: Optional[str] = None
    project_client: Optional[str] = None
    expenses: Optional[List[expense_schema.UpdateExpense]] = None
    delete: Optional[DeleteReportInfo] = None

    class Config:
        from_attributes = True


class CreateReport(BaseModel):
    description: str
    company: str
    direction: str
    unit: str
    office: str
    type_of_employee: str
    type_of_document: str
    project_client: str
    total_expenditure: float
    advance_payments: float
    company_payments: float
    receive_pay: float
    expenses: Optional[list[expense_schema.CreateExpense]] = []

    class Config:
        from_attributes = True


class ReportSummary(BaseModel):
    id: str
    project_client: str
    description: str
    created_at: datetime
    status: str
    collaborator_name: str
    is_update_request: bool

    class Config:
        from_attributes = True


class ReportOut(BaseModel):
    id: str
    description: str
    status: StatusEnum
    company: str
    direction: str
    unit: str
    office: str
    name_of_employee: str
    type_of_employee: str
    type_of_document: str
    project_client: str
    created_at: datetime
    total_expenditure: float
    advance_payments: float
    company_payments: float
    is_update_request: bool
    receive_pay: float
    expenses: List[expense_schema.ExpenseOut] = []
    review: Optional[review_schema.ReviewOut] = None

    class Config:
        from_attributes = True


# Expenditure Summary Schemas
class MonthlySummaryItem(BaseModel):
    year: int
    month: int
    amount: float


class MonthlySummaryResponse(RootModel[dict[str, List[MonthlySummaryItem]]]):

    # nothing needs to be done here, because the root model is already a dict
    pass
