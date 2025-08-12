from fastapi import APIRouter, Depends, status
from sqlalchemy.orm import Session
from ..database import get_db
from ..services import notification_service
from ..schemas.notification_schema import NotificationOut
from typing import List

router = APIRouter(prefix="/notifications", tags=["Notifications"])


@router.get("/user/{user_id}/unread", 
    response_model=List[NotificationOut],
    summary="Get unread notifications",
    description="Retrieves all unread notifications for a specific user.",
    responses={
        200: {
            "description": "List of unread notifications",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "user_id": "user123",
                        "report_id": "report456",
                        "is_read": False,
                        "notification_purpose": "REPORT_CREATED",
                        "created_at": "2024-03-20T10:00:00",
                        "report_type": "Expense Report",
                        "report_status": "PENDING",
                        "created_by": "John Doe"
                    }]
                }
            }
        },
        404: {
            "description": "User not found",
            "content": {
                "application/json": {
                    "example": {"detail": "User not found"}
                }
            }
        }
    }
)
def get_unread_notifications_for_user(user_id: str,
                                      db: Session = Depends(get_db)):
    """
    Get all unread notifications for a specific user.
    
    - **user_id**: ID of the user whose unread notifications to retrieve
    
    Returns a list of unread notifications for the specified user.
    """
    return notification_service.get_unread_notifications_for_user(user_id, db)


@router.patch("/{id}/read",
    status_code=status.HTTP_200_OK,
    summary="Mark notification as read",
    description="Marks a specific notification as read.",
    responses={
        200: {
            "description": "Notification marked as read",
            "content": {
                "application/json": {
                    "example": {
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "user_id": "user123",
                        "report_id": "report456",
                        "is_read": True,
                        "notification_purpose": "REPORT_CREATED",
                        "created_at": "2024-03-20T10:00:00",
                        "report_type": "Expense Report",
                        "report_status": "PENDING",
                        "created_by": "John Doe"
                    }
                }
            }
        },
        404: {
            "description": "Notification not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Notification not found"}
                }
            }
        }
    }
)
def mark_notification_as_read(id: str, db: Session = Depends(get_db)):
    """
    Mark a specific notification as read.
    
    - **id**: ID of the notification to mark as read
    
    Returns the updated notification object.
    """
    return notification_service.mark_notification_as_read(id, db)
