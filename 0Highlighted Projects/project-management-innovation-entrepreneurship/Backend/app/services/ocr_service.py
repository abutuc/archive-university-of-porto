import os
from ..schemas.expenditure_schema import CreateExpenditure
from fastapi import File
from PIL import Image
import pytesseract
import io
import re
import requests


class ExpenditureType:
    CAR = "CAR"
    OTHER = "OTHER"
    PLANE = "AIRPLANE"


def _get_expenditure_type(cae_list):
    classifications = set()

    for cae in cae_list:
        if cae.startswith("192") or cae.startswith("473"):
            classifications.add(ExpenditureType.CAR)
        elif cae.startswith("511"):
            classifications.add(ExpenditureType.PLANE)
        else:
            classifications.add(ExpenditureType.OTHER)
    
    if ExpenditureType.CAR in classifications:
        return ExpenditureType.CAR
    elif ExpenditureType.PLANE in classifications:
        return ExpenditureType.PLANE
    else:
        return ExpenditureType.OTHER

def _extract_tax_identification_number(text):
    # Strategy 1: NIPC (company NIF)
    match = re.search(r"NIPC\s*([\d\s]{9,15})", text, re.IGNORECASE)
    if match:
        raw = re.sub(r"\D", "", match.group(1))
        return raw[:9] if len(raw) >= 9 else None

    # Strategy 2: NIF with or without PT and flexible spacing
    match = re.search(r"NIF[:\s]*PT?\s*([\d\s]{9,15})", text, re.IGNORECASE)
    if match:
        raw = re.sub(r"\D", "", match.group(1))
        return raw[:9] if len(raw) >= 9 else None

    # Strategy 3: Catch generic 'NIF' followed by digits
    match = re.search(r"NIF[^\d]{0,5}([\d\s]{9,15})", text, re.IGNORECASE)
    if match:
        raw = re.sub(r"\D", "", match.group(1))
        return raw[:9] if len(raw) >= 9 else None

    return None


def _extract_total_value(text):
    lines = text.splitlines()
    total_patterns = [r"total[^0-9]{0,10}([\d.,]+)", r"([\d.,]+)[^0-9]{0,5}total"]
    
    for line in lines:
        if "total" in line.lower():
            for pattern in total_patterns:
                match = re.search(pattern, line, re.IGNORECASE)
                if match:
                    return match.group(1).replace(',', '.')
    
    # Fallback: look for any line that resembles "EUR <number>"
    match = re.search(r"EUR\s*([\d.,]+)", text)
    if match:
        return match.group(1).replace(',', '.')

    return None


def _get_caes_from_tax_identification_number(tin):
    api_keys = [
        os.getenv("API_KEY1"),
        os.getenv("API_KEY2"),
        os.getenv("API_KEY3"),
        os.getenv("API_KEY4"),
    ]

    for key in api_keys:
        if not key:
            continue  # Skip unset keys
        try:
            api_url = f"http://www.nif.pt/?json=1&q={tin}&key={key}"
            response = requests.get(api_url, timeout=5)

            if response.status_code == 200:
                data = response.json()
                record = data.get("records", {}).get(tin)
                if record:
                    cae = record.get("cae")
                    if isinstance(cae, list):
                        return cae
                    elif isinstance(cae, str):
                        return [cae]
                    return []
            else:
                print(f"API key {key[:6]}... failed with status {response.status_code}")
        except Exception as e:
            print(f"Error with API key {key[:6]}...: {e}")

    return []

def _create_expenditure(expenditure_type, total):
     match expenditure_type:
        case ExpenditureType.CAR:
            return CreateExpenditure(expenditure_type=expenditure_type, fuel=total)
        case _:
            return CreateExpenditure(expenditure_type=expenditure_type, value=total)
     


async def extract_expenditure(file: File):
    contents = await file.read()

    image = Image.open(io.BytesIO(contents))
    
    text = pytesseract.image_to_string(image, lang='eng')

    nif = _extract_tax_identification_number(text)

    total = _extract_total_value(text)

    if not nif or not total:
        return None
    
    caes = _get_caes_from_tax_identification_number(nif)

    if caes != []:
        expenditure_type = _get_expenditure_type(caes)
        expenditure = _create_expenditure(expenditure_type, total)
        return expenditure
    
    return None