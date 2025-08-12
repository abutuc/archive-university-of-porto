from enum import Enum
from ..database import Base
from sqlalchemy import Enum as SQLEnum
from sqlalchemy import Column, String

class VariableTypeEnum(str, Enum):
    NUMBER = "NUMBER"
    STRING = "STRING"


class SystemVariable(Base):
    __tablename__ = "system_variables"

    name = Column(String, primary_key=True, index=True)
    type = Column(SQLEnum(VariableTypeEnum), nullable=False)
    value = Column(String, nullable=False)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

