from sqlalchemy import Column, String
from ..database import Base


class Company(Base):
    __tablename__ = "companies"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

class Direction(Base):
    __tablename__ = "directions"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

class Unit(Base):
    __tablename__ = "units"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

class Office(Base):
    __tablename__ = "offices"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

class EmployeeType(Base):
    __tablename__ = "employee_types"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

class DocumentType(Base):
    __tablename__ = "document_types"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

class TravelType(Base):
    __tablename__ = "travel_types"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)

class ExpenditureType(Base):
    __tablename__ = "expenditure_types"

    id = Column(String, primary_key=True)
    pt_label = Column(String, nullable=False)
    en_label = Column(String, nullable=False)
