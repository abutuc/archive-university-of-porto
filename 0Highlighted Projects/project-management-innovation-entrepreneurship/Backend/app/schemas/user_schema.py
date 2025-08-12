from pydantic import BaseModel
from typing import Optional


class UserOut(BaseModel):
    id: str
    email: Optional[str] = None
    name: Optional[str] = None
    job_title: Optional[str] = None

    company: Optional[str] = None
    direction: Optional[str] = None
    unit: Optional[str] = None
    office: Optional[str] = None
    type_of_employee: Optional[str] = None

    class Config:
        from_attributes = True

class UserUpdate(BaseModel):
    company: Optional[str] = None
    direction: Optional[str] = None
    unit: Optional[str] = None
    office: Optional[str] = None
    type_of_employee: Optional[str] = None

    class Config:
        from_attributes = True
