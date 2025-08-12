import { Expenditure, Expense, Report } from "../types/ExpenseReport";
import {
  LOCAL_LUNCH_THRESHOLD,
  LOCAL_DINNER_THRESHOLD,
  INTERNATIONAL_LUNCH_THRESHOLD,
  INTERNATIONAL_DINNER_THRESHOLD,
} from "../constants";

let PER_KM_COST = 0;
let LOCAL_COST_ALLOWANCE = 0;
let INTERNATIONAL_COST_ALLOWANCE = 0;

export const reimbursementCalculator = (
  report: Report,
  variables: Record<string, string>
): number => {
  PER_KM_COST = parseFloat(variables["PER_KM_COST"]);
  LOCAL_COST_ALLOWANCE = parseFloat(variables["LOCAL_COST_ALLOWANCE"]);
  INTERNATIONAL_COST_ALLOWANCE = parseFloat(
    variables["INTERNATIONAL_COST_ALLOWANCE"]
  );

  if (!report?.expenses || !Array.isArray(report.expenses)) return 0;

  const totalExpenditure = report.expenses.reduce((total, expense) => {
    let allowance = 0;

    if (expense.travel_type === "LOCAL") {
      allowance += calculateLocalAllowance(expense);
    } else if (expense.travel_type === "INTERNATIONAL") {
      allowance += calculateInternationalAllowance(expense, report.office);
    }

    const expenditures = Array.isArray(expense.expenditures)
      ? expense.expenditures
      : [];
    const cost = calculateExpenditures(expenditures);

    return total + allowance + cost;
  }, 0);

  return Number(totalExpenditure.toFixed(2));
};

const toMinutes = (time: string): number => {
  const [hours, minutes] = time.split(":").map(Number);
  return hours * 60 + minutes;
};

const calculateLocalAllowance = (expense: Expense): number => {
  const depTime = toMinutes(expense.departure_time);
  const arrTime = toMinutes(expense.arrival_time);
  let allowance = 0;

  if (expense.departure_date === expense.arrival_date) {
    if (depTime < LOCAL_LUNCH_THRESHOLD && arrTime >= LOCAL_LUNCH_THRESHOLD) {
      allowance += LOCAL_COST_ALLOWANCE;
    }
    if (depTime < LOCAL_DINNER_THRESHOLD && arrTime >= LOCAL_DINNER_THRESHOLD) {
      allowance += LOCAL_COST_ALLOWANCE;
    }
  } else {
    if (depTime < LOCAL_LUNCH_THRESHOLD) allowance += LOCAL_COST_ALLOWANCE;
    if (depTime < LOCAL_DINNER_THRESHOLD) allowance += LOCAL_COST_ALLOWANCE;
    if (arrTime >= LOCAL_LUNCH_THRESHOLD) allowance += LOCAL_COST_ALLOWANCE;
    if (arrTime >= LOCAL_DINNER_THRESHOLD) allowance += LOCAL_COST_ALLOWANCE;

    const days = getTravelDays(expense);
    if (days > 2) {
      allowance += (days - 2) * LOCAL_COST_ALLOWANCE * 2;
    }
  }

  return allowance;
};

const calculateInternationalAllowance = (
  expense: Expense,
  office: string
): number => {
  const depTime = toMinutes(expense.departure_time);
  const arrTime = toMinutes(expense.arrival_time);
  let allowance = 0;

  const intlAllowance =
    office === "GERMANY" ? LOCAL_COST_ALLOWANCE : INTERNATIONAL_COST_ALLOWANCE;

  if (expense.departure_date === expense.arrival_date) {
    if (
      depTime <= INTERNATIONAL_LUNCH_THRESHOLD &&
      arrTime >= LOCAL_LUNCH_THRESHOLD
    ) {
      allowance += intlAllowance;
    } else if (
      depTime < LOCAL_LUNCH_THRESHOLD &&
      arrTime >= LOCAL_LUNCH_THRESHOLD
    ) {
      allowance += LOCAL_COST_ALLOWANCE;
    }

    if (
      depTime <= INTERNATIONAL_DINNER_THRESHOLD &&
      arrTime >= LOCAL_DINNER_THRESHOLD
    ) {
      allowance += intlAllowance;
    } else if (
      depTime < LOCAL_DINNER_THRESHOLD &&
      arrTime >= LOCAL_DINNER_THRESHOLD
    ) {
      allowance += LOCAL_COST_ALLOWANCE;
    }
  } else {
    if (depTime <= INTERNATIONAL_LUNCH_THRESHOLD) {
      allowance += intlAllowance;
    } else if (depTime < LOCAL_LUNCH_THRESHOLD) {
      allowance += LOCAL_COST_ALLOWANCE;
    }

    if (depTime <= INTERNATIONAL_DINNER_THRESHOLD) {
      allowance += intlAllowance;
    } else if (depTime < LOCAL_DINNER_THRESHOLD) {
      allowance += LOCAL_COST_ALLOWANCE;
    }

    if (arrTime >= LOCAL_LUNCH_THRESHOLD) {
      allowance += intlAllowance;
    }
    if (arrTime >= LOCAL_DINNER_THRESHOLD) {
      allowance += LOCAL_COST_ALLOWANCE;
    }

    const days = getTravelDays(expense);
    if (days > 2) {
      allowance += (days - 2) * intlAllowance * 2;
    }
  }

  return allowance;
};

const calculateExpenditures = (expenditures: Expenditure[]): number => {
  return expenditures.reduce((sum, expenditure) => {
    if (expenditure.expenditure_type === "CAR") {
      const km = Number(expenditure.km_travelled || 0) * PER_KM_COST;
      const fuel = Number(expenditure.fuel || 0);
      const parking = Number(expenditure.parking_tolls || 0);
      return sum + km + fuel + parking;
    }
    return sum + Number(expenditure.value || 0);
  }, 0);
};

const getTravelDays = (expense: Expense): number => {
  const start = new Date(expense.departure_date);
  const end = new Date(expense.arrival_date);
  return (
    Math.round((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24)) + 1
  );
};
