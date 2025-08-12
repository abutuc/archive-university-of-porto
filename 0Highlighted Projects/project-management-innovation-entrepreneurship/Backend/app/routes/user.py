from fastapi import APIRouter, Depends, Request, HTTPException
from starlette import status
from ..schemas import user_schema
from sqlalchemy.orm import Session
from ..database import get_db
from .. import models

router = APIRouter(
    prefix='/user',
    tags=['Reports']
)

@router.get('/me',
    status_code=status.HTTP_200_OK,
    response_model=user_schema.UserOut,
    summary="Get user information.",
    description="Get the user object of the invoking user.",
    responses={
        200: {
            "description": "User object retrieved successfully",
            "content": {
                "application/json": {
                    "example": [{
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "email": "jane.doe@example.com",
                        "name": "Jane Doe",
                        "job_title": "Software Engineer",
                        "company": "Example Corp",
                        "direction": "Engineering",
                        "unit": "Backend Team",
                        "office": "New York",
                        "type_of_employee": "Full-time"
                    }]
                }
            }
        }
    }
)
def get_user(request: Request, db: Session = Depends(get_db)):
    user = db.query(models.user.User).filter(models.user.User.id == request.state.user["id"]).first()

    if user is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND,
                            detail=f"The user with id: {id} does not exist")
    
    return user


@router.put(
    '/me',
    status_code=status.HTTP_200_OK,
    response_model=user_schema.UserOut,
    summary="Update user fields.",
    description="Update company, direction, unit, office, and type_of_employee for the authenticated user.",
    responses={
        200: {
            "description": "User updated successfully",
            "content": {
                "application/json": {
                    "example": {
                        "id": "123e4567-e89b-12d3-a456-426614174000",
                        "email": "jane.doe@example.com",
                        "name": "Jane Doe",
                        "job_title": "Software Engineer",
                        "company": "Updated Corp",
                        "direction": "New Direction",
                        "unit": "Updated Unit",
                        "office": "Remote",
                        "type_of_employee": "Contractor"
                    }
                }
            }
        }
    }
)
def update_user(
    request: Request,
    payload: user_schema.UserUpdate,
    db: Session = Depends(get_db)
):
    user = db.query(models.user.User).filter(models.user.User.id == request.state.user["id"]).first()

    if user is None:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail=f"The user does not exist"
        )

    for field, value in payload.dict(exclude_unset=True).items():
        setattr(user, field, value)

    db.commit()
    db.refresh(user)
    return user