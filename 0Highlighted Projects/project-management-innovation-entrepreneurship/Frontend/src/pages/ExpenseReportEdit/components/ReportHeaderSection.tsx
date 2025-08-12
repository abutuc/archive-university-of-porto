import Input from "../../../components/InputField";
import Label from "../../../components/Label";
import Select from "../../../components/Select";
import TextArea from "../../../components/TextArea";

import { Report } from "../../../types/ExpenseReport";
import { t } from "i18next";

type ReportChangeHandler = <K extends keyof Report>(
  field: K,
  value: Report[K]
) => void;

interface ReportHeaderSectionProps {
  report: Report;
  handleReportChange: ReportChangeHandler;
  companies: {
    value: string;
    label: string;
  }[];
  directions: {
    value: string;
    label: string;
  }[];
  units: {
    value: string;
    label: string;
  }[];
  offices: {
    value: string;
    label: string;
  }[];
  employeeTypes: {
    value: string;
    label: string;
  }[];
  documentTypes: {
    value: string;
    label: string;
  }[];
  fieldErrors?: Record<string, boolean>;
}

export const ReportHeaderSection: React.FC<ReportHeaderSectionProps> = ({
  report,
  handleReportChange,
  companies,
  directions,
  units,
  offices,
  employeeTypes,
  documentTypes,
  fieldErrors = {},
}) => {
  return (
    <>
      <div>
        <Label required htmlFor="report_description">
          {t("description")}
        </Label>
        <TextArea
          id="report_description"
          placeholder={t("enter_report_description")}
          value={report.description}
          onChange={(description) =>
            handleReportChange("description", description)
          }
          error={fieldErrors["description"]}
        />
      </div>
      <div className="grid grid-cols-1 gap-6 md:grid-cols-2">
        <div>
          <Label required htmlFor="company">
            {t("company")}
          </Label>
          <Select
            id="company"
            options={companies}
            placeholder={t("select_company")}
            currentValue={report.company}
            onChange={(company) => {
              handleReportChange("company", company);
            }}
            error={fieldErrors["company"]}
            disabled
          />
        </div>
        <div>
          <Label required htmlFor="direction">
            {t("direction")}
          </Label>
          <Select
            id="direction"
            options={directions}
            placeholder={t("select_direction")}
            currentValue={report.direction}
            onChange={(direction) => {
              handleReportChange("direction", direction);
            }}
            error={fieldErrors["direction"]}
            disabled
          />
        </div>
        <div>
          <Label required htmlFor="unit">
            {t("unit")}
          </Label>
          <Select
            id="unit"
            options={units}
            placeholder={t("select_unit")}
            currentValue={report.unit}
            onChange={(unit) => {
              handleReportChange("unit", unit);
            }}
            error={fieldErrors["unit"]}
            disabled
          />
        </div>
        <div>
          <Label required htmlFor="office">
            {t("office")}
          </Label>
          <Select
            id="office"
            options={offices}
            placeholder={t("select_office")}
            currentValue={report.office}
            onChange={(office) => {
              handleReportChange("office", office);
            }}
            error={fieldErrors["office"]}
            disabled
          />
        </div>
        <div>
          <Label required htmlFor="type_of_employee">
            {t("collaborator_type")}
          </Label>
          <Select
            id="type_of_employee"
            options={employeeTypes}
            placeholder={t("select_collaborator_type")}
            currentValue={report.type_of_employee}
            onChange={(typeOfEmployee) => {
              handleReportChange("type_of_employee", typeOfEmployee);
            }}
            error={fieldErrors["type_of_employee"]}
            disabled
          />
        </div>
        <div>
          <Label required htmlFor="type_of_document">
            {t("document_type")}
          </Label>
          <Select
            id="type_of_document"
            options={documentTypes}
            placeholder={t("select_document_type")}
            currentValue={report.type_of_document}
            onChange={(documentType) => {
              handleReportChange("type_of_document", documentType);
            }}
            error={fieldErrors["type_of_document"]}
          />
        </div>
        <div>
          <Label required htmlFor="project">
            {t("project_client")}
          </Label>
          <Input
            type="text"
            id="project"
            value={report.project_client}
            onChange={(event) => {
              handleReportChange("project_client", event.target.value);
            }}
            error={fieldErrors["project_client"]}
          />
        </div>
      </div>
    </>
  );
};
