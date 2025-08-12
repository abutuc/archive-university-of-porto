from fastapi import APIRouter, Depends, Request, HTTPException, status
from sqlalchemy.orm import Session
from typing import List
from uuid import UUID

from ..database import get_db
from ..services import review_service
from ..schemas.review_schema import CreateReview, PatchReview, ReviewOut

router = APIRouter(prefix="/reviews", tags=["Reviews"])


@router.post("/", 
    response_model=ReviewOut,
    status_code=status.HTTP_201_CREATED,
    summary="Create a new review",
    description="Creates a new review for a report. The review can be approved or rejected with optional observations.",
    responses={
        201: {
            "description": "Review successfully created",
            "content": {
                "application/json": {
                    "example": {
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "reviewer_id": "user123",
                        "report_id": "report456",
                        "approved": True,
                        "observations": "This report meets all requirements",
                        "created_at": "2024-03-20T10:00:00",
                        "reviewer": {
                            "id": "user123",
                            "name": "John Doe",
                            "email": "john@example.com",
                            "job_title": "Financial Officer"
                        }
                    }
                }
            }
        },
        400: {
            "description": "Invalid input data",
            "content": {
                "application/json": {
                    "example": {"detail": "Invalid report ID format"}
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
def create_review(request: Request, review: CreateReview,
                  db: Session = Depends(get_db)) -> ReviewOut:
    """
    Create a new review for a report.
    
    - **report_id**: ID of the report to review
    - **approved**: Whether the report is approved (default: False)
    - **observations**: Optional comments about the review
    """
    return review_service.create_review(request, review, db)


@router.patch("/{id}", 
    response_model=ReviewOut,
    summary="Update an existing review",
    description="Updates an existing review's approval status and/or observations.",
    responses={
        200: {
            "description": "Review successfully updated",
            "content": {
                "application/json": {
                    "example": {
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "reviewer_id": "user123",
                        "report_id": "report456",
                        "approved": True,
                        "observations": "Updated observations",
                        "created_at": "2024-03-20T10:00:00",
                        "reviewer": {
                            "id": "user123",
                            "name": "John Doe",
                            "email": "john@example.com",
                            "job_title": "Financial Officer"
                        }
                    }
                }
            }
        },
        404: {
            "description": "Review not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Review not found"}
                }
            }
        }
    }
)
def update_review(id: UUID, review: PatchReview,
                  db: Session = Depends(get_db)) -> ReviewOut:
    """
    Update an existing review.
    
    - **id**: UUID of the review to update
    - **approved**: New approval status (optional)
    - **observations**: New observations (optional)
    """
    return review_service.update_review(id, review, db)


@router.get("/{id}", 
    response_model=ReviewOut,
    summary="Get a review by ID",
    description="Retrieves a specific review by its UUID.",
    responses={
        200: {
            "description": "Review found",
            "content": {
                "application/json": {
                    "example": {
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "reviewer_id": "user123",
                        "report_id": "report456",
                        "approved": True,
                        "observations": "Review observations",
                        "created_at": "2024-03-20T10:00:00",
                        "reviewer": {
                            "id": "user123",
                            "name": "John Doe",
                            "email": "john@example.com",
                            "job_title": "Financial Officer"
                        }
                    }
                }
            }
        },
        404: {
            "description": "Review not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Review not found"}
                }
            }
        }
    }
)
def get_review(id: UUID, db: Session = Depends(get_db)) -> ReviewOut:
    """
    Get a specific review by its ID.
    
    - **id**: UUID of the review to retrieve
    """
    return review_service.get_review_by_id(id, db)


@router.get("/user/{reviewer_id}", 
    response_model=List[ReviewOut],
    summary="Get all reviews from a user",
    description="Retrieves all reviews created by a specific user.",
    responses={
        200: {
            "description": "List of reviews found",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "reviewer_id": "user123",
                        "report_id": "report456",
                        "approved": True,
                        "observations": "Review observations",
                        "created_at": "2024-03-20T10:00:00",
                        "reviewer": {
                            "id": "user123",
                            "name": "John Doe",
                            "email": "john@example.com",
                            "job_title": "Financial Officer"
                        }
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
def get_all_reviews_from_user(reviewer_id: str,
                              db: Session = Depends(get_db)) -> List[ReviewOut]:
    """
    Get all reviews created by a specific user.
    
    - **reviewer_id**: ID of the user whose reviews to retrieve
    """
    return review_service.get_all_reviews_from_user(reviewer_id, db)


@router.delete("/{id}",
    status_code=status.HTTP_200_OK,
    summary="Delete a review",
    description="Deletes a specific review by its UUID.",
    responses={
        200: {
            "description": "Review successfully deleted",
            "content": {
                "application/json": {
                    "example": {"message": "Review deleted"}
                }
            }
        },
        404: {
            "description": "Review not found",
            "content": {
                "application/json": {
                    "example": {"detail": "Review not found"}
                }
            }
        }
    }
)
def delete_review(id: UUID, db: Session = Depends(get_db)):
    """
    Delete a specific review by its ID.
    
    - **id**: UUID of the review to delete
    - Returns a success message
    """
    return review_service.delete_review(id, db)
