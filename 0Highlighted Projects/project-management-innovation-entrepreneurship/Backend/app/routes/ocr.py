from fastapi import APIRouter, UploadFile, File, status
from fastapi import UploadFile
from typing import List, Optional
from ..services import ocr_service

router = APIRouter(prefix="/ocr", tags=["OCR Implementation"])

@router.post("/process-receipts",
    status_code=status.HTTP_200_OK,
    summary="Process receipt images",
    description="Processes uploaded receipt images using OCR to extract expenditure information. Only PNG and JPEG images are supported - other file types will be silently ignored.",
    responses={
        200: {
            "description": "List of extracted expenditures",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "expense_id": "123e4567-e89b-12d3-a456-426614174001",
                        "expenditure_type": "Office Supplies",
                        "car_type": None,
                        "license_plate": None,
                        "km_travelled": None,
                        "fuel": None,
                        "parking_tolls": None,
                        "value": 150.50,
                        "created_at": "2024-03-20T10:00:00"
                    }]
                }
            }
        }
    }
)
async def upload_receipt(files: Optional[List[UploadFile]] = File(None),):
    """
    Process receipt images using OCR to extract expenditure information.
    
    - **files**: List of receipt images to process (optional)
    
    Returns a list of extracted expenditures from the processed receipts.
    Only PNG and JPEG images are supported - other file types will be silently ignored.
    """
    if not files:
        return []
    
    expenditures = []
    for file in files:
        if file.content_type not in ("image/png", "image/jpeg"):
            continue
        
        expenditure = await ocr_service.extract_expenditure(file)
        if expenditure:
            expenditures.append(expenditure)
    
    return expenditures