import os
import smtplib
from email.message import EmailMessage
from dotenv import load_dotenv
from sqlalchemy.dialects.postgresql import UUID
from typing import List

from ..models.user import User


load_dotenv()

templates = {
    "financial_officer": {
        "subject": "Financial Officer Notification",
        "body": """
        Dear Financial Officer,

        You have a new notification regarding the report: {report_id}.

        Please review the report and take the necessary actions.

        Best regards,
        Smart Expense Team
        """
    },
    "accountant": {
        "subject": "Accountant Notification",
        "body": """
        Dear Accountant,

        You have a new notification regarding the report: {report_id}.

        Please review the report and take the necessary actions.

        Best regards,
        Smart Expense Team
        """
    },
    "REPORT_APPROVED_BY_FO": {
        "subject": "Report Approved by Financial Officer",
        "body": """
        Dear User,

        Your report with ID {report_id} has been approved by the Financial Officer.

        It is now pending further processing by the accountant.

        Best regards,
        Smart Expense Team
        """
    },
    "JUSTIFICATION_CORRECTION_REQUIRED": {
        "subject": "Correction Required for Your Report",
        "body": """
        Dear User,

        Your report with ID {report_id} was reviewed but requires corrections.

        Please review the feedback and update the report accordingly.

        Best regards,
        Smart Expense Team
        """
    },
    "ADDITIONAL_STEPS_REQUIRED": {
        "subject": "Additional Steps Required for Your Report",
        "body": """
        Dear User,

        Your report with ID {report_id} has been approved by the accountant, but additional steps are required before it can be fully approved.

        Please complete the required actions as soon as possible.

        Best regards,
        Smart Expense Team
        """
    },
    "APPROVED": {
        "subject": "Your Report Has Been Fully Approved",
        "body": """
        Dear User,

        Your report with ID {report_id} has been fully approved.

        Best regards,
        Smart Expense Team
        """
    }
}


def send_email_to_all_accountants(report_id: UUID, accountants: List[User]):
    accountants_emails: List[str] = [accountant.email for accountant in accountants]
    if accountants_emails:
        send_email_notification(
            to_emails=accountants_emails,
            email_template="accountant",
            email_context={
                "report_id": report_id
            }
        )



def send_email_notification(to_emails: list[str], email_template: str, email_context: dict):
    template = templates.get(email_template)
    if not template:
        raise ValueError(f"Email template '{email_template}' not found.")
    
    msg = EmailMessage()
    msg['Subject'] = template['subject']
    msg['From'] = os.getenv("SMTP_USERNAME")
    msg['To'] = ''
    msg['Bcc'] = ', '.join(to_emails)
    msg.set_content(template['body'].format(**email_context))

    with smtplib.SMTP(os.getenv("SMTP_SERVER"), int(os.getenv("SMTP_PORT"))) as server:
        server.starttls()
        server.login(os.getenv("SMTP_USERNAME"), os.getenv("SMTP_PASSWORD"))
        server.send_message(msg, to_addrs=to_emails)