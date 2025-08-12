import { Expense, Expenditure, Report } from "../types/ExpenseReport";
import { t } from "i18next";

export interface ValidationError {
  field: string; // Field name that caused the error
  message: string; // Error message to display
  displayName?: string; // Name to display in the UI (optional)
}

export const validateReport = (report: Report): ValidationError[] => {
  const errors: ValidationError[] = [];

  // Validate report level fields
  if (!report.description?.trim()) {
    errors.push({
      field: "description",
      message: t("error_required_field"),
      displayName: t("description"),
    });
  }

  if (!report.company) {
    errors.push({
      field: "company",
      message: t("error_required_field"),
      displayName: t("company"),
    });
  }
  if (!report.unit) {
    errors.push({
      field: "unit",
      message: t("error_required_field"),
      displayName: t("unit"),
    });
  }
  if (!report.office) {
    errors.push({
      field: "office",
      message: t("error_required_field"),
      displayName: t("office"),
    });
  }
  if (!report.type_of_employee) {
    errors.push({
      field: "type_of_employee",
      message: t("error_required_field"),
      displayName: t("collaborator_type"),
    });
  }

  if (!report.type_of_document) {
    errors.push({
      field: "type_of_document",
      message: t("error_required_field"),
      displayName: t("document_type"),
    });
  }

  if (!report.direction) {
    errors.push({
      field: "direction",
      message: t("error_required_field"),
      displayName: t("direction"),
    });
  }

  if (!report.project_client?.trim()) {
    errors.push({
      field: "project_client",
      message: t("error_required_field"),
      displayName: t("project_client"),
    });
  }

  if (report.expenses && report.expenses.length > 0) {
    report.expenses.forEach((expense, expenseIndex) => {
      validateExpense(expense, expenseIndex, errors);
    });
  }

  return errors;
};

const validateExpense = (
  expense: Expense,
  expenseIndex: number,
  errors: ValidationError[]
): void => {
  // Required travel fields - if exist, is required
  if (!expense.departure_date) {
    errors.push({
      field: `departure_date_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("departure_date"),
    });
  }

  if (!expense.departure_time) {
    errors.push({
      field: `departure_time_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("departure_time"),
    });
  }

  if (!expense.arrival_date) {
    errors.push({
      field: `arrival_date_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("arrival_date"),
    });
  }

  if (!expense.arrival_time) {
    errors.push({
      field: `arrival_time_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("arrival_time"),
    });
  }

  if (!expense.travel_type) {
    errors.push({
      field: `travel_type_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("travel_expense"),
    });
  }

  if (!expense.departure_place?.trim()) {
    errors.push({
      field: `departure_place_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("travel_expense"),
    });
  }

  if (!expense.arrival_place?.trim()) {
    errors.push({
      field: `arrival_place_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("travel_expense"),
    });
  }

  if (!expense.meeting_place?.trim()) {
    errors.push({
      field: `meeting_place_${expenseIndex}`,
      message: t("error_required_field"),
      displayName: t("travel_expense"),
    });
  }

  if (expense.expenditures && expense.expenditures.length > 0) {
    expense.expenditures.forEach((expenditure, expenditureIndex) => {
      validateExpenditure(expenditure, expenseIndex, expenditureIndex, errors);
    });
  }
};

const validateExpenditure = (
  expenditure: Expenditure,
  expenseIndex: number,
  expenditureIndex: number,
  errors: ValidationError[]
): void => {
  if (!expenditure.expenditure_type) {
    errors.push({
      field: `expenditure_type_${expenseIndex}_${expenditureIndex}`,
      message: t("error_required_field"),
      displayName: t("expenditure"),
    });
  }

  // Check specific fields based on expenditure type
  if (expenditure.expenditure_type === "CAR") {
    // Car
    if (!expenditure.car_type?.trim()) {
      errors.push({
        field: `car_type_${expenseIndex}_${expenditureIndex}`,
        message: t("error_required_field"),
        displayName: t("expenditure"),
      });
    }

    if (!expenditure.km_travelled) {
      errors.push({
        field: `km_travelled_${expenseIndex}_${expenditureIndex}`,
        message: t("error_required_field"),
        displayName: t("expenditure"),
      });
    }
  } else {
    if (!expenditure.value) {
      errors.push({
        field: `value_${expenseIndex}_${expenditureIndex}`,
        message: t("error_required_field"),
        displayName: t("expenditure"),
      });
    }
  }
};
