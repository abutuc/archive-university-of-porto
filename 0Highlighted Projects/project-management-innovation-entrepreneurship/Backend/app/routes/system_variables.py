from fastapi import APIRouter, Depends, status
from sqlalchemy.orm import Session
from ..database import get_db
from ..services import system_variables_service
from ..schemas.system_variable_schema import SystemVariableOut
from typing import List

router = APIRouter(prefix="/system-variables", tags=["System Variables"])

@router.get("/", 
    response_model=List[SystemVariableOut],
    summary="Get system variables",
    description="Retrieves all system variables and their current values.",
    responses={
        200: {
            "description": "List of system variables",
            "content": {
                "application/json": {
                    "example": [{
                        "name": "MAX_FILE_SIZE",
                        "type": "NUMBER",
                        "value": "10485760",
                        "pt_label": "Tamanho máximo do ficheiro",
                        "en_label": "Maximum file size"
                    }]
                }
            }
        }
    }
)
def get_system_variablles(db: Session = Depends(get_db)):
    """
    Get all system variables and their current values.
    
    Returns a list of system variables with their names, types, values, and labels in Portuguese and English.
    """
    return system_variables_service.get_system_variables(db)

@router.put("/",
    status_code=status.HTTP_200_OK,
    summary="Update system variables",
    description="Updates multiple system variables with new values.",
    responses={
        200: {
            "description": "System variables updated successfully",
            "content": {
                "application/json": {
                    "example": {
                        "message": "System variables updated successfully",
                        "updated_variables": [{
                            "name": "MAX_FILE_SIZE",
                            "type": "NUMBER",
                            "value": "20971520",
                            "pt_label": "Tamanho máximo do ficheiro",
                            "en_label": "Maximum file size"
                        }]
                    }
                }
            }
        },
        400: {
            "description": "Invalid variable values",
            "content": {
                "application/json": {
                    "example": {"detail": "Invalid value for MAX_FILE_SIZE"}
                }
            }
        }
    }
)
def update_system_variables(updates: List[SystemVariableOut],  db: Session = Depends(get_db)):
    """
    Update multiple system variables with new values.
    
    - **updates**: List of system variables to update with their new values
    
    Returns a success message and the list of updated variables with their types and labels.
    """
    return system_variables_service.update_system_variables(db, updates)
