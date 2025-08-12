import os
from uuid import UUID
from fastapi import APIRouter, Depends, HTTPException
from starlette import status
from starlette.responses import FileResponse
from sqlalchemy.orm import Session

from ..database import get_db
from .. import models
from ..util.files_helper import BASE_STORAGE_PATH

router = APIRouter(
    prefix='/attachments',
    tags=['Attachments']
)

@router.get("/{attachment_id}/download",
    summary="Download an attachment",
    description="Downloads a file attachment by its ID. The file will be returned as a downloadable attachment.",
    responses={
        200: {
            "description": "File attachment",
            "content": {
                "application/octet-stream": {
                    "schema": {
                        "type": "string",
                        "format": "binary"
                    }
                }
            }
        },
        400: {
            "description": "Invalid file path",
            "content": {
                "application/json": {
                    "example": {"detail": "Invalid file path component."}
                }
            }
        },
        404: {
            "description": "Attachment not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Attachment with id 123e4567-e89b-12d3-a456-426614174000 not found."}
                }
            }
        }
    }
)
async def download_attachment_simple(
    attachment_id: UUID,
    db: Session = Depends(get_db)
):
    """
    Download a file attachment by its ID.
    
    - **attachment_id**: UUID of the attachment to download
    
    Returns the file as a downloadable attachment. The file will be served with the
    original filename and as an octet-stream.
    
    Raises:
    - 400 Bad Request: If the file path is invalid or contains path traversal attempts
    - 404 Not Found: If the attachment doesn't exist in the database or the file is missing
    """
    attachment = db.query(models.attachment.Attachment)\
        .filter(models.attachment.Attachment.id == attachment_id)\
        .first()

    if not attachment:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail=f"Attachment with id {attachment_id} not found."
        )

    if ".." in attachment.file_path.split(os.path.sep):
         raise HTTPException(
            status_code=status.HTTP_400_BAD_REQUEST,
            detail="Invalid file path component."
        )

    if os.path.isabs(attachment.file_path):
         raise HTTPException(
            status_code=status.HTTP_400_BAD_REQUEST,
            detail="Invalid absolute file path stored."
        )


    full_file_path = os.path.abspath(os.path.join(BASE_STORAGE_PATH, attachment.file_path))

    resolved_base = os.path.abspath(BASE_STORAGE_PATH)
    if not full_file_path.startswith(resolved_base):
        print(f"SECURITY ALERT: Attempted path traversal for attachment {attachment_id}. Path: {full_file_path}, Base: {resolved_base}")
        raise HTTPException(
            status_code=status.HTTP_400_BAD_REQUEST,
            detail="Calculated file path is outside the allowed directory."
        )


    if not os.path.isfile(full_file_path):
        print(f"ERROR: File not found on disk for attachment {attachment_id}: {full_file_path}")
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail="Attachment file not found on server."
        )

    return FileResponse(
        path=full_file_path,
        filename=attachment.file_name,
        media_type='application/octet-stream'
    )