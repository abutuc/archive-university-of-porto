import os
from fastapi import UploadFile
from typing import List

BASE_STORAGE_PATH = "local_storage"

def save_receipt_files(collaborator_uuid: str, collaborator_name: str, report_id: str, expense_id: str, files: List[UploadFile]):
    try:
        # Create collaborator folder
        collaborator_folder = f"{collaborator_uuid}_{collaborator_name.replace(' ', '_')}"
        collaborator_path = os.path.join(BASE_STORAGE_PATH, collaborator_folder)
        os.makedirs(collaborator_path, exist_ok=True)

        # Create report folder
        report_folder = f"R_{report_id}"
        report_path = os.path.join(collaborator_path, report_folder)
        os.makedirs(report_path, exist_ok=True)

        # Create expense folder
        expense_folder = f"E_{expense_id}"
        expense_path = os.path.join(report_path, expense_folder)
        os.makedirs(expense_path, exist_ok=True)
        

        # Save uploaded files
        for file in files:
            file_path = os.path.join(expense_path, file.filename)
            with open(file_path, "wb") as f:
                f.write(file.file.read())

        return expense_path

    except Exception as e:
        raise Exception(f"Error saving files: {str(e)}")
    
def delete_receipt_file(collaborator_uuid: str, collaborator_name: str, report_id: str, expense_id: str, file: str):
    try:
        # Reconstruct the full path to the file
        collaborator_folder = f"{collaborator_uuid}_{collaborator_name.replace(' ', '_')}"
        file_path = os.path.join(
            BASE_STORAGE_PATH,
            collaborator_folder,
            f"R_{report_id}",
            f"E_{expense_id}",
            file
        )

        # Check if the file exists and delete it
        if os.path.exists(file_path):
            os.remove(file_path)
        else:
            raise FileNotFoundError(f"File '{file}' not found at path: {file_path}")

    except Exception as e:
        raise Exception(f"Error deleting file: {str(e)}")
