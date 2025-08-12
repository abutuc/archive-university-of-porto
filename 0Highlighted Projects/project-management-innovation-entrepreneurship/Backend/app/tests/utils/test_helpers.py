from sqlalchemy.orm import Session
from app.models.user import User

def create_test_user(db: Session, user_id: str = "test_user", name: str = "Test User", email: str = "test@example.com", job_title: str = "Financial Officer") -> User:
    """Create a test user in the database."""
    user = User(
        id=user_id,
        name=name,
        email=email,
        job_title=job_title
    )
    db.add(user)
    db.commit()
    db.refresh(user)
    return user
