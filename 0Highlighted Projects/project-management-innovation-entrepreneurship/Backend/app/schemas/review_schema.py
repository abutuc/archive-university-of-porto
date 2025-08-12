from pydantic import BaseModel
from uuid import UUID
from typing import Optional
from datetime import datetime
from . import user_schema


class ReviewOut(BaseModel):
    id: UUID
    reviewer_id: Optional[str] = None
    report_id: str
    approved: bool
    observations: Optional[str] = None
    created_at: datetime
    reviewer: Optional[user_schema.UserOut] = None

    class Config:
        from_attributes = True


class CreateReview(BaseModel):
    report_id: str
    approved: bool = False
    observations: Optional[str] = None

    class Config:
        from_attributes = True


class PatchReview(BaseModel):
    approved: Optional[bool] = None
    observations: Optional[str] = None

    class Config:
        from_attributes = True
