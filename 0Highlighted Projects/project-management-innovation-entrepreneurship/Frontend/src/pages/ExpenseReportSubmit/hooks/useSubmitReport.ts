import { NavigateFunction } from "react-router";
import { Report } from "../../../types/ExpenseReport";
import { toast } from "react-hot-toast";
import { validateReport } from "../../../utils/ValidationUtils";
import { useTranslation } from "react-i18next";
import { useSystemVariables } from "../../../hooks/useSystemVariables";

export function useSubmitReport(
  report: Report,
  uploadedFiles: Record<number, File[]>,
  totalExpenditure: number,
  advancePayments: number,
  companyPayments: number,
  receivePay: number,
  createFullReport: (reportData: any, files: File[]) => Promise<any>,
  navigate: NavigateFunction,
  setLoading: (loading: boolean) => void
) {
  const { t } = useTranslation();

  const { variables } = useSystemVariables();

  return () => {
    // Validate the report first
    const validationErrors = validateReport(report);

    if (validationErrors.length > 0) {
      const headerErrors = new Set<string>();
      let hasTravelExpenseErrors = false;
      let hasExpenditureErrors = false;

      validationErrors.forEach((error) => {
        const fieldName = error.field;

        // Ignores the "expenses" field, as it is not a header field
        if (fieldName === "expenses") {
          return;
        }

        if (fieldName.includes("_") && /\d/.test(fieldName)) {
          // Se tem underscore e números, é um campo de expense ou expenditure
          if (fieldName.match(/_\d+_\d+/)) {
            // Se tem padrão _X_Y (dois conjuntos de números), é expenditure
            hasExpenditureErrors = true;
          } else if (fieldName.match(/_\d+$/)) {
            // Se termina com _X, é travel expense
            hasTravelExpenseErrors = true;
          }
        } else {
          // É um campo do cabeçalho do relatório
          // Usar o displayName quando disponível, ou traduzir o campo
          const displayName = error.displayName || t(fieldName);
          headerErrors.add(displayName);
        }
      });

      // Error list
      const errorMessages: string[] = [];

      // Adds header errors to the list
      headerErrors.forEach((field) => errorMessages.push(`- ${field}`));

      // Generic error message for header fields
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

    const files = Object.values(uploadedFiles).flat();

    report.expenses?.forEach((expense) => {
      expense.expenditures?.forEach((expenditure) => {
        if (expenditure.expenditure_type === "CAR") {
          const km =
            Number(expenditure.km_travelled || 0) *
            parseFloat(variables["PER_KM_COST"]);
          const fuel = Number(expenditure.fuel || 0);
          const parking = Number(expenditure.parking_tolls || 0);
          expenditure.value = Number((km + fuel + parking).toFixed(2));
        }
      });
    });

    report.total_expenditure = totalExpenditure;
    report.advance_payments = advancePayments;
    report.company_payments = companyPayments;
    report.receive_pay = receivePay;

    setLoading(true);
    createFullReport(report, files)
      .then((_response) => {
        toast.success(t("expense_report_submitted_successfully"));
        navigate("/");
      })
      .catch((_error) => {
        toast.error(t("failed_submit_expense_report"));
      })
      .finally(() => {
        setLoading(false);
      });
  };
}
