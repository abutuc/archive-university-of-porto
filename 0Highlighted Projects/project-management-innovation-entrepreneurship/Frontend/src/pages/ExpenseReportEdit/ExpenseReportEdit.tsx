import { useEffect, useState } from "react";
import ComponentCard from "../../components/ComponentCard";
import PageMeta from "../../components/PageMeta";
import Button from "../../components/Button";
import { BoxIcon } from "../../assets/icons";
import { useTranslation } from "react-i18next";
import { useReports } from "../../hooks/useReports";
import { useCatalogs } from "../../hooks/useCatalogs";
import { reimbursementCalculator } from "../../utils/ReimbursementCalculator";
import { useLocation, useNavigate } from "react-router";
import { mapToOptions } from "../../utils/CatalogMapper";
import { useReportForm } from "../../hooks/useReportForm";
import { Report } from "../../types/ExpenseReport";
import { ReportHeaderSection } from "./components/ReportHeaderSection";
import { FinancialSummarySection } from "../../components/FinancialSummarySection";
import { TravelExpenseCard } from "./components/TravelExpenseCard";
import { useEditReport } from "./hooks/useEditReport";
import { useRef } from "react";
import { getNextReportPhaseId } from "../../utils/ReportTypeLifecycle";
import { useSystemVariables } from "../../hooks/useSystemVariables";
import { validateReport } from "../../utils/ValidationUtils";
import { toast } from "react-hot-toast";
import LoadingOverlay from "../../components/LoadingOverlay";

export default function ExpenseReportSubmit() {
  const navigate = useNavigate();
  const location = useLocation();
  const reportId = location.state.reportId;
  const convertReport = location.state.convertReport;
  const { t, i18n } = useTranslation();
  const lang = i18n.language;
  const { updateReport } = useReports();
  const [submitingUpdate, setSubmitingUpdate] = useState(false);

  const [fieldErrors, setFieldErrors] = useState<Record<string, boolean>>({});

  const { catalogs } = useCatalogs();

  const companies = mapToOptions(catalogs.companies, lang);
  const directions = mapToOptions(catalogs.directions, lang);
  const units = mapToOptions(catalogs.units, lang);
  const offices = mapToOptions(catalogs.offices, lang);
  const employeeTypes = mapToOptions(catalogs.employee_types, lang);
  const documentTypes = mapToOptions(catalogs.document_types, lang);
  const travelTypes = mapToOptions(catalogs.travel_types, lang);
  const expenditureTypes = mapToOptions(catalogs.expenditure_types, lang);

  const { variables } = useSystemVariables();

  const { getReport, loading, error } = useReports();

  let deleteData = useRef<{
    expenses: string[];
    expenditures: string[];
    attachments: string[];
  }>({
    expenses: [],
    expenditures: [],
    attachments: [],
  });

  const {
    report,
    setReport,
    handleReportChange,
    addExpense,
    updateExpense,
    addExpenditure,
    updateExpenditure,
    dateRenderMap,
    setDepartureDateOnRenderMap,
    setArrivalDateOnRenderMap,
  } = useReportForm();

  async function fetchReport() {
    try {
      const report = await getReport(reportId);

      const selectedReport: Report = {
        status: report.status,
        description: report.description,
        company: report.company,
        direction: report.direction,
        unit: report.unit,
        office: report.office,
        type_of_employee: report.type_of_employee,
        type_of_document: convertReport
          ? getNextReportPhaseId(report.type_of_document)
          : report.type_of_document,
        project_client: report.project_client,
        expenses: report.expenses.map((expense: any) => ({
          id: expense.id,
          fetched_from_api: true,
          departure_date: expense.departure_date,
          departure_time: expense.departure_time,
          arrival_date: expense.arrival_date,
          arrival_time: expense.arrival_time,
          travel_type: expense.travel_type,
          departure_place: expense.departure_place,
          meeting_place: expense.meeting_place,
          arrival_place: expense.arrival_place,
          attachments: expense.attachments.map((att: any) => att.file_name),
          expenditures: expense.expenditures.map((expenditure: any) => ({
            id: expenditure.id,
            fetched_from_api: true,
            expenditure_type: expenditure.expenditure_type,
            value: expenditure.value,
            car_type: expenditure.car_type,
            km_travelled: expenditure.km_travelled,
            license_plate: expenditure.license_plate,
            fuel: expenditure.fuel,
            parking_tolls: expenditure.parking_tolls,
          })),
        })),
        total_expenditure: report.total_expenditure,
        advance_payments: report.advance_payments,
        company_payments: report.company_payments,
        receive_pay: report.receive_pay,
      };

      setTotalExpenditure(report.total_expenditure);
      setCompanyPayments(report.company_payments);
      setAdvancePayments(report.advance_payments);
      setReceivePay(report.receive_pay);

      console.log(convertReport);
      console.log(selectedReport);

      if (selectedReport) {
        setReport(selectedReport);
      }
    } catch (err) {
      console.error("Error fetching report:", err);
      //setReport(null);
    }
  }

  useEffect(() => {
    if (reportId) {
      fetchReport();
    }
  }, [reportId]);

  const removeExpense = (index: number) => {
    const expense = report.expenses?.[index];

    //Check if expense was fetched from backend and add expense id to deleteData
    if (expense && expense.fetched_from_api && expense.id) {
      deleteData.current.expenses.push(expense.id);
    }

    //Remove it from the state, wether it was fetched from backend or not
    setReport((prev) => {
      if (!prev.expenses) return prev;

      const updatedExpenses = [...prev.expenses];
      updatedExpenses.splice(index, 1);

      return {
        ...prev,
        expenses: updatedExpenses,
      };
    });
  };

  const removeExpenditure = (
    expenseIndex: number,
    expenditureIndex: number
  ) => {
    const expenditure =
      report.expenses?.[expenseIndex]?.expenditures?.[expenditureIndex];

    //Check if expenditure was fetched from backend and add expenditure id to deleteData
    if (expenditure && expenditure.fetched_from_api && expenditure.id) {
      deleteData.current.expenditures.push(expenditure.id);
    }

    //Remove it from the state, wether it was fetched from backend or not
    setReport((prev) => {
      if (!prev.expenses || !prev.expenses[expenseIndex]?.expenditures) {
        return prev;
      }

      const updated = [...prev.expenses];
      const exps = [...updated[expenseIndex].expenditures!];
      exps.splice(expenditureIndex, 1);
      updated[expenseIndex] = { ...updated[expenseIndex], expenditures: exps };
      return { ...prev, expenses: updated };
    });
  };

  useEffect(() => {
    const total = reimbursementCalculator(report, variables);
    setTotalExpenditure(total);
  }, [report]);

  const [totalExpenditure, setTotalExpenditure] = useState(0);
  const [advancePayments, setAdvancePayments] = useState(0);
  const [companyPayments, setCompanyPayments] = useState(0);
  const [receivePay, setReceivePay] = useState(0);

  useEffect(() => {
    const total = totalExpenditure - advancePayments - companyPayments;
    setReceivePay(Number(total.toFixed(2)));
  }, [totalExpenditure, advancePayments, companyPayments]);

  const [uploadedFiles, setUploadedFiles] = useState<Record<number, File[]>>(
    {}
  );

  const [visibleAttachments, setVisibleAttachments] = useState<
    Record<number, string[]>
  >({});

  const handleAddFiles = (files: FileList, index: number) => {
    const newFilesArray = Array.from(files);

    setUploadedFiles((prev) => {
      const updated = {
        ...prev,
        [index]: [...(prev[index] ?? []), ...newFilesArray],
      };

      const visible = getVisibleAttachments(index, updated);

      setVisibleAttachments((prev) => ({
        ...prev,
        [index]: visible,
      }));

      updateExpense(index, "attachments", visible);

      return updated;
    });
  };

  const handleRemoveFile = (fileIndex: number, index: number) => {
    const visibleAttachments = getVisibleAttachments(index, uploadedFiles);
    const fileNameToRemove = visibleAttachments[fileIndex];

    const wasNew = uploadedFiles[index]?.some(
      (f) => f.name === fileNameToRemove
    );

    if (wasNew) {
      const updatedFiles = (uploadedFiles[index] ?? []).filter(
        (file) => file.name !== fileNameToRemove
      );

      setUploadedFiles((prev) => ({
        ...prev,
        [index]: updatedFiles,
      }));
    } else {
      deleteData.current.attachments.push(fileNameToRemove);
    }

    const visible = getVisibleAttachments(index, uploadedFiles).filter(
      (name) => name !== fileNameToRemove
    );

    setVisibleAttachments((prev) => ({
      ...prev,
      [index]: visible,
    }));

    updateExpense(index, "attachments", visible);
  };

  const editReportHandler = useEditReport(
    location.state.reportId,
    report,
    uploadedFiles,
    deleteData.current,
    totalExpenditure,
    advancePayments,
    companyPayments,
    receivePay,
    updateReport,
    navigate,
    setSubmitingUpdate
  );

  useEffect(() => {
    //If report is loaded and not null
    if (report) {
      //If report status exists but it does not allow to edit
      if (
        report.status &&
        report.status !== "JUSTIFICATION_CORRECTION_REQUIRED" &&
        report.status !== "ADDITIONAL_STEPS_REQUIRED"
      ) {
        navigate("/"); //Navigate to dashboard
      }
    }
  });
  const handleSubmit = () => {
    // Collect all the errors from the report
    const validationErrors = validateReport(report);

    if (validationErrors.length > 0) {
      // Collect errors in a map to highlight the fields
      const errors: Record<string, boolean> = {};
      validationErrors.forEach((error) => {
        errors[error.field] = true;
      });

      // Set the errors in state to highlight fields
      setFieldErrors(errors);

      // Generate error messages for the toast
      const headerErrors = new Set<string>();
      let hasTravelExpenseErrors = false;
      let hasExpenditureErrors = false;

      validationErrors.forEach((error) => {
        const fieldName = error.field;

        if (fieldName === "expenses") {
          return;
        }

        if (fieldName.includes("_") && /\d/.test(fieldName)) {
          if (fieldName.match(/_\d+_\d+/)) {
            hasExpenditureErrors = true;
          } else if (fieldName.match(/_\d+$/)) {
            hasTravelExpenseErrors = true;
          }
        } else {
          const displayName = error.displayName || t(fieldName);
          headerErrors.add(displayName);
        }
      });

      // Error list
      const errorMessages: string[] = [];

      // Add header errors to the list
      headerErrors.forEach((field) => errorMessages.push(`- ${field}`));

      // Generic error message for travel expense fields
      if (hasTravelExpenseErrors) {
        errorMessages.push(`- ${t("travel_expense")}`);
      }

      // Generic error message for expenditure fields
      if (hasExpenditureErrors) {
        errorMessages.push(`- ${t("expenditure")}`);
      }

      // Show the error message
      const errorMessage = `${t("failed_submit_missing_fields")}\n\n${t(
        "required_fields"
      )}:\n${errorMessages.join("\n")}`;

      toast.error(errorMessage);
      return;
    }

    // Clear errors if the report is valid
    setFieldErrors({});

    // Call the edit report handler to submit changes
    editReportHandler();
  };

  const getVisibleAttachments = (
    index: number,
    uploaded: Record<number, File[]>,
    origin?: string
  ): string[] => {
    console.log(origin);
    const existing = report.expenses?.[index]?.attachments ?? [];
    const deleted = deleteData.current.attachments;
    const newlyUploaded = uploaded[index]?.map((f) => f.name) ?? [];

    const keptExisting = existing.filter((name) => !deleted.includes(name));
    console.log([...keptExisting, ...newlyUploaded]);
    return [...keptExisting, ...newlyUploaded];
  };

  return (
    <div>
      <PageMeta
        title="Expense Report Submit"
        description="This is the page for Travel Expense Report submissions."
      />
      {loading ? (
        <div>Loading Expense Report</div>
      ) : error ? (
        <div>Error: {error}</div>
      ) : report === null ? (
        <div>No Report was Found</div>
      ) : (
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
                    key={expense.id ? expense.id : expense.renderId}
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
                    removeExpenditure={removeExpenditure}
                    handleAddFiles={handleAddFiles}
                    handleRemoveFile={handleRemoveFile}
                    uploadedFiles={uploadedFiles[index]}
                    visibleAttachments={
                      visibleAttachments[index]
                        ? visibleAttachments[index]
                        : getVisibleAttachments(index, uploadedFiles)
                    }
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
                <Button size="sm" variant="primary" onClick={handleSubmit}>
                  {t("submit_report_changes_button")}
                </Button>
              </div>
            </div>
          </ComponentCard>
        </div>
      )}
      {submitingUpdate && <LoadingOverlay messageKey="submitting_update" />}
    </div>
  );
}
