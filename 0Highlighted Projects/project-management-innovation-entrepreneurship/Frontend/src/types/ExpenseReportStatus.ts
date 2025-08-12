import { t } from "i18next";

type BadgeColor =
  | "primary"
  | "success"
  | "error"
  | "warning"
  | "info"
  | "light"
  | "dark";

export enum ExpenseReportStatus {
  PENDING_FO_REVIEW = "PENDING_FO_REVIEW",
  PENDING_ACCOUNTANT_REVIEW = "PENDING_ACCOUNTANT_REVIEW",
  APPROVED = "APPROVED",
  JUSTIFICATION_CORRECTION_REQUIRED = "JUSTIFICATION_CORRECTION_REQUIRED",
  ADDITIONAL_STEPS_REQUIRED = "ADDITIONAL_STEPS_REQUIRED",
}

interface ExpenseReportStatusConfig {
  label: string;
  color: BadgeColor;
}

const expenseReportStatusConfig: Record<
  ExpenseReportStatus,
  ExpenseReportStatusConfig
> = {
  [ExpenseReportStatus.PENDING_FO_REVIEW]: {
    label: "Pending Financial Officer Review",
    color: "info",
  },
  [ExpenseReportStatus.PENDING_ACCOUNTANT_REVIEW]: {
    label: "Pending Accountant Review",
    color: "primary",
  },
  [ExpenseReportStatus.APPROVED]: {
    label: "Approved",
    color: "success",
  },
  [ExpenseReportStatus.JUSTIFICATION_CORRECTION_REQUIRED]: {
    label: "Justification Correction Required",
    color: "error",
  },
  [ExpenseReportStatus.ADDITIONAL_STEPS_REQUIRED]: {
    label: "Additional Steps Required",
    color: "warning",
  },
};

export function getExpenseReportStatusLabel(
  status: ExpenseReportStatus
): string {
  const label = expenseReportStatusConfig[status].label;
  if (label) {
    return t(label);
  } else {
    return "Unknown Status";
  }
}

export function getExpenseReportStatusBadgeColor(
  status: ExpenseReportStatus
): BadgeColor {
  const color = expenseReportStatusConfig[status].color;
  if (color) {
    return color;
  } else {
    return "light";
  }
}
