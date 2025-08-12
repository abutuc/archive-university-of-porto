import pytest
from unittest.mock import patch, mock_open
from fastapi import UploadFile
from io import BytesIO
from ..util.files_helper import save_receipt_files

@pytest.fixture
def mock_files():
    return [
        UploadFile(filename="receipt1.pdf", file=BytesIO(b"Test content 1")),
        UploadFile(filename="receipt2.pdf", file=BytesIO(b"Test content 2")),
    ]

@patch("os.makedirs")
@patch("builtins.open", new_callable=mock_open)
def test_save_receipt_files(mock_open, mock_makedirs, mock_files):
    # Arrange
    collaborator_uuid = "12345"
    collaborator_name = "John Doe"
    expense_report_id = "67890"
    expense_id = "98765"  # Add the missing expense_id
    base_path = "local_storage"

    # Act
    result = save_receipt_files(collaborator_uuid, collaborator_name, expense_report_id, expense_id, mock_files)

    # Assert
    expected_collaborator_folder = f"{base_path}/12345_John_Doe"
    expected_report_folder = f"{expected_collaborator_folder}/R_67890"
    expected_expense_folder = f"{expected_report_folder}/E_98765"

    mock_makedirs.assert_any_call(expected_collaborator_folder, exist_ok=True)
    mock_makedirs.assert_any_call(expected_report_folder, exist_ok=True)
    mock_makedirs.assert_any_call(expected_expense_folder, exist_ok=True)

    for file in mock_files:
        file.file.seek(0)  # Reset file pointer to the beginning
        file_path = f"{expected_expense_folder}/{file.filename}"
        mock_open.assert_any_call(file_path, "wb")
        mock_open().write.assert_any_call(file.file.read())

    assert result == expected_expense_folder
