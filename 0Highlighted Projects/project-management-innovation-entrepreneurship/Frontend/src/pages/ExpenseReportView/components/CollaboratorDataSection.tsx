import React from "react";
import ComponentCard from "../../../components/ComponentCard";
import { t } from "i18next";
import Label from "../../../components/Label";
import { ViewReport } from "../../../types/ExpenseReport";

interface CollaboradorDataSectionProps {
  report: ViewReport;
}

export const CollaboratorDataSection: React.FC<
  CollaboradorDataSectionProps
> = ({ report }) => {
  return (
    <ComponentCard title={t("collaborator_data")}>
      <div className="grid grid-cols-1 gap-6 md:grid-cols-2">
        <div className="companyLabel">
          <Label>{t("company")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.company}
          </div>
        </div>
        <div className="directionLabel">
          <Label>{t("direction")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.direction}
          </div>
        </div>
        <div className="unitLabel">
          <Label>{t("unit")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.unit}
          </div>
        </div>
        <div className="officeLabel">
          <Label>{t("office")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.office}
          </div>
        </div>
        <div className="employeeNameLabel">
          <Label>{t("collaborator_name")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.name_of_employee}
          </div>
        </div>
        <div className="employeeTypeLabel">
          <Label>{t("collaborator_type")}</Label>
          <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
            {report!.type_of_employee}
          </div>
        </div>
      </div>
    </ComponentCard>
  );
};
