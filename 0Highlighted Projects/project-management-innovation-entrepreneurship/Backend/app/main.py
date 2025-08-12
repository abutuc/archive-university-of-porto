from app.auth.auth_sync_middleware import AuthSyncMiddleware
from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware
from .models import *
from .database import engine, SessionLocal
from .routes import report, notification, catalogs, review, attachment, system_variables, ocr, user
from .seeds.catalogs import seed_all_catalogs
from .seeds.system_variables import seed_system_variables

app = FastAPI()

origins = [
    "http://localhost:5173",
    "http://localhost",
    "http://localhost:3000",
    "http://localhost:8000",
]

app.add_middleware(AuthSyncMiddleware, db_sessionmaker=SessionLocal)

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

app.include_router(report.router)
app.include_router(notification.router)
app.include_router(catalogs.router)
app.include_router(review.router)
app.include_router(attachment.router)
app.include_router(system_variables.router)
app.include_router(ocr.router)
app.include_router(user.router)


@app.on_event("startup")
async def startup_event():

    #Base.metadata.drop_all(bind=engine)

    Base.metadata.create_all(bind=engine)
    db = SessionLocal()

    try:
        seed_all_catalogs(db)

        db.commit()

    except Exception as e:
        print(f"Error seeding catalogs: {e}")
        db.rollback()

    try:
        seed_system_variables(db)

        db.commit()
    except Exception as e:
        print(f"Error seeding catalogs: {e}")
        db.rollback()
    finally:
        db.close()


@app.get("/")
async def root():
    return {"message": "Hello World"}
