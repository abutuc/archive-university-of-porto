import pytest
from fastapi.testclient import TestClient
from app.main import app
from app.database import Base
from app.models.notification import NotificationPurposeEnum
from app.models.report import StatusEnum
from app.utils.notification_utils import create_notification
import json

client = TestClient(app)
client.headers.update({
    "Authorization": "Bearer mock-token"
})

# Helper function to create a test report
def create_test_report(client, status=StatusEnum.PENDING_FO_REVIEW):
    report_payload = {
        "description": "Notification Test Report",
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

    # Get the created report
    reports = client.get("/reports/all").json()
    report = next((r for r in reports if r["description"] == "Notification Test Report"), None)
    assert report is not None

    return report

def test_create_notification(client, seeded_db_session, mock_user):
    report = create_test_report(client)

    # Create notification using the utility function directly
    notification = create_notification(
        report_id=report["id"],
        user_id=mock_user["id"],
        triggered_by_user_id=mock_user["id"],  # In test case, triggered by same user
        notification_purpose=NotificationPurposeEnum.WAITING_FOR_REVIEW,
        db=seeded_db_session
    )

    # Verify the notification was created correctly
    assert notification.user_id == mock_user["id"]
    assert str(notification.report_id) == report["id"]  # Convert UUID to string for comparison
    assert notification.notification_purpose == NotificationPurposeEnum.WAITING_FOR_REVIEW
    assert not notification.is_read
    assert notification.created_at is not None

    # Verify we can retrieve it through the API
    response = client.get(f"/notifications/user/{mock_user['id']}/unread")
    assert response.status_code == 200
    notifications = response.json()
    assert len(notifications) > 0
    created_notification = next((n for n in notifications if n["report_id"] == report["id"]), None)
    assert created_notification is not None
    assert created_notification["notification_purpose"] == NotificationPurposeEnum.WAITING_FOR_REVIEW.value

def test_get_unread_notifications(client, seeded_db_session, mock_user):
    report = create_test_report(client)

    # Create notification using utility function
    notification = create_notification(
        report_id=report["id"],
        user_id=mock_user["id"],
        triggered_by_user_id=mock_user["id"],
        notification_purpose=NotificationPurposeEnum.WAITING_FOR_REVIEW,
        db=seeded_db_session
    )

    # Get unread notifications
    response = client.get(f"/notifications/user/{mock_user['id']}/unread")

    assert response.status_code == 200
    data = response.json()
    assert isinstance(data, list)
    assert any(n["report_id"] == str(report["id"]) for n in data)
    assert any(n["notification_purpose"] == NotificationPurposeEnum.WAITING_FOR_REVIEW.value for n in data)

def test_mark_notification_as_read(client, seeded_db_session, mock_user):
    report = create_test_report(client)
    
    # Create notification using utility function
    notification = create_notification(
        report_id=report["id"],
        user_id=mock_user["id"],
        triggered_by_user_id=mock_user["id"],
        notification_purpose=NotificationPurposeEnum.WAITING_FOR_REVIEW,
        db=seeded_db_session
    )

    # Mark as read
    response = client.patch(f"/notifications/{notification.id}/read")
    assert response.status_code == 200
    assert response.json()["message"] == "Notification marked as read"

    # Verify it's marked as read
    unread_response = client.get(f"/notifications/user/{mock_user['id']}/unread")
    assert unread_response.status_code == 200
    unread_notifications = unread_response.json()
    assert not any(n["id"] == str(notification.id) for n in unread_notifications)
