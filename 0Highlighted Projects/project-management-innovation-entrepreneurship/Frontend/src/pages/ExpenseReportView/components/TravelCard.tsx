import React from "react";
import ComponentCard from "../../../components/ComponentCard";
import Label from "../../../components/Label";
import { ViewExpense } from "../../../types/ExpenseReport";
import { t } from "i18next";
import { ExpenditureDataCard } from "./ExpenditureDataCard";
import { AttachedReceiptsSection } from "./AttachedReceiptsSection";

interface TravelCardProps {
  index: number;
  expense: ViewExpense;
  handleDownloadAttachment: (
    attachmentId: string,
    attachmentFileName: string
  ) => void;
  downloadError: string | null;
}

export const TravelCard: React.FC<TravelCardProps> = ({
  index,
  expense,
  handleDownloadAttachment,
  downloadError,
}) => {
  return (
    <ComponentCard title={"Travel " + (index + 1)} hideOutFunctionality={true}>
      <div className="grid grid-cols-1 gap-6 md:grid-cols-2">
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("departure_date")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.departure_date}
            </div>
          </div>
        </div>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("departure_time")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.departure_time}
            </div>
          </div>
        </div>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("arrival_date")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.arrival_date}
            </div>
          </div>
        </div>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("arrival_time")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.arrival_time}
            </div>
          </div>
        </div>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("travel_type")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.travel_type}
            </div>
          </div>
        </div>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("departure_place")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.departure_place}
            </div>
          </div>
        </div>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("meeting_place")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.meeting_place}
            </div>
          </div>
        </div>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("arrival_place")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expense.arrival_place}
            </div>
          </div>
        </div>
      </div>
      <ComponentCard title={t("expenditure_data")}>
        {expense.expenditures.map((expenditure, index) => (
          <ExpenditureDataCard
            expenditure={expenditure}
            index={index}
            key={index}
          />
        ))}
      </ComponentCard>
      <AttachedReceiptsSection
        expense={expense}
        downloadError={downloadError}
        handleDownloadAttachment={handleDownloadAttachment}
      />
    </ComponentCard>
  );
};
