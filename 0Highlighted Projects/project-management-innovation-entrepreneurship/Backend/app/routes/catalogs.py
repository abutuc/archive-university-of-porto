from fastapi import APIRouter, Depends, status
from sqlalchemy.orm import Session
from ..database import get_db
from ..schemas import catalogs_schema as schemas
from .. import models

router = APIRouter(
    prefix='/catalogs',
    tags=['Catalog']
)

@router.get('/companies', 
    response_model=list[schemas.Company], 
    status_code=status.HTTP_200_OK,
    summary="Get all companies",
    description="Retrieves a list of all companies in the system.",
    responses={
        200: {
            "description": "List of companies",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "INOVA+",
                        "pt_label": "INOVA+",
                        "en_label": "INOVA+"
                    }]
                }
            }
        }
    }
)
def get_companies(db: Session = Depends(get_db)):
    """
    Get all companies in the system.
    
    Returns a list of companies with their IDs and labels in Portuguese and English.
    """
    companies = db.query(models.catalogs.Company).all()
    return companies

@router.get('/directions', 
    response_model=list[schemas.Direction], 
    status_code=status.HTTP_200_OK,
    summary="Get all directions",
    description="Retrieves a list of all directions in the system.",
    responses={
        200: {
            "description": "List of directions",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "DIR1",
                        "pt_label": "Direção 1",
                        "en_label": "Direction 1"
                    }]
                }
            }
        }
    }
)
def get_directions(db: Session = Depends(get_db)):
    """
    Get all directions in the system.
    
    Returns a list of directions with their IDs and labels in Portuguese and English.
    """
    directions = db.query(models.catalogs.Direction).all()
    return directions

@router.get('/units', 
    response_model=list[schemas.Unit], 
    status_code=status.HTTP_200_OK,
    summary="Get all units",
    description="Retrieves a list of all units in the system.",
    responses={
        200: {
            "description": "List of units",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "UNIT1",
                        "pt_label": "Unidade 1",
                        "en_label": "Unit 1"
                    }]
                }
            }
        }
    }
)
def get_units(db: Session = Depends(get_db)):
    """
    Get all units in the system.
    
    Returns a list of units with their IDs and labels in Portuguese and English.
    """
    units = db.query(models.catalogs.Unit).all()
    return units

@router.get('/offices', 
    response_model=list[schemas.Office], 
    status_code=status.HTTP_200_OK,
    summary="Get all offices",
    description="Retrieves a list of all offices in the system.",
    responses={
        200: {
            "description": "List of offices",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "OFFICE1",
                        "pt_label": "Escritório 1",
                        "en_label": "Office 1"
                    }]
                }
            }
        }
    }
)
def get_offices(db: Session = Depends(get_db)):
    """
    Get all offices in the system.
    
    Returns a list of offices with their IDs and labels in Portuguese and English.
    """
    offices = db.query(models.catalogs.Office).all()
    return offices

@router.get('/employee_types', 
    response_model=list[schemas.EmployeeType], 
    status_code=status.HTTP_200_OK,
    summary="Get all employee types",
    description="Retrieves a list of all employee types in the system.",
    responses={
        200: {
            "description": "List of employee types",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "EMP1",
                        "pt_label": "Tipo de Empregado 1",
                        "en_label": "Employee Type 1"
                    }]
                }
            }
        }
    }
)
def get_employee_types(db: Session = Depends(get_db)):
    """
    Get all employee types in the system.
    
    Returns a list of employee types with their IDs and labels in Portuguese and English.
    """
    employee_types = db.query(models.catalogs.EmployeeType).all()
    return employee_types

@router.get('/document_types', 
    response_model=list[schemas.DocumentType], 
    status_code=status.HTTP_200_OK,
    summary="Get all document types",
    description="Retrieves a list of all document types in the system.",
    responses={
        200: {
            "description": "List of document types",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "DOC1",
                        "pt_label": "Tipo de Documento 1",
                        "en_label": "Document Type 1"
                    }]
                }
            }
        }
    }
)
def get_document_types(db: Session = Depends(get_db)):
    """
    Get all document types in the system.
    
    Returns a list of document types with their IDs and labels in Portuguese and English.
    """
    document_types = db.query(models.catalogs.DocumentType).all()
    return document_types

@router.get('/travel_types', 
    response_model=list[schemas.TravelType], 
    status_code=status.HTTP_200_OK,
    summary="Get all travel types",
    description="Retrieves a list of all travel types in the system.",
    responses={
        200: {
            "description": "List of travel types",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "TRAVEL1",
                        "pt_label": "Tipo de Viagem 1",
                        "en_label": "Travel Type 1"
                    }]
                }
            }
        }
    }
)
def get_travel_types(db: Session = Depends(get_db)):
    """
    Get all travel types in the system.
    
    Returns a list of travel types with their IDs and labels in Portuguese and English.
    """
    travel_types = db.query(models.catalogs.TravelType).all()
    return travel_types

@router.get('/expenditure_types', 
    response_model=list[schemas.ExpenditureType], 
    status_code=status.HTTP_200_OK,
    summary="Get all expenditure types",
    description="Retrieves a list of all expenditure types in the system.",
    responses={
        200: {
            "description": "List of expenditure types",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "EXP1",
                        "pt_label": "Tipo de Despesa 1",
                        "en_label": "Expenditure Type 1"
                    }]
                }
            }
        }
    }
)
def get_expenditure_types(db: Session = Depends(get_db)):
    """
    Get all expenditure types in the system.
    
    Returns a list of expenditure types with their IDs and labels in Portuguese and English.
    """
    expenditure_types = db.query(models.catalogs.ExpenditureType).all()
    return expenditure_types
