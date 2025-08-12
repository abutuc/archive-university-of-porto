import { NavigateFunction } from "react-router";
import { Report } from "../../../types/ExpenseReport";
import { toast } from "react-hot-toast";
import { useSystemVariables } from "../../../hooks/useSystemVariables";

export function useEditReport(
  reportId: string,
  report: Report,
  uploadedFiles: Record<number, File[]>,
  deleteData: { expenses: string[]; expenditures: string[] },
  totalExpenditure: number,
  advancePayments: number,
  companyPayments: number,
  receivePay: number,
  updateReport: (
    id: string,
    updateData: any,
    files: File[],
    deleteData: any
  ) => Promise<any>,
  navigate: NavigateFunction,
  setLoading: (loading: boolean) => void
) {
  const { variables } = useSystemVariables();

  return () => {
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
    updateReport(reportId, report, files, deleteData)
      .then((_response) => {
        toast.success("Expense report updated successfully!");
        navigate("/view-expense-report", { state: { reportId: reportId } });
      })
      .catch((_error) => {
        toast.error("Failed to update expense report.");
      })
      .finally(() => {
        setLoading(false);
      });
  };
}
