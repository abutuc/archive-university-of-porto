import React from "react";
import ComponentCard from "../../../components/ComponentCard";
import { t } from "i18next";
import Label from "../../../components/Label";
import { ViewExpense } from "../../../types/ExpenseReport";

interface AttachedReceiptsSectionProps {
  expense: ViewExpense;
  handleDownloadAttachment: (
    attachmentId: string,
    attachmentFileName: string
  ) => void;
  downloadError: string | null;
}

export const AttachedReceiptsSection: React.FC<
  AttachedReceiptsSectionProps
> = ({ expense, handleDownloadAttachment, downloadError }) => {
  return (
    <ComponentCard title={t("attached_receipts")}>
      <div className="grid grid-cols-1 gap-4">
        <div className="receiptsLabel">
          <Label>{t("attached_receipts")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {expense.attachments && expense.attachments.length > 0 ? (
              <ul className="list-disc pl-5">
                {expense.attachments.map((attachment) => (
                  <li key={attachment.id}>
                    <button
                      onClick={() =>
                        handleDownloadAttachment(
                          attachment.id,
                          attachment.file_name
                        )
                      }
                      className="text-blue-600 hover:text-blue-800 hover:underline focus:outline-none"
                      aria-label={`Download ${attachment.file_name}`}
                    >
                      {attachment.file_name}
                    </button>
                  </li>
                ))}
              </ul>
            ) : (
              <div>No receipts attached.</div>
            )}
            {downloadError && (
              <p className="text-red-500 mt-2">{downloadError}</p>
            )}
          </div>
        </div>
      </div>
    </ComponentCard>
  );
};
