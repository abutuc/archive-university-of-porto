from ..models.system_variable import SystemVariable
from sqlalchemy.orm import Session

def get_system_variables(db: Session):
    system_variables = db.query(SystemVariable).all()
    return system_variables


def update_system_variables(db: Session, updates):
    for item in updates:
        db_var = db.query(SystemVariable).filter(SystemVariable.name == item.name).first()
        if db_var and db_var.value != item.value:
            db_var.value = item.value
    db.commit()
    return {"message": "System variables updated successfully!"}