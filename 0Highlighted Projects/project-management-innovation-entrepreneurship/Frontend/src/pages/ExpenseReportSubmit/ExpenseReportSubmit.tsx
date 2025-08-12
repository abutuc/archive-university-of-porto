import { useEffect, useState } from "react";
import ComponentCard from "../../components/ComponentCard";
import PageMeta from "../../components/PageMeta";
import Button from "../../components/Button";
import { BoxIcon } from "../../assets/icons";
import { useTranslation } from "react-i18next";
import { useReports } from "../../hooks/useReports";
import { useNavigate } from "react-router";
import { useCatalogs } from "../../hooks/useCatalogs";
import { mapToOptions } from "../../utils/CatalogMapper";
import { reimbursementCalculator } from "../../utils/ReimbursementCalculator";
import { useReportForm } from "../../hooks/useReportForm";
import { ReportHeaderSection } from "./components/ReportHeaderSection";
import { FinancialSummarySection } from "../../components/FinancialSummarySection";
import { TravelExpenseCard } from "./components/TravelExpenseCard";
import { useSubmitReport } from "./hooks/useSubmitReport";
import { validateReport } from "../../utils/ValidationUtils";
import { useSystemVariables } from "../../hooks/useSystemVariables";
import { API_BASE_URL } from "../../config";
import { useAuth } from "../../auth/AuthContext";
import { Expenditure } from "../../types/ExpenseReport";
import LoadingOverlay from "../../components/LoadingOverlay";

export default function ExpenseReportSubmit() {
  const navigate = useNavigate();
  const { t, i18n } = useTranslation();
  const lang = i18n.language;
  const { createFullReport } = useReports();
  const { catalogs } = useCatalogs();
  const [loading, setLoading] = useState(false);
  const [loadingAI, setLoadingAI] = useState(false);

  const [fieldErrors, setFieldErrors] = useState<Record<string, boolean>>({});

  const { variables } = useSystemVariables();

  const companies = mapToOptions(catalogs.companies, lang);
  const directions = mapToOptions(catalogs.directions, lang);
  const units = mapToOptions(catalogs.units, lang);
  const offices = mapToOptions(catalogs.offices, lang);
  const employeeTypes = mapToOptions(catalogs.employee_types, lang);
  const documentTypes = mapToOptions(catalogs.document_types, lang);
  const travelTypes = mapToOptions(catalogs.travel_types, lang);
  const expenditureTypes = mapToOptions(catalogs.expenditure_types, lang);

  const {
    report,
    handleReportChange,
    addExpense,
    updateExpense,
    removeExpense,
    addExpenditure,
    updateExpenditure,
    removeExpenditure,
    dateRenderMap,
    setDepartureDateOnRenderMap,
    setArrivalDateOnRenderMap,
  } = useReportForm();

  const [totalExpenditure, setTotalExpenditure] = useState(0);

  const [uploadedFiles, setUploadedFiles] = useState<Record<number, File[]>>(
    {}
  );

  const handleAddFiles = (files: FileList, index: number) => {
    setUploadedFiles((prev) => ({
      ...prev,
      [index]: [...(prev[index] ?? []), ...Array.from(files)],
    }));

    const fileNames = [
      ...(uploadedFiles[index]?.map((file) => file.name) ?? []),
      ...Array.from(files).map((file) => file.name),
    ];

    updateExpense(index, "attachments", fileNames);
  };

  const handleRemoveFile = (fileIndex: number, index: number) => {
    const currentFiles = uploadedFiles[index] ?? [];
    const updatedFiles = currentFiles.filter((_, i) => i !== fileIndex);

    setUploadedFiles((prev) => ({
      ...prev,
      [index]: updatedFiles,
    }));

    const fileNames = updatedFiles.map((file) => file.name);
    updateExpense(index, "attachments", fileNames);
  };

  useEffect(() => {
    const total = reimbursementCalculator(report, variables);
    setTotalExpenditure(total);
  }, [report]);

  const [advancePayments, setAdvancePayments] = useState(0);
  const [companyPayments, setCompanyPayments] = useState(0);
  const [receivePay, setReceivePay] = useState(0);

  useEffect(() => {
    const total = totalExpenditure - advancePayments - companyPayments;
    setReceivePay(Number(total.toFixed(2)));
  }, [totalExpenditure, advancePayments, companyPayments]);

  const submitHandler = useSubmitReport(
    report,
    uploadedFiles,
    totalExpenditure,
    advancePayments,
    companyPayments,
    receivePay,
    createFullReport,
    navigate,
    setLoading
  );

  // Handler to submit the report
  const handleSubmit = () => {
    // collect all the errors from the report
    const validationErrors = validateReport(report);

    if (validationErrors.length > 0) {
      // collect errors in a map to highlight the fields
      const errors: Record<string, boolean> = {};
      validationErrors.forEach((error) => {
        errors[error.field] = true;
      });

      // render the errors in the UI
      setFieldErrors(errors);
    } else {
      // Clear errors if the report is valid
      setFieldErrors({});
    }

    // Call the submit handler to process the report
    submitHandler();
  };

  const { backendAccessToken } = useAuth();

  const [wasAIFuncionalityUsed, setWasAIFunctionalityUsed] = useState(false);

  const addExpenditureWithAI = async (expenseIndex: number) => {
    const receiptFiles: File[] = uploadedFiles[expenseIndex];
    if (receiptFiles.length == 0) return;

    const formData = new FormData();

    for (let receiptFile of receiptFiles) {
      formData.append("files", receiptFile);
    }

    setLoadingAI(true);
    try {
      const response = await fetch(`${API_BASE_URL}/ocr/process-receipts`, {
        method: "POST",
        headers: {
          Authorization: `Bearer ${backendAccessToken}`,
        },
        body: formData,
      });

      if (!response.ok) {
        throw new Error("Failed to add expenditure with AI");
      }

      const data: Expenditure[] = await response.json();

      for (let expenditure of data) {
        addExpenditure(expenseIndex, {
          expenditure_type: expenditure.expenditure_type || "",
          fuel: expenditure.fuel || 0,
          value: expenditure.value || 0,
        });
      }
    } catch (err) {
      console.error("Receipt upload failed:", err);
      addExpenditure(expenseIndex);
    } finally {
      setLoadingAI(false);
    }
    setWasAIFunctionalityUsed(true);
  };

  return (
    <div>
      <PageMeta
        title="Expense Report Submit"
        description="This is the page for Travel Expense Report submissions."
      />
      <div className="grid grid-cols-1 gap-6 xl:grid-cols-1">
        <ComponentCard title={t("travel_expense_report_title")}>
          <ReportHeaderSection
            report={report}
            handleReportChange={handleReportChange}
            companies={companies}
            directions={directions}
            units={units}
            offices={offices}
            employeeTypes={employeeTypes}
            documentTypes={documentTypes}
            fieldErrors={fieldErrors}
          />
          <FinancialSummarySection
            totalExpenditure={totalExpenditure}
            setAdvancePayments={setAdvancePayments}
            setCompanyPayments={setCompanyPayments}
            receivePay={receivePay}
            advancePayments={advancePayments}
            companyPayments={companyPayments}
          />
          <ComponentCard title="Travels">
            <div className="grid grid-cols-1 gap-4">
              {report.expenses?.map((expense, index) => (
                <TravelExpenseCard
                  key={expense.renderId}
                  expense={expense}
                  index={index}
                  removeExpense={removeExpense}
                  dateRenderMap={dateRenderMap}
                  setDepartureDateOnRenderMap={setDepartureDateOnRenderMap}
                  updateExpense={updateExpense}
                  setArrivalDateOnRenderMap={setArrivalDateOnRenderMap}
                  travelTypes={travelTypes}
                  report={report}
                  updateExpenditure={updateExpenditure}
                  expenditureTypes={expenditureTypes}
                  addExpenditure={addExpenditure}
                  addExpenditureWithAI={addExpenditureWithAI}
                  removeExpenditure={removeExpenditure}
                  handleAddFiles={handleAddFiles}
                  handleRemoveFile={handleRemoveFile}
                  uploadedFiles={uploadedFiles[index]}
                  wasAIFunctionalityUsed={wasAIFuncionalityUsed}
                  fieldErrors={fieldErrors}
                />
              ))}
              <div className="flex justify-center">
                <Button
                  size="sm"
                  variant="outline"
                  endIcon={<BoxIcon className="size-5" />}
                  onClick={addExpense}
                >
                  {t("add_travel_expense_button")}
                </Button>
              </div>
            </div>
          </ComponentCard>
          <div className="grid grid-cols-1">
            <div className="flex justify-center">
              <Button
                size="sm"
                variant="primary"
                onClick={handleSubmit}
                disabled={loading}
              >
                {t("submit_report_button")}
              </Button>
            </div>
          </div>
        </ComponentCard>
        {loading && <LoadingOverlay messageKey="submitting_report" />}
        {loadingAI && <LoadingOverlay messageKey="add_expenditure_with_ai" />}
      </div>
    </div>
  );
}
