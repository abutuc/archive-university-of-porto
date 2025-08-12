from sqlalchemy.orm import Session
from .. import models

def seed_system_variables(db: Session):
    db.add(models.system_variable.SystemVariable(
        name="PER_KM_COST",
        type=models.system_variable.VariableTypeEnum.NUMBER,
        value="0.4",
        pt_label="Ajuda de custo KM",
        en_label="KM car per diem"
    ))

    db.add(models.system_variable.SystemVariable(
        name="LOCAL_COST_ALLOWANCE",
        type=models.system_variable.VariableTypeEnum.NUMBER,
        value="14",
        pt_label="Ajuda de custo local",
        en_label="Local per diem"
    ))

    db.add(models.system_variable.SystemVariable(
        name="INTERNATIONAL_COST_ALLOWANCE",
        type=models.system_variable.VariableTypeEnum.NUMBER,
        value="32.5",
        pt_label="Ajuda de custo internacional",
        en_label="International per diem"
    ))
