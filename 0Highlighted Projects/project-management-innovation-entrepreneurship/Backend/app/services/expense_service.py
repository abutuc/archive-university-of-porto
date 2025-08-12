from ..schemas import expense_schema as schema
from ..database import get_db
from fastapi import Depends, HTTPException
from sqlalchemy.orm import Session
from starlette import status
from .. import models
from fastapi.encoders import jsonable_encoder
from uuid import UUID


def update_expense(
    expense: schema.UpdateExpense,
    db: Session = Depends(get_db)
):
    """
    Update an expense in the database.
    """

    existing_expense = (
        db.query(models.expense.Expense)
        .filter(models.expense.Expense.id == expense.id).first()
    )

    if existing_expense is None:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail=f"The expense with id: {id} does not exist",
        )

    expense_data = expense.dict(exclude={"expenditures", "attachments"})

    for key, value in expense_data.items():
        setattr(existing_expense, key, value)

    db.flush()
    return jsonable_encoder(existing_expense, exclude={"expenditures", "attachments"})


def create_expense(
    expense: schema.CreateExpense,
    db: Session = Depends(get_db)
):
    """
    Create an expense in the database.
    """

    expense_data = expense.dict(exclude={"expenditures", "attachments"})

    new_expense = models.expense.Expense(**expense_data)

    db.add(new_expense)
    db.flush()
    db.refresh(new_expense)
    return jsonable_encoder(new_expense, exclude={"expenditures", "attachments"})


def delete_expense(
    expense_id: UUID,
    db: Session = Depends(get_db)
):
    """
    Delete an expense in the database.
    """

    expense = (
        db.query(models.expense.Expense)
        .filter(models.expense.Expense.id == expense_id).first()
    )

    if expense is None:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND,
            detail=f"The expense with id: {expense_id} does not exist",
        )

    db.delete(expense)
