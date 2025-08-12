from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from app.database import Base
import os

# Pick from .env.test or fallback to hardcoded value
TEST_DATABASE_URL = os.getenv("DATABASE_URL", "postgresql://postgres:password@localhost:5434/makeway_test")

# Use test DB engine
engine = create_engine(TEST_DATABASE_URL)
TestingSessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)

def override_get_test_db():
    db = TestingSessionLocal()
    try:
        yield db
    finally:
        db.close()
