import React from "react";
import ComponentCard from "../../../components/ComponentCard";
import { t } from "i18next";
import { ViewReport } from "../../../types/ExpenseReport";
import { TravelCard } from "./TravelCard";

interface TravelDataSectionProps {
  report: ViewReport;
  handleDownloadAttachment: (
    attachmentId: string,
    attachmentFileName: string
  ) => void;
  downloadError: string | null;
}

export const TravelDataSection: React.FC<TravelDataSectionProps> = ({
  report,
  handleDownloadAttachment,
  downloadError,
}) => {
  return (
    <ComponentCard title={t("travel_data")}>
      <div className="grid grid-cols-1 gap-4">
        <div className="travelDataLabel">
          {report!.expenses.map((expense, index) => (
            <TravelCard
              key={index}
              expense={expense}
              index={index}
              handleDownloadAttachment={handleDownloadAttachment}
              downloadError={downloadError}
            />
          ))}
        </div>
      </div>
    </ComponentCard>
  );
};
