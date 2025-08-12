from pydantic import BaseModel
from ..models.system_variable import VariableTypeEnum

class SystemVariableOut(BaseModel):
    name: str
    type: VariableTypeEnum
    value: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True