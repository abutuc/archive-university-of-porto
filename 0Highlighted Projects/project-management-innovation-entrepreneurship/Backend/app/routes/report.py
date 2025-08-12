from fastapi import APIRouter, Depends, HTTPException, UploadFile, File, Form, Request
from sqlalchemy.exc import SQLAlchemyError
import json
from starlette import status
from sqlalchemy.orm import Session
from typing import List, Optional
from ..database import get_db
from ..schemas import report_schema
from ..services import report_service


router = APIRouter(
    prefix='/reports',
    tags=['Reports']
)


@router.get('/all',
    status_code=status.HTTP_200_OK,
    response_model=List[report_schema.ReportSummary],
    summary="Get all reports",
    description="Retrieves a list of all reports with their summary information.",
    responses={
        200: {
            "description": "List of reports retrieved successfully",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "report123",
                        "project_client": "Client A",
                        "description": "Monthly expenses report",
                        "created_at": "2024-03-20T10:00:00",
                        "status": "PENDING",
                        "collaborator_name": "John Doe"
                    }]
                }
            }
        }
    }
)
def get_all_reports(request: Request, db: Session = Depends(get_db)):
    """
    Get a list of all reports with their summary information.
    
    Returns a list of reports containing basic information like ID, project client,
    description, creation date, status, and collaborator name.
    """
    return report_service.get_all_reports(request, db)


@router.post('/', 
    status_code=status.HTTP_201_CREATED,
    summary="Create a new report",
    description="Creates a new report with optional file attachments.",
    responses={
        201: {
            "description": "Report created successfully",
            "content": {
                "application/json": {
                    "example": {
                        "id": "report123",
                        "message": "Report created successfully"
                    }
                }
            }
        },
        400: {
            "description": "Invalid input data",
            "content": {
                "application/json": {
                    "example": {"detail": "Invalid report data format"}
                }
            }
        }
    }
)
def create_full_report(
        request: Request,
        data: str = Form(...),
        files: Optional[List[UploadFile]] = File(None),
        db: Session = Depends(get_db),
):
    """
    Create a new report with optional file attachments.
    
    - **data**: JSON string containing report data (required)
    - **files**: List of files to attach to the report (optional)
    """
    return report_service.create_full_report(request, db, data, files)


@router.get('/monthly-summary',
    response_model=report_schema.MonthlySummaryResponse,
    status_code=status.HTTP_200_OK,
    summary="Get monthly expenditure summary",
    description="Retrieves a summary of expenditures grouped by month.",
    responses={
        200: {
            "description": "Monthly summary retrieved successfully",
            "content": {
                "application/json": {
                    "example": {
                        "2024": [
                            {
                                "year": 2024,
                                "month": 3,
                                "amount": 1500.50
                            }
                        ]
                    }
                }
            }
        }
    }
)
def get_monthly_expenditure_summary(db: Session = Depends(get_db)):
    """
    Get a summary of expenditures grouped by month.
    
    Returns a dictionary where keys are years and values are lists of monthly summaries
    containing the year, month, and total amount for that month.
    """
    return report_service.get_monthly_expenditure_summary(db)


@router.get('/{id}',
    response_model=report_schema.ReportOut,
    status_code=status.HTTP_200_OK,
    summary="Get a report by ID",
    description="Retrieves detailed information about a specific report.",
    responses={
        200: {
            "description": "Report found",
            "content": {
                "application/json": {
                    "example": {
                        "id": "report123",
                        "description": "Monthly expenses report",
                        "status": "PENDING",
                        "company": "Company A",
                        "direction": "North",
                        "unit": "Sales",
                        "office": "Main Office",
                        "name_of_employee": "John Doe",
                        "type_of_employee": "Full-time",
                        "type_of_document": "Expense Report",
                        "project_client": "Client A",
                        "created_at": "2024-03-20T10:00:00",
                        "total_expenditure": 1500.50,
                        "advance_payments": 500.00,
                        "company_payments": 1000.50,
                        "receive_pay": 0.00,
                        "expenses": [],
                        "review": None
                    }
                }
            }
        },
        404: {
            "description": "Report not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Report not found"}
                }
            }
        }
    }
)
def get_report(id: str, db: Session = Depends(get_db)):
    """
    Get detailed information about a specific report.
    
    - **id**: ID of the report to retrieve
    """
    return report_service.get_report_by_id(id, db)


@router.delete('/{id}', 
    status_code=status.HTTP_204_NO_CONTENT,
    summary="Delete a report",
    description="Deletes a specific report and its associated data.",
    responses={
        204: {
            "description": "Report successfully deleted"
        },
        404: {
            "description": "Report not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Report not found"}
                }
            }
        }
    }
)
def delete_report(id: str, db: Session = Depends(get_db)):
    """
    Delete a specific report.
    
    - **id**: ID of the report to delete
    """
    report_service.delete_report(id, db)


@router.put(
    "/{id}",
    status_code=status.HTTP_200_OK,
    summary="Update a report",
    description="Updates an existing report with new data and optional file attachments.",
    responses={
        200: {
            "description": "Report updated successfully",
            "content": {
                "application/json": {
                    "example": {
                        "id": "report123",
                        "message": "Report updated successfully"
                    }
                }
            }
        },
        400: {
            "description": "Invalid input data",
            "content": {
                "application/json": {
                    "example": {"detail": "Invalid report data format"}
                }
            }
        },
        404: {
            "description": "Report not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Report not found"}
                }
            }
        },
        500: {
            "description": "Database error",
            "content": {
                "application/json": {
                    "example": {"detail": "Transaction failed: database error"}
                }
            }
        }
    }
)
def update_full_report(
    id: str,
    request: Request,
    data: str = Form(...),
    files: Optional[List[UploadFile]] = File(None),
    db: Session = Depends(get_db)
):
    """
    Update an existing report with new data and optional file attachments.
    
    - **id**: ID of the report to update
    - **data**: JSON string containing updated report data (required)
    - **files**: List of new files to attach to the report (optional)
    """
    try:
        full_report = report_schema.UpdateFullReport(**json.loads(data))
        with db.begin():
            return report_service.handle_report_data_update_or_create(id,
                                                               full_report,
                                                               db, request,
                                                               files)

    except SQLAlchemyError as e:
        db.rollback()
        raise HTTPException(status_code=500,
                            detail=f"Transaction failed: {str(e)}")
