import { useCallback, useEffect, useState } from "react";
import { ViewReport } from "../../../types/ExpenseReport";
import { useTranslation } from "react-i18next";

export function useReportView({
  reportId,
  getReport,
  catalogs,
}: {
  reportId: string;
  getReport: (id: string) => Promise<any>;
  catalogs: {
    companies: any[];
    directions: any[];
    units: any[];
    offices: any[];
    employeeTypes: any[];
    documentTypes: any[];
    travelTypes: any[];
    expenditureTypes: any[];
  };
}) {
  const [currentReport, setCurrentReport] = useState<ViewReport | null>(null);
  const { i18n } = useTranslation();
  const lang = i18n.language;

  const {
    companies,
    directions,
    units,
    offices,
    employeeTypes,
    documentTypes,
    travelTypes,
    expenditureTypes,
  } = catalogs;

  const allCatalogsLoaded =
    companies.length &&
    directions.length &&
    units.length &&
    offices.length &&
    employeeTypes.length &&
    documentTypes.length &&
    travelTypes.length &&
    expenditureTypes.length;

  const fetchReport = useCallback(async () => {
    if (!allCatalogsLoaded) return;

    try {
      const report = await getReport(reportId);
      const mappedReport: ViewReport = {
        id: report.id,
        company:
          companies.find((company) => company.value === report.company)
            ?.label || "Unknown",
        status: report.status,
        is_update_request: report.is_update_request,
        description: report.description,
        submissionDate: report.created_at,
        direction:
          directions.find((direction) => direction.value === report.direction)
            ?.label || "Unknown",
        unit:
          units.find((unit) => unit.value === report.unit)?.label || "Unknown",
        office:
          offices.find((office) => office.value === report.office)?.label ||
          "Unknown",
        name_of_employee: report.name_of_employee,
        type_of_employee:
          employeeTypes.find((type) => type.value === report.type_of_employee)
            ?.label || "Unknown",
        type_of_document:
          documentTypes.find((type) => type.value === report.type_of_document)
            ?.label || "Unknown",
        project: report.project_client,
        expenses: report.expenses.map((expense: any) => ({
          departure_date: expense.departure_date,
          departure_time: expense.departure_time,
          arrival_date: expense.arrival_date,
          arrival_time: expense.arrival_time,
          travel_type:
            travelTypes.find((type) => type.value === expense.travel_type)
              ?.label || "Unknown",
          departure_place: expense.departure_place,
          meeting_place: expense.meeting_place,
          arrival_place: expense.arrival_place,
          attachments: expense.attachments,
          expenditures: expense.expenditures.map((expenditure: any) => ({
            expenditure_type:
              expenditureTypes.find(
                (type) => type.value === expenditure.expenditure_type
              )?.label || "Unknown",
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
        review: report.review
          ? {
              id: report.review.id,
              report_id: report.review.report_id,
              observations: report.review.observations,
              approved: report.review.approved,
              created_at: report.review.created_at,
            }
          : undefined,
      };

      setCurrentReport(mappedReport);
    } catch (err) {
      console.error("Error fetching expense:", err);
      setCurrentReport(null);
    }
  }, [reportId, getReport, allCatalogsLoaded, lang]);

  useEffect(() => {
    if (allCatalogsLoaded) {
      fetchReport();
    }
  }, [fetchReport, allCatalogsLoaded]);

  return { currentReport, fetchReport };
}
