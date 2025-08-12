from sqlalchemy import Column, String, ForeignKey
from typing import List
from sqlalchemy.orm import relationship, Mapped
from ..database import Base
from .notification import Notification
from .review import Review

class User(Base):
    __tablename__ = "users"

    id = Column(String, primary_key=True)
    email = Column(String, index=True)
    name = Column(String)
    job_title = Column(String)
    
    company = Column(String, ForeignKey("companies.id"))
    direction = Column(String, ForeignKey("directions.id")) 
    unit = Column(String, ForeignKey("units.id"))
    office = Column(String, ForeignKey("offices.id"))
    type_of_employee = Column(String, ForeignKey("employee_types.id"))
    
    reports: Mapped[List["Report"]] = relationship("Report", back_populates="user", cascade="all, delete-orphan")
    notifications: Mapped[List["Notification"]] = relationship("Notification", back_populates="user", cascade="all, delete-orphan", foreign_keys="[Notification.user_id]")
    reviews: Mapped[List["Review"]] = relationship("Review", back_populates="reviewer")