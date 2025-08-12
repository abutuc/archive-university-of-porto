import { ExpenseReportStatus } from "./ExpenseReportStatus";

export type Report = {
  status?: ExpenseReportStatus;
  description: string;
  company: string;
  direction: string;
  unit: string;
  office: string;
  type_of_employee: string;
  type_of_document: string;
  project_client: string;
  total_expenditure: number;
  advance_payments: number;
  company_payments: number;
  receive_pay: number;
  expenses?: Expense[];
};

export type Expense = {
  id?: string;
  renderId: string;
  departure_date: string;
  departure_time: string;
  arrival_date: string;
  arrival_time: string;
  travel_type: string;
  departure_place: string;
  meeting_place: string;
  arrival_place: string;
  attachments?: string[];
  expenditures?: Expenditure[];
  fetched_from_api?: boolean;
};

export type Expenditure = {
  id?: string;
  renderId: string;
  expenditure_type: string;
  car_type: string;
  km_travelled: number;
  license_plate: string;
  fuel: number;
  parking_tolls: number;
  value: number;
  fetched_from_api?: boolean;
};

export type ViewReport = {
  id: string;
  status: ExpenseReportStatus;
  description: string;
  submissionDate: string;
  company: string;
  direction: string;
  unit: string;
  office: string;
  name_of_employee: string;
  type_of_employee: string;
  type_of_document: string;
  is_update_request: boolean;
  project: string;
  expenses: ViewExpense[];
  total_expenditure: number;
  advance_payments: number;
  company_payments: number;
  receive_pay: number;
  review?: Review;
};

export type Review = {
  id: string;
  report_id: string;
  observations: string;
  approved: boolean;
  created_at: string;
};

export type ViewExpense = {
  departure_date: string;
  departure_time: string;
  arrival_date: string;
  arrival_time: string;
  travel_type: string;
  departure_place: string;
  meeting_place: string;
  arrival_place: string;
  attachments?: Attachment[];
  expenditures: Expenditure[];
};

export type Attachment = {
  created_at: string;
  file_name: string;
  file_path: string;
  id: string;
};
