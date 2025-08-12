import os
import pytest
from fastapi import FastAPI
from fastapi.testclient import TestClient
from types import SimpleNamespace
from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from starlette.middleware.base import BaseHTTPMiddleware
from starlette.requests import Request
from unittest.mock import patch, MagicMock

from app.database import get_db, Base
from app.routes import report, attachment, catalogs, notification, review
from app.seeds.catalogs import seed_all_catalogs
from app.models.user import User

# Set up test environment variables
os.environ.update({
    "SMTP_SERVER": "smtp.gmail.com",
    "SMTP_PORT": "587",
    "SMTP_USERNAME": "test@example.com",
    "SMTP_PASSWORD": "test_password"
})

@pytest.fixture(autouse=True)
def mock_smtp():
    with patch("smtplib.SMTP") as mock_smtp:
        # Configure the mock
        mock_smtp_instance = MagicMock()
        mock_smtp.return_value.__enter__.return_value = mock_smtp_instance
        yield mock_smtp_instance

# ---------- Database Setup ----------
SQLALCHEMY_DATABASE_URL = "postgresql://postgres:password@test-db:5432/makeway_test"
engine = create_engine(SQLALCHEMY_DATABASE_URL)
TestingSessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)

@pytest.fixture(scope="function")
def db_session():
    # Drop all tables and recreate them
    Base.metadata.drop_all(bind=engine)
    Base.metadata.create_all(bind=engine)
    
    db = TestingSessionLocal()
    try:
        yield db
    finally:
        db.rollback()
        db.close()

@pytest.fixture(scope="function")
def seeded_db_session(db_session):
    seed_all_catalogs(db_session)
    db_session.commit()
    return db_session

# ---------- Mock User Fixture ----------
@pytest.fixture(scope="function")
def mock_user():
    # Return a dictionary instead of SimpleNamespace
    return {
        "id": "mock_user_id_test",
        "email": "test@example.com",
        "name": "Mock User",
        "job_title": "Financial Officer"  # Changed to match expected roles
    }

# ---------- Mock Email Notification ----------
@pytest.fixture(autouse=True)
def mock_email_notification():
    with patch('app.utils.emails_utils.send_email_notification') as mock:
        mock.return_value = None
        yield mock

# ---------- Fake Auth Middleware ----------
class FakeAuthMiddleware(BaseHTTPMiddleware):
    def __init__(self, app, mock_user, db_sessionmaker):
        super().__init__(app)
        self.mock_user = mock_user
        self.db_sessionmaker = db_sessionmaker

    async def dispatch(self, request: Request, call_next):
        # Skip auth for public paths
        public_paths = ["/docs", "/openapi.json", "/health"]
        if request.url.path in public_paths:
            return await call_next(request)

        # Create or update test user in DB
        db = self.db_sessionmaker()
        try:
            user = db.query(User).filter(User.id == self.mock_user["id"]).first()
            if not user:
                user = User(
                    id=self.mock_user["id"],
                    email=self.mock_user["email"],
                    name=self.mock_user["name"],
                    job_title=self.mock_user["job_title"]
                )
                db.add(user)
                db.commit()
                db.refresh(user)

            # Set user in request state as a dictionary
            request.state.user = {
                "id": user.id,
                "email": user.email,
                "name": user.name,
                "job_title": user.job_title
            }
        finally:
            db.close()

        return await call_next(request)

# ---------- Test Client Fixture ----------
@pytest.fixture(scope="function")
def client(seeded_db_session, mock_user):
    def override_get_db():
        yield seeded_db_session

    test_app = FastAPI()

    # Include your routers
    test_app.include_router(report.router)
    test_app.include_router(attachment.router)
    test_app.include_router(catalogs.router)
    test_app.include_router(notification.router)
    test_app.include_router(review.router)

    # Add middleware with both mock user and db session
    test_app.add_middleware(FakeAuthMiddleware, mock_user=mock_user, db_sessionmaker=TestingSessionLocal)

    # Override DB dependency
    test_app.dependency_overrides[get_db] = override_get_db

    with TestClient(test_app) as c:
        yield c
