from unittest.mock import MagicMock
from fastapi.testclient import TestClient
from app import models
import json

mock_fo_user = MagicMock(id="fo_user_id_1", email="fo@example.com")

def create_mock_orm_instance(data_dict):
    instance = MagicMock()
    for key, value in data_dict.items():
        setattr(instance, key, value)
    if 'status' in data_dict:
        instance.status = data_dict['status']
    return instance

def test_create_report(client: TestClient, seeded_db_session):
    report_payload = {
        "description": "Test Report",
        "company": "INOVA+",  # INOVA+
        "direction": "DIRECTION_OF_POLICIES",  # Direction of Policies
        "unit": "DIGITAL",  # Digital
        "office": "PORTO",  # Porto
        "type_of_employee": "ADMINISTRATOR",  # Administrator
        "type_of_document": "EXPENSE_REPORT",  # Expense Report
        "project_client": "Client Test",
        "total_expenditure": 500.0,
        "advance_payments": 100.0,
        "company_payments": 300.0,
        "receive_pay": 100.0,
        "expenses": []
    }

    response = client.post(
        "/reports/",
        data={"data": json.dumps(report_payload)}
    )

    assert response.status_code == 201
    data = response.json()
    assert data["message"] == "Report created successfully"

def test_get_report(client: TestClient, seeded_db_session):
    # First create a report
    report_payload = {
        "description": "Test Report for Get",
        "company": "INOVA+",
        "direction": "DIRECTION_OF_POLICIES",
        "unit": "DIGITAL",
        "office": "PORTO",
        "type_of_employee": "ADMINISTRATOR",
        "type_of_document": "EXPENSE_REPORT",
        "project_client": "Client Test",
        "total_expenditure": 500.0,
        "advance_payments": 100.0,
        "company_payments": 300.0,
        "receive_pay": 100.0,
        "expenses": []
    }

    create_response = client.post(
        "/reports/",
        data={"data": json.dumps(report_payload)}
    )
    assert create_response.status_code == 201

    # Get all reports and find the one we just created
    reports = client.get("/reports/all").json()
    created_report = next((r for r in reports if r["description"] == "Test Report for Get"), None)
    assert created_report is not None

    # Get the specific report
    get_response = client.get(f"/reports/{created_report['id']}")
    assert get_response.status_code == 200
    report_data = get_response.json()
    assert report_data["description"] == "Test Report for Get"

def test_update_report(client: TestClient, seeded_db_session):
    # First create a report
    report_payload = {
        "description": "Test Report for Update",
        "company": "INOVA+",
        "direction": "DIRECTION_OF_POLICIES",
        "unit": "DIGITAL",
        "office": "PORTO",
        "type_of_employee": "ADMINISTRATOR",
        "type_of_document": "EXPENSE_REPORT",
        "project_client": "Client Test",
        "total_expenditure": 500.0,
        "advance_payments": 100.0,
        "company_payments": 300.0,
        "receive_pay": 100.0,
        "expenses": []
    }

    create_response = client.post(
        "/reports/",
        data={"data": json.dumps(report_payload)}
    )
    assert create_response.status_code == 201
    seeded_db_session.commit()  # Commit after creating the report

    # Get all reports and find the one we just created
    reports = client.get("/reports/all").json()
    created_report = next((r for r in reports if r["description"] == "Test Report for Update"), None)
    assert created_report is not None

    # Get the full report details to access all fields
    get_response = client.get(f"/reports/{created_report['id']}")
    assert get_response.status_code == 200
    full_report = get_response.json()

    # Set the report status to JUSTIFICATION_CORRECTION_REQUIRED
    report = seeded_db_session.query(models.report.Report).filter(models.report.Report.id == created_report['id']).first()
    report.status = models.report.StatusEnum.JUSTIFICATION_CORRECTION_REQUIRED
    seeded_db_session.commit()

    # Update the report
    update_payload = {
        "description": "Updated Test Report",
        "project_client": "Updated Client",
        "company": full_report["company"],
        "direction": full_report["direction"],
        "unit": full_report["unit"],
        "office": full_report["office"],
        "type_of_employee": full_report["type_of_employee"],
        "type_of_document": full_report["type_of_document"],
        "total_expenditure": full_report["total_expenditure"],
        "advance_payments": full_report["advance_payments"],
        "company_payments": full_report["company_payments"],
        "receive_pay": full_report["receive_pay"],
        "expenses": []
    }

    seeded_db_session.commit()  # Commit any pending transactions before update

    update_response = client.put(
        f"/reports/{created_report['id']}",
        data={"data": json.dumps(update_payload)}
    )

    if update_response.status_code != 200:
        print("\nUpdate Response Error:")
        print(f"Status Code: {update_response.status_code}")
        print(f"Response Body: {update_response.json()}")
        print(f"Update Payload: {json.dumps(update_payload, indent=2)}")
        print(f"Full Report: {json.dumps(full_report, indent=2)}")

    assert update_response.status_code == 200
    updated_data = update_response.json()
    assert updated_data["message"] == "Report updated successfully"

def test_delete_report(client: TestClient, seeded_db_session):
    # First create a report
    report_payload = {
        "description": "Test Report for Delete",
        "company": "INOVA+",
        "direction": "DIRECTION_OF_POLICIES",
        "unit": "DIGITAL",
        "office": "PORTO",
        "type_of_employee": "ADMINISTRATOR",
        "type_of_document": "EXPENSE_REPORT",
        "project_client": "Client Test",
        "total_expenditure": 500.0,
        "advance_payments": 100.0,
        "company_payments": 300.0,
        "receive_pay": 100.0,
        "expenses": []
    }

    create_response = client.post(
        "/reports/",
        data={"data": json.dumps(report_payload)}
    )
    assert create_response.status_code == 201

    # Get all reports and find the one we just created
    reports = client.get("/reports/all").json()
    created_report = next((r for r in reports if r["description"] == "Test Report for Delete"), None)
    assert created_report is not None

    # Delete the report
    delete_response = client.delete(f"/reports/{created_report['id']}")
    assert delete_response.status_code == 204

    # Verify the report is deleted
    get_response = client.get(f"/reports/{created_report['id']}")
    assert get_response.status_code == 404

def test_get_monthly_summary(client: TestClient):
    response = client.get("/reports/monthly-summary")
    assert response.status_code == 200

    data = response.json()
    assert isinstance(data, dict)

    for key, items in data.items():
        assert isinstance(key, str)
        assert isinstance(items, list)
        for item in items:
            assert "year" in item and isinstance(item["year"], int)
            assert "month" in item and isinstance(item["month"], int)
            assert "amount" in item and isinstance(item["amount"], float)
