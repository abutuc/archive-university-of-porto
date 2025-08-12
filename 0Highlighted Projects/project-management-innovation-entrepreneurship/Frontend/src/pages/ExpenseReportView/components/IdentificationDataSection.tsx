import React from "react";
import ComponentCard from "../../../components/ComponentCard";
import { t } from "i18next";
import Label from "../../../components/Label";
import { ViewReport } from "../../../types/ExpenseReport";
import Badge from "../../../components/Badge";
import {
  getExpenseReportStatusBadgeColor,
  getExpenseReportStatusLabel,
} from "../../../types/ExpenseReportStatus";
import { formatDate } from "../../../utils/DateFormatter";

interface IdentificationDataSectionProps {
  report: ViewReport;
  language: string;
}

export const IdentificationDataSection: React.FC<
  IdentificationDataSectionProps
> = ({ report, language }) => {
  return (
    <ComponentCard title={t("identification_data")}>
      <div className="grid grid-cols-1 gap-6 md:grid-cols-2">
        <div className="companyLabel">
          <Label>{t("trip_id")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.id}
          </div>
        </div>
        <div className="directionLabel">
          <Label>{t("description")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.description}
          </div>
        </div>
      </div>
      <div className="flex justify-between items-center bg-gray-100 p-4 rounded-md border border-gray-300">
        <div>
          <Label>{t("report_submission_date")}</Label>
          <div className="text-gray-700">
            {formatDate(report!.submissionDate, language)}
          </div>
        </div>
        <div className="text-center">
          <Label>{t("status")}</Label>
          <Badge
            size="sm"
            color={getExpenseReportStatusBadgeColor(report!.status)}
          >
            {getExpenseReportStatusLabel(report!.status)}
          </Badge>
        </div>
      </div>
      <div className="documentTypeLabel">
        <Label>{t("document_type")}</Label>
        <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
          {report!.type_of_document}
        </div>
      </div>
      <div className="projectLabel">
        <Label>{t("project_client")}</Label>
        <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
          {report!.project}
        </div>
      </div>
    </ComponentCard>
  );
};
