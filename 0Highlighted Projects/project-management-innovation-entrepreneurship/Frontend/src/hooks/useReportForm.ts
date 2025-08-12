import { useEffect, useState } from "react";
import { v4 as uuidv4 } from "uuid";
import { Report, Expense, Expenditure } from "../types/ExpenseReport";
import { DateRenderMap } from "../types/ExpenseReportForm";
import { API_BASE_URL } from "../config";
import { useAuth } from "../auth/AuthContext";

type PartialExpenditure = Partial<Expenditure>;

export function useReportForm() {
  const [dateRenderMap, setDateRenderMap] = useState<DateRenderMap>({});
  const { backendAccessToken } = useAuth();

  const [report, setReport] = useState<Report>({
    description: "",
    company: "",
    direction: "",
    unit: "",
    office: "",
    type_of_employee: "",
    type_of_document: "",
    project_client: "",
    total_expenditure: 0,
    advance_payments: 0,
    company_payments: 0,
    receive_pay: 0,
  });

  const handleReportChange = (
    field: keyof Report,
    value: Report[keyof Report]
  ) => {
    setReport((prev) => ({ ...prev, [field]: value }));
  };

  const addExpense = () => {
    const newExpense: Expense = {
      renderId: uuidv4(),
      departure_date: "",
      departure_time: "",
      arrival_date: "",
      arrival_time: "",
      travel_type: "",
      departure_place: "",
      meeting_place: "",
      arrival_place: "",
      attachments: [],
    };

    setReport((prev) => ({
      ...prev,
      expenses: [...(prev.expenses || []), newExpense],
    }));

    setDateRenderMap((prev) => ({
      ...prev,
      [report.expenses ? report.expenses.length : 0]: {
        arrival: undefined,
        departure: undefined,
      },
    }));
  };

  const updateExpense = (
    index: number,
    field: keyof Expense,
    value: Expense[keyof Expense]
  ) => {
    setReport((prev) => {
      if (!prev.expenses) return prev;
      const updated = [...prev.expenses];
      updated[index] = { ...updated[index], [field]: value };
      return { ...prev, expenses: updated };
    });
  };

  const removeExpense = (index: number) => {
    setReport((prev) => {
      if (!prev.expenses) return prev;
      const updated = [...prev.expenses];
      updated.splice(index, 1);
      return { ...prev, expenses: updated };
    });
  };

  const addExpenditure = (expenseIndex: number, data?: PartialExpenditure) => {
    const newExpenditure: Expenditure = {
      renderId: uuidv4(),
      expenditure_type: data?.expenditure_type || "",
      car_type: data?.car_type || "",
      km_travelled: data?.km_travelled || 0,
      license_plate: data?.license_plate || "",
      fuel: data?.fuel || 0,
      parking_tolls: data?.parking_tolls || 0,
      value: data?.value || 0,
    };

    console.log(newExpenditure);

    setReport((prev) => {
      if (!prev.expenses) return prev;
      const updated = [...prev.expenses];
      const expense = updated[expenseIndex];
      updated[expenseIndex] = {
        ...expense,
        expenditures: [...(expense.expenditures || []), newExpenditure],
      };
      return { ...prev, expenses: updated };
    });
  };

  const updateExpenditure = (
    expenseIndex: number,
    expenditureIndex: number,
    field: keyof Expenditure,
    value: Expenditure[keyof Expenditure]
  ) => {
    setReport((prev) => {
      if (!prev.expenses) return prev;
      const updated = [...prev.expenses];
      const expense = updated[expenseIndex];
      if (!expense.expenditures) return prev;
      const exps = [...expense.expenditures];
      exps[expenditureIndex] = { ...exps[expenditureIndex], [field]: value };
      updated[expenseIndex] = { ...expense, expenditures: exps };
      return { ...prev, expenses: updated };
    });
  };

  const removeExpenditure = (
    expenseIndex: number,
    expenditureIndex: number
  ) => {
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

  const setArrivalDateOnRenderMap = (
    expenseId: number,
    date: Date | undefined
  ) => {
    setDateRenderMap((prev) => ({
      ...prev,
      [expenseId]: {
        ...prev[expenseId],
        arrival: date,
      },
    }));
  };

  const setDepartureDateOnRenderMap = (
    expenseId: number,
    date: Date | undefined
  ) => {
    setDateRenderMap((prev) => ({
      ...prev,
      [expenseId]: {
        ...prev[expenseId],
        departure: date,
      },
    }));
  };

  const fetchAndSetUserDefaults = async () => {
    try {
      const response = await fetch(`${API_BASE_URL}/user/me`, {
        method: "GET",
        headers: {
          Authorization: `Bearer ${backendAccessToken}`,
        },
      });

      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }

      const user = await response.json();

      setReport((prev) => ({
        ...prev,
        company: user.company || "",
        direction: user.direction || "",
        unit: user.unit || "",
        office: user.office || "",
        type_of_employee: user.type_of_employee || "",
      }));
    } catch (error) {
      console.error("Failed to fetch user info:", error);
    }
  };
  useEffect(() => {
    fetchAndSetUserDefaults();
  }, [backendAccessToken]);

  return {
    report,
    setReport,
    handleReportChange,
    addExpense,
    updateExpense,
    removeExpense,
    addExpenditure,
    updateExpenditure,
    removeExpenditure,
    dateRenderMap,
    setArrivalDateOnRenderMap,
    setDepartureDateOnRenderMap,
  };
}
