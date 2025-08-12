import Button from "../../components/Button";
import { useLocation, useNavigate } from "react-router";
import { useState } from "react";
import { useTranslation } from "react-i18next";
import { useReports } from "../../hooks/useReports";
import { useAuth } from "../../auth/AuthContext";
import { useReviews } from "../../hooks/useReviews";
import { useCatalogs } from "../../hooks/useCatalogs";
import { mapToOptions } from "../../utils/CatalogMapper";
import { ExpenseReportStatus } from "../../types/ExpenseReportStatus";
import { IdentificationDataSection } from "./components/IdentificationDataSection";
import { ReportReviewSection } from "./components/ReportReviewSection";
import { ReportReviewResultSection } from "./components/ReportReviewResultSection";
import { ExpenseSummarySection } from "./components/ExpenseSummarySection";
import { CollaboratorDataSection } from "./components/CollaboratorDataSection";
import { TravelDataSection } from "./components/TravelDataSection";
import { useReportView } from "./hooks/useReportView";
import { useAttachmentDownloader } from "./hooks/useAttachmentDownloader";
import PageMeta from "../../components/PageMeta";
import LoadingOverlay from "../../components/LoadingOverlay";

export default function ExpenseViewReport() {
  const { t, i18n } = useTranslation();
  const location = useLocation();
  const { jobTitle } = useAuth();
  const reportId = location.state.reportId;
  const lang = i18n.language;
  const [reviewSubmitting, setReviewSubmitting] = useState(false);

  const navigate = useNavigate();
  const [observations, setObservations] = useState("");

  const { catalogs } = useCatalogs();

  const companies = mapToOptions(catalogs.companies, lang);
  const directions = mapToOptions(catalogs.directions, lang);
  const units = mapToOptions(catalogs.units, lang);
  const offices = mapToOptions(catalogs.offices, lang);
  const employeeTypes = mapToOptions(catalogs.employee_types, lang);
  const documentTypes = mapToOptions(catalogs.document_types, lang);
  const travelTypes = mapToOptions(catalogs.travel_types, lang);
  const expenditureTypes = mapToOptions(catalogs.expenditure_types, lang);

  const handleClick = () => {
    navigate("/");
  };

  const { getReport, loading, error } = useReports();

  const { createReview } = useReviews();

  const { currentReport, fetchReport } = useReportView({
    reportId,
    getReport,
    catalogs: {
      companies,
      directions,
      units,
      offices,
      employeeTypes,
      documentTypes,
      travelTypes,
      expenditureTypes,
    },
  });

  const [selectedReviewDecision, setReviewDecision] = useState<string>(
    "Require Justification/Correction"
  );

  const handleReviewDecisionChange = (value: string) => {
    setReviewDecision(value);
  };

  const handleSubmitReview = async () => {
    setReviewSubmitting(true);
    try {
      const review = {
        report_id: currentReport!.id,
        observations,
        approved: selectedReviewDecision === "Approve",
      };
      await createReview(review);
      await fetchReport();
    } catch (error) {
      console.error("Error submitting review:", error);
      alert("Failed to submit review.");
    } finally {
      setReviewSubmitting(false);
    }
  };

  const { handleDownloadAttachment, downloadError } = useAttachmentDownloader();

  const handleEditExpenseReportClick = () => {
    navigate("/edit-expense-report", {
      state: { reportId: currentReport!.id },
    });
  };

  const handleConvertExpenseReportClick = () => {
    navigate("/edit-expense-report", {
      state: { reportId: currentReport!.id, convertReport: true },
    });
  };

  return (
    <>
      <PageMeta
        title="View Report"
        description="This is the page for analyzing a specific report"
      />
      {loading ? (
        <div>Loading Expense Report</div>
      ) : error ? (
        <div>Error: {error}</div>
      ) : currentReport === null ? (
        <div>No Report was Found</div>
      ) : (
        <div className="grid grid-cols-1 gap-6 xl:grid-cols-1">
          {((currentReport!.status == ExpenseReportStatus.PENDING_FO_REVIEW &&
            jobTitle === "Financial Officer") ||
            (currentReport!.status ==
              ExpenseReportStatus.PENDING_ACCOUNTANT_REVIEW &&
              jobTitle === "Accountant")) && (
            <ReportReviewSection
              observations={observations}
              setObservations={setObservations}
              selectedReviewDecision={selectedReviewDecision}
              handleReviewDecisionChange={handleReviewDecisionChange}
              handleSubmitReview={handleSubmitReview}
              reportUpdateStatus={currentReport.is_update_request}
            />
          )}
          <ReportReviewResultSection
            jobTitle={jobTitle!}
            report={currentReport}
            handleEditExpenseReportClick={handleEditExpenseReportClick}
            handleConvertExpenseReportClick={handleConvertExpenseReportClick}
          />
          <IdentificationDataSection
            report={currentReport}
            language={i18n.language}
          />

          <ExpenseSummarySection report={currentReport} />

          <CollaboratorDataSection report={currentReport} />

          <TravelDataSection
            report={currentReport}
            handleDownloadAttachment={handleDownloadAttachment}
            downloadError={downloadError}
          />
        </div>
      )}
      <br />
      <Button size="sm" variant="outline" onClick={handleClick}>
        {t("go_back")}
      </Button>
      {reviewSubmitting && <LoadingOverlay messageKey="submitting_review" />}
    </>
  );
}
