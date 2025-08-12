import json
from io import BytesIO
import pytest
from .. import models

# Create the user in the test DB before the test
@pytest.fixture
def setup_user(db_session, mock_user):
    if not db_session.query(models.user.User).get(mock_user["id"]):
        user = models.user.User(
            id=mock_user["id"],
            email=mock_user["email"],
            name=mock_user["name"],
            job_title=mock_user["job_title"]
        )
        db_session.add(user)
        db_session.commit()

@pytest.fixture
def mock_files():
    return [
        ("files", ("receipt1.pdf", BytesIO(b"Test content 1"), "application/pdf")),
        ("files", ("receipt2.pdf", BytesIO(b"Test content 2"), "application/pdf")),
    ]


# Test: Creates a full report and ensures mock user exists
def test_create_full_report_success(client, mock_files, setup_user):
    data = {
        "description": "Test Report",
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
        "expenses": [
            {
                "departure_date": "2023-01-01",
                "departure_time": "08:00",
                "arrival_date": "2023-01-01",
                "arrival_time": "10:00",
                "travel_type": "LOCAL",
                "departure_place": "Porto",
                "meeting_place": "Lisbon",
                "arrival_place": "Lisbon",
                "attachments": [],
                "expenditures": []
            }
        ]
    }

    response = client.post(
        "/reports/",
        data={"data": json.dumps(data)},
        files=mock_files
    )

    assert response.status_code == 201
    assert response.json() == {"message": "Report created successfully"}
