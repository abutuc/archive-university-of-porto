import React from "react";
import { ViewReport } from "../../../types/ExpenseReport";
import ComponentCard from "../../../components/ComponentCard";
import { ExpenseReportStatus } from "../../../types/ExpenseReportStatus";
import { getNextReportPhase } from "../../../utils/ReportTypeLifecycle";
import { t } from "i18next";

interface ReportReviewResultSectionProps {
  report: ViewReport;
  jobTitle: string;
  handleEditExpenseReportClick: VoidFunction;
  handleConvertExpenseReportClick: VoidFunction;
}

export const ReportReviewResultSection: React.FC<
  ReportReviewResultSectionProps
> = ({
  report,
  jobTitle,
  handleEditExpenseReportClick,
  handleConvertExpenseReportClick,
}) => {
  return (
    <>
      {report!.status == ExpenseReportStatus.ADDITIONAL_STEPS_REQUIRED &&
        jobTitle === "Collaborator" && (
          <>
            <ComponentCard
              title={t("additional_steps")}
              showButton={true}
              textOfButton={
                t("convert_to") +
                " " +
                getNextReportPhase(report!.type_of_document)
              }
              className="border-yellow-400 border-3"
              onClickEvent={handleConvertExpenseReportClick}
            >
              <div className="grid grid-cols-1 gap-4">
                <div className="receiptsLabel">
                  {t("your")} {report!.type_of_document}{" "}
                  {t("document_approved")}
                  <br />
                  <br />
                  {t("provide_more_details")}{" "}
                  {getNextReportPhase(report!.type_of_document)}.
                </div>
              </div>
            </ComponentCard>
          </>
        )}
      {report!.status ==
        ExpenseReportStatus.JUSTIFICATION_CORRECTION_REQUIRED &&
        jobTitle === "Collaborator" && (
          <>
            <ComponentCard
              title="Justification or Correction Required"
              showButton={true}
              textOfButton="Edit Report"
              className="border-red-400 border-3"
              onClickEvent={handleEditExpenseReportClick}
            >
              <div className="grid grid-cols-1 gap-4">
                <div className="receiptsLabel">
                  Your {report!.type_of_document} document needs to address the
                  following problem:
                  <br />
                  <br />
                  {report!.review!.observations}
                </div>
              </div>
            </ComponentCard>
          </>
        )}
    </>
  );
};
