from app.utils.notification_utils import notify_reviewer, create_notification
from app.models.notification import NotificationPurposeEnum
from app.models.notification import Notification
from app.models.report import Report, StatusEnum
from app.database import get_db
from fastapi.testclient import TestClient
from app.main import app
from app.tests.utils.test_helpers import create_test_user
import pytest


client = TestClient(app)


@pytest.fixture
def test_db():
    db = next(get_db())
    #inserir user na db diretamente
    yield db
    db.close()

def create_test_report(db, user):
    """Create a test report for the given user."""
    report = Report(
        id="test_report_id",
        description="Report for Notification Test",
        status=StatusEnum.PENDING_FO_REVIEW,
        company="INOVA+",
        direction="DIRECTION_OF_POLICIES",
        unit="DIGITAL",
        office="PORTO",
        user_id=user.id,
        type_of_employee="ADMINISTRATOR",
        type_of_document="EXPENSE_REPORT",
        project_client="Client Test",
        total_expenditure=0,
        advance_payments=0,
        company_payments=0,
        receive_pay=0
    )
    db.add(report)
    db.commit()
    return report

def create_test_report_2(db, user):
    """Create a test report for the given user."""
    report = Report(
        id="test_report_id_2",
        description="Report for Notification Test",
        status=StatusEnum.PENDING_FO_REVIEW,
        company="INOVA+",
        direction="DIRECTION_OF_POLICIES",
        unit="DIGITAL",
        office="PORTO",
        user_id=user.id,
        type_of_employee="ADMINISTRATOR",
        type_of_document="EXPENSE_REPORT",
        project_client="Client Test",
        total_expenditure=0,
        advance_payments=0,
        company_payments=0,
        receive_pay=0
    )
    db.add(report)
    db.commit()
    return report

def test_notify_reviewer_creates_notification(test_db):
    user = create_test_user(test_db, user_id="reviewer123")
    report = create_test_report(test_db, user)

    notification = notify_reviewer(report_id=report.id, user_id=user.id, triggered_by_user_id=user.id, db=test_db)

    assert isinstance(notification, Notification)
    assert notification.report_id == report.id
    assert notification.user_id == user.id
    assert notification.triggered_by_user_id == user.id
    assert notification.notification_purpose == NotificationPurposeEnum.WAITING_FOR_REVIEW
    assert not notification.is_read
    assert notification.id is not None

def test_create_notification_explicit_purpose(test_db):
    user = create_test_user(test_db, user_id="reviewer456")
    report = create_test_report_2(test_db, user) # Need to do this in order to not have duplicate report ids

    notification = create_notification(
        report_id=report.id,
        user_id=user.id,
        triggered_by_user_id=user.id,
        notification_purpose=NotificationPurposeEnum.APPROVED,
        db=test_db
    )

    assert notification.notification_purpose == NotificationPurposeEnum.APPROVED
    assert notification.user_id == user.id
    assert notification.report_id == report.id
    assert not notification.is_read
