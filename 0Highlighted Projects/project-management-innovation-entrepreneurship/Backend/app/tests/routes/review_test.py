import pytest
from fastapi.testclient import TestClient
from app.models.user import User
from app.main import app
from app.models.report import StatusEnum
from app.routes.report import router  # Import the router you're using for reports
from types import SimpleNamespace
import json

# Your test client and fixtures
client = TestClient(app)

# ---------- Helper Functions ----------
def create_reviewer_user(db_session, reviewer_id):
    reviewer = User(
        id=reviewer_id,
        email=f"{reviewer_id}@example.com",
        name="Financial Officer",
        job_title="Financial Officer"
    )
    db_session.add(reviewer)
    db_session.commit()
    return reviewer

# Helper function to create a test report
def create_test_report(client, status=StatusEnum.PENDING_FO_REVIEW, type_of_document="Expense Report"):
    report_payload = {
        "description": "Review Test Report",
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

    # Convert to Form data format
    response = client.post(
        "/reports/",
        data={
            'data': json.dumps(report_payload)
        }
    )

    assert response.status_code == 201

    # Get the created report
    reports = client.get("/reports/all").json()
    report = next((r for r in reports if r["description"] == "Review Test Report"), None)
    assert report is not None

    # Simulate update of status if needed
    if report["status"] != status:
        patch_response = client.put(f"/reports/{report['id']}",
                                    data={'data': json.dumps({"status": status})})
        assert patch_response.status_code == 200
        report["status"] = status

    return report

# Helper function to create a review
def create_review(client, reviewer_id, report_id, approved=True, observations="All looks good"):
    payload = {
        "reviewer_id": reviewer_id,
        "report_id": report_id,
        "approved": approved,
        "observations": observations
    }
    response = client.post("/reviews/", json=payload)
    assert response.status_code == 201
    return response.json()

# ---------- Test Cases ----------
# Test case: create a review
def test_create_review(client, mock_user, seeded_db_session):
    reviewer_id = mock_user["id"]  # Use the mock user's ID
    create_reviewer_user(seeded_db_session, reviewer_id)

    report = create_test_report(client, status=StatusEnum.PENDING_FO_REVIEW)
    review_data = create_review(client, reviewer_id, report["id"])

    assert review_data["reviewer_id"] == reviewer_id
    assert review_data["report_id"] == report["id"]
    assert review_data["approved"] is True
    assert review_data["observations"] == "All looks good"
    assert "created_at" in review_data

# Test case: update a review
def test_update_review(client, mock_user, seeded_db_session):
    reviewer_id = mock_user["id"]  # Use the mock user's ID
    create_reviewer_user(seeded_db_session, reviewer_id)

    report = create_test_report(client)
    review_data = create_review(client, reviewer_id, report["id"], approved=False)

    patch_resp = client.patch(f"/reviews/{review_data['id']}", json={"approved": True})
    assert patch_resp.status_code == 200
    assert patch_resp.json()["approved"] is True

# Test case: get review by ID
def test_get_review_by_id(client, mock_user, seeded_db_session):
    reviewer_id = mock_user["id"]  # Use the mock user's ID
    create_reviewer_user(seeded_db_session, reviewer_id)

    report = create_test_report(client)
    review_data = create_review(client, reviewer_id, report["id"])

    get_resp = client.get(f"/reviews/{review_data['id']}")
    assert get_resp.status_code == 200
    assert get_resp.json()["id"] == review_data["id"]

# Test case: get reviews for a user
def test_get_reviews_for_user(client, mock_user, seeded_db_session):
    reviewer_id = mock_user["id"]  # Use the mock user's ID
    create_reviewer_user(seeded_db_session, reviewer_id)

    report = create_test_report(client)
    create_review(client, reviewer_id, report["id"])

    response = client.get(f"/reviews/user/{reviewer_id}")
    assert response.status_code == 200
    data = response.json()
    assert isinstance(data, list)
    assert any(r["reviewer_id"] == reviewer_id for r in data)

# Test case: delete review
def test_delete_review(client, mock_user, seeded_db_session):
    reviewer_id = mock_user["id"]  # Use the mock user's ID
    create_reviewer_user(seeded_db_session, reviewer_id)

    report = create_test_report(client)
    review_data = create_review(client, reviewer_id, report["id"], approved=False)

    delete_resp = client.delete(f"/reviews/{review_data['id']}")
    assert delete_resp.status_code == 200
    assert delete_resp.json()["message"] == "Review deleted"

    # Try getting the deleted review
    followup = client.get(f"/reviews/{review_data['id']}")
    assert followup.status_code == 404
