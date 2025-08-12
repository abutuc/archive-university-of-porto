from pydantic import BaseModel
from datetime import datetime
from uuid import UUID


class AttachmentOut(BaseModel):
    id: UUID
    file_name: str
    file_path: str
    created_at: datetime
    expense_id: UUID

    class Config:
        from_attributes = True
