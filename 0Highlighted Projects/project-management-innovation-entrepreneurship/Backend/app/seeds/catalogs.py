from sqlalchemy.orm import Session
from .. import models

def seed_companies(db: Session):
    seed_data = [
        {"id": "INOVA+", "pt_label": "INOVA+", "en_label": "INOVA+"},
        {"id": "MENTORTEC", "pt_label": "MentorTec", "en_label": "MentorTec"},
        {"id": "INNCREASE_PL", "pt_label": "Inncrease PL", "en_label": "Inncrease PL"},
        {"id": "BRUSSELS_BRANCH", "pt_label": "Sucursal Bruxelas", "en_label": "Brussels Branch"},
        {"id": "GERMANY_BRANCH", "pt_label": "Sucursal Alemanha", "en_label": "Germany Branch"},
    ]
    for company in seed_data:
        if not db.query(models.catalogs.Company).filter_by(id=company["id"]).first():
            db.add(models.catalogs.Company(**company))

def seed_directions(db: Session):
    seed_data = [
        {"id": "ADMINISTRATION", "pt_label": "Administração", "en_label": "Administration"},
        {"id": "DIRECTION_OF_CONSULTANCY", "pt_label": "Direção de Consultadoria", "en_label": "Direction of Consultancy"},
        {"id": "DIRECTION_OF_PARTNERSHIPS", "pt_label": "Direção de Parcerias", "en_label": "Direction of Partnerships"},
        {"id": "DIRECTION_OF_POLICIES", "pt_label": "Direção de Políticas", "en_label": "Direction of Policies"},
        {"id": "ECOSYSTEM_HUB", "pt_label": "Hub de Ecossistema", "en_label": "Ecosystem Hub"},
        {"id": "EUROPEAN_UNION_HUB", "pt_label": "Hub da União Europeia", "en_label": "European Union Hub"},
    ]
    for direction in seed_data:
        if not db.query(models.catalogs.Direction).filter_by(id=direction["id"]).first():
            db.add(models.catalogs.Direction(**direction))

def seed_units(db: Session):
    seed_data = [      
        {"id": "NA", "pt_label": "N.A.", "en_label": "N.A."},
        {"id": "AI_LAB", "pt_label": "Laboratório de IA", "en_label": "AI Lab"},
        {"id": "DIGITAL", "pt_label": "Digital", "en_label": "Digital"},
    ]
    for unit in seed_data:
        if not db.query(models.catalogs.Unit).filter_by(id=unit["id"]).first():
            db.add(models.catalogs.Unit(**unit))

def seed_offices(db: Session):
    seed_data = [
        {"id": "LISBON", "pt_label": "Lisboa", "en_label": "Lisbon"},
        {"id": "PORTO", "pt_label": "Porto", "en_label": "Porto"},
        {"id": "FUNDAO", "pt_label": "Fundão", "en_label": "Fundão"},
        {"id": "MENTORTEC", "pt_label": "MentorTec", "en_label": "MentorTec"},
        {"id": "BELGIUM", "pt_label": "Belgíca", "en_label": "Belgium"},
        {"id": "GERMANY", "pt_label": "Alemanha", "en_label": "Germany"},
        {"id": "POLAND", "pt_label": "Polónia", "en_label": "Poland"},
    ]
    for office in seed_data:
        if not db.query(models.catalogs.Office).filter_by(id=office["id"]).first():
            db.add(models.catalogs.Office(**office))

def seed_employee_types(db: Session):
    seed_data = [
        {"id": "ADMINISTRATOR", "pt_label": "Administrador", "en_label": "Administrator"},
        {"id": "OTHER", "pt_label": "Outro", "en_label": "Other"},
    ]
    for employee_type in seed_data:
        if not db.query(models.catalogs.EmployeeType).filter_by(id=employee_type["id"]).first():
            db.add(models.catalogs.EmployeeType(**employee_type))

def seed_document_types(db: Session):
    seed_data = [
        {"id": "ADVANCE_REQUEST", "pt_label": "Pedido de Adiantamento", "en_label": "Advance Request"},
        {"id": "VALIDATION_REQUEST", "pt_label": "Pedido de Validação", "en_label": "Validation Request"},
        {"id": "EXPENSE_REPORT", "pt_label": "Relatório de Despesa", "en_label": "Expense Report"},
    ]
    for document_type in seed_data:
        if not db.query(models.catalogs.DocumentType).filter_by(id=document_type["id"]).first():
            db.add(models.catalogs.DocumentType(**document_type))

def seed_travel_types(db: Session):
    seed_data = [
        {"id": "LOCAL", "pt_label": "Local", "en_label": "Local"},
        {"id": "INTERNATIONAL", "pt_label": "Internacional", "en_label": "International"},
    ]
    for travel_type in seed_data:
        if not db.query(models.catalogs.TravelType).filter_by(id=travel_type["id"]).first():
            db.add(models.catalogs.TravelType(**travel_type))

def seed_expenditure_types(db: Session):
    seed_data = [
        {"id": "CAR", "pt_label": "Carro", "en_label": "Car"},
        {"id": "AIRPLANE", "pt_label": "Avião", "en_label": "Airplane"},
        {"id": "OTHER_TRANSPORTS", "pt_label": "Outros Transportes", "en_label": "Other Transports"},
        {"id": "ACCOMODATION", "pt_label": "Alojamento", "en_label": "Accommodation"},
        {"id": "OTHER", "pt_label": "Outros", "en_label": "Others"},
    ]
    for expenditure_type in seed_data:
        if not db.query(models.catalogs.ExpenditureType).filter_by(id=expenditure_type["id"]).first():
            db.add(models.catalogs.ExpenditureType(**expenditure_type))

def seed_all_catalogs(db: Session):
    seed_companies(db)
    seed_directions(db)
    seed_units(db)
    seed_offices(db)
    seed_employee_types(db)
    seed_document_types(db)
    seed_travel_types(db)
    seed_expenditure_types(db)
