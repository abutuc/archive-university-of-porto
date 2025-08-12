from ..schemas import expenditure_schema as schema
from fastapi import HTTPException
from sqlalchemy.orm import Session
from uuid import UUID
from starlette import status
from .. import models


def update_expenditure(
    expenditure_data: schema.UpdateExpenditure,
    db: Session,
):
    """
    Update an expenditure in the database.
    """

    expenditure = (
        db.query(models.expenditure.Expenditure)
        .filter(models.expenditure.Expenditure.id == expenditure_data.id)
        .first()
    )

    if expenditure is None:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail="The expenditure was not found",
        )

    for key, value in expenditure_data.dict().items():
        setattr(expenditure, key, value)


def create_expenditure(
    expenditure_data: schema.UpdateExpenditure,
    db: Session
):
    """
    Post an expenditure in the database.
    """
    new_expenditure = models.expenditure.Expenditure(**expenditure_data.dict())
    db.add(new_expenditure)


def delete_expenditure(
    expenditure_id: UUID,
    db: Session,
):
    """
    Delete an expenditure in the database.
    """
    expenditure = (
        db.query(models.expenditure.Expenditure)
        .filter(models.expenditure.Expenditure.id == expenditure_id)
        .first()
    )

    if expenditure is None:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail="The expenditure was not found",
        )

    db.delete(expenditure)
