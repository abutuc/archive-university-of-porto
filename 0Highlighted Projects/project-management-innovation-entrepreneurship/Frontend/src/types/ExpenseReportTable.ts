import { ExpenseReportStatus } from "./ExpenseReportStatus";
import { TableCellType } from "./TableCellType";

export interface TabularExpenseReportColumn {
  columnLabel: string;
  columnKey: keyof TabularExpenseReport;
  columnType: TableCellType;
}

export const collaboratorTableColumns: TabularExpenseReportColumn[] = [
  {
    columnLabel: "ID",
    columnKey: "id",
    columnType: TableCellType.TEXT,
  },
  {
    columnLabel: "dashboard_project",
    columnKey: "project_client",
    columnType: TableCellType.TEXT,
  },
  {
    columnLabel: "dashboard_description",
    columnKey: "description",
    columnType: TableCellType.TEXT,
  },
  {
    columnLabel: "dashboard_submission_date",
    columnKey: "created_at",
    columnType: TableCellType.DATE,
  },
  {
    columnLabel: "dashboard_status",
    columnKey: "status",
    columnType: TableCellType.STATUS,
  },
];

export const staffTableColumns: TabularExpenseReportColumn[] = [
  {
    columnLabel: "ID",
    columnKey: "id",
    columnType: TableCellType.TEXT,
  },
  {
    columnLabel: "dashboard_collaborator_name",
    columnKey: "collaborator_name",
    columnType: TableCellType.TEXT,
  },
  {
    columnLabel: "dashboard_project",
    columnKey: "project_client",
    columnType: TableCellType.TEXT,
  },
  {
    columnLabel: "dashboard_submission_date",
    columnKey: "created_at",
    columnType: TableCellType.DATE,
  },
  {
    columnLabel: "dashboard_status",
    columnKey: "status",
    columnType: TableCellType.STATUS,
  },
];

export interface TabularExpenseReport {
  id: string;
  project_client: string;
  description: string;
  created_at: string;
  status: ExpenseReportStatus;
  collaborator_name: string;
}
