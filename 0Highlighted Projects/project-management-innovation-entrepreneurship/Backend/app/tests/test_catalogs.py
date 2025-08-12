import pytest
from .. import models


# Use the shared mock_user from conftest.py
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

# Helper function to test catalog endpoints
def endpointCaller(client, endpoint, expected_label):
    response = client.get(endpoint)
    assert response.status_code == 200
    assert any(item["en_label"] == expected_label for item in response.json())

# Test cases for catalog endpoints
def test_get_companies(client):
    endpointCaller(client, "/catalogs/companies", "INOVA+")

def test_get_directions(client):
    endpointCaller(client, "/catalogs/directions", "Administration")

def test_get_units(client):
    endpointCaller(client, "/catalogs/units", "AI Lab")

def test_get_offices(client):
    endpointCaller(client, "/catalogs/offices", "Lisbon")

def test_get_employee_types(client):
    endpointCaller(client, "/catalogs/employee_types", "Administrator")

def test_get_document_types(client):
    endpointCaller(client, "/catalogs/document_types", "Expense Report")

def test_get_travel_types(client):
    endpointCaller(client, "/catalogs/travel_types", "International")

def test_get_expenditure_types(client):
    endpointCaller(client, "/catalogs/expenditure_types", "Accommodation")
