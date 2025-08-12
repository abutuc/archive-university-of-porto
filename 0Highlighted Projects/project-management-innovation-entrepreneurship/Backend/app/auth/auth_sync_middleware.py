from app.auth.auth_utils import decode_token
from app.models.user import User
from fastapi import Request
from fastapi.responses import JSONResponse
from starlette.middleware.base import BaseHTTPMiddleware
from sqlalchemy.orm import Session


class AuthSyncMiddleware(BaseHTTPMiddleware):
    def __init__(self, app, db_sessionmaker):
        super().__init__(app)
        self.db_sessionmaker = db_sessionmaker

    async def dispatch(self, request: Request, call_next):
        public_paths = ["/docs", "/openapi.json", "/health"]
        if request.url.path in public_paths:
            return await call_next(request)

        auth_header = request.headers.get("Authorization")
        if not auth_header or not auth_header.startswith("Bearer "):
            return JSONResponse(status_code=401, content={"detail": "Missing or invalid token"})

        token = auth_header.split(" ")[1]
        try:
            payload = await decode_token(token)

            azure_id = payload.get("oid")
            email = payload.get("preferred_email")
            name = payload.get("name")
            job_title = payload.get("job_title")

            if not azure_id:
                raise Exception("Token missing 'oid' claim")

            db: Session = self.db_sessionmaker()
            user = db.query(User).filter(User.id == azure_id).first()

            if not user:
                user = User(id=azure_id, email=email, name=name)
                db.add(user)
                db.commit()
                db.refresh(user)
            else:
                updated = False
                if user.email != email:
                    user.email = email
                    updated = True
                if user.name != name:
                    user.name = name
                    updated = True
                if user.job_title != job_title:
                    user.job_title = job_title
                    updated = True
                if updated:
                    db.commit()

            request.state.user = {
                "id": user.id,
                "email": user.email,
                "name": user.name,
                "job_title": user.job_title
            }
            
            db.close()

        except Exception as e:
            return JSONResponse(status_code=401, content={"detail": str(e)})

        return await call_next(request)
