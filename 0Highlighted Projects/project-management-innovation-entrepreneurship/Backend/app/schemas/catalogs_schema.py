from pydantic import BaseModel


class Company(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True


class Direction(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True


class Unit(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True


class Office(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True


class EmployeeType(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True


class DocumentType(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True


class TravelType(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True


class ExpenditureType(BaseModel):
    id: str
    pt_label: str
    en_label: str

    class Config:
        from_attributes = True
