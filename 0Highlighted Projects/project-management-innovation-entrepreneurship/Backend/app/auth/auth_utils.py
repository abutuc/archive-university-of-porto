from jose import jwt
import httpx
from jose.exceptions import JWTError


TENANT_ID = "dfacb40f-5ce3-450a-b043-6fc9c30d95c7"
CLIENT_ID = "037697ed-f4ac-47a5-861b-40bf685a7f14"

AUTHORITY = f"https://login.microsoftonline.com/{TENANT_ID}"
JWKS_URL = f"{AUTHORITY}/discovery/v2.0/keys"
ISSUER = f"https://login.microsoftonline.com/{TENANT_ID}/v2.0"
ALGORITHMS = ["RS256"]

jwks_cache = None

async def get_jwks():
    global jwks_cache
    if jwks_cache is None:
        async with httpx.AsyncClient() as client:
            resp = await client.get(JWKS_URL)
            resp.raise_for_status()
            jwks_cache = resp.json()
    return jwks_cache

async def decode_token(token: str):
    try:
        unverified_header = jwt.get_unverified_header(token)
        jwks = await get_jwks()

        key = next(k for k in jwks["keys"] if k["kid"] == unverified_header["kid"])

        payload = jwt.decode(
            token,
            key,
            algorithms=ALGORITHMS,
            audience=CLIENT_ID,
            issuer=ISSUER
        )

        return payload

    except JWTError as e:
        raise Exception(f"Token verification failed: {str(e)}")
