import { useState, useCallback } from "react";
import { API_BASE_URL } from "../config";
import { useAuth } from "../auth/AuthContext";

export function useReports() {
  const [loading, setLoading] = useState<boolean>(false);
  const [error, setError] = useState<string | null>(null);
  const { backendAccessToken } = useAuth();

  const getAllReports = useCallback(async () => {
    if (!backendAccessToken) return [];
    setLoading(true);
    setError(null);
    try {
      const res = await fetch(`${API_BASE_URL}/reports/all`, {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
          Authorization: `Bearer ${backendAccessToken}`,
        },
      });
      if (!res.ok) {
        const errText = await res.text();
        throw new Error(
          `Failed to fetch reports: ${errText} (Status: ${res.status})`
        );
      }
      return await res.json();
    } catch (err: any) {
      console.error("Error in getAllReports:", err);
      setError(err.message);
      throw err;
    } finally {
      setLoading(false);
    }
  }, [backendAccessToken]);

  const getReport = useCallback(
    async (id: string) => {
      if (!backendAccessToken) return;
      setLoading(true);
      setError(null);
      try {
        const res = await fetch(`${API_BASE_URL}/reports/${id}`, {
          method: "GET",
          headers: {
            Authorization: `Bearer ${backendAccessToken}`,
          },
        });
        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to fetch report: ${errText} (Status: ${res.status})`
          );
        }
        return await res.json();
      } catch (err: any) {
        console.error("Error in getReport:", err);
        setError(err.message);
        throw err;
      } finally {
        setLoading(false);
      }
    },
    [backendAccessToken]
  );

  const createFullReport = useCallback(
    async (reportData: any, files: File[]) => {
      if (!backendAccessToken) return;
      setLoading(true);
      setError(null);
      try {
        const formData = new FormData();

        formData.append("data", JSON.stringify(reportData));

        files.forEach((file) => {
          formData.append("files", file);
        });

        const res = await fetch(`${API_BASE_URL}/reports/`, {
          method: "POST",
          headers: {
            Authorization: `Bearer ${backendAccessToken}`,
          },
          body: formData,
        });

        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to create full report: ${errText} (Status: ${res.status})`
          );
        }
        return await res.json();
      } catch (err: any) {
        console.error("Error in createFullReport:", err);
        setError(err.message);
        throw err;
      } finally {
        setLoading(false);
      }
    },
    [backendAccessToken]
  );

  const updateReport = useCallback(
    async (id: string, updateData: any, files: File[], deleteData: any) => {
      setLoading(true);
      setError(null);

      const standardizeReportData = (report: any) => {
        const sanitizedExpenses = (report.expenses || []).map(
          (expense: any) => {
            const cleanedExpense: any = {
              ...(expense.id && { id: expense.id }),
              report_id: id,
              departure_date: expense.departure_date,
              departure_time: expense.departure_time,
              arrival_date: expense.arrival_date,
              arrival_time: expense.arrival_time,
              travel_type: expense.travel_type,
              departure_place: expense.departure_place,
              meeting_place: expense.meeting_place,
              arrival_place: expense.arrival_place,
              attachments: expense.attachments || [],
              expenditures: (expense.expenditures || []).map((exp: any) => {
                const cleaned = {
                  ...(exp.id && { id: exp.id }),
                  expense_id: expense.id,
                  expenditure_type: exp.expenditure_type,
                  value: exp.value,
                  car_type: exp.car_type || "",
                  license_plate: exp.license_plate || "",
                  km_travelled: exp.km_travelled ?? 0,
                  fuel: exp.fuel ?? 0,
                  parking_tolls: exp.parking_tolls ?? 0,
                };

                delete cleaned.fetched_from_api;
                return cleaned;
              }),
            };
            delete cleanedExpense.fetched_from_api;
            return cleanedExpense;
          }
        );

        return {
          ...report,
          expenses: sanitizedExpenses,
        };
      };

      try {
        const formData = new FormData();

        const standardizedData = standardizeReportData(updateData);

        formData.append(
          "data",
          JSON.stringify({
            delete: deleteData,
            ...standardizedData,
          })
        );

        files.forEach((file) => {
          formData.append("files", file);
        });

        const res = await fetch(`${API_BASE_URL}/reports/${id}`, {
          method: "PUT",
          headers: {
            Authorization: `Bearer ${backendAccessToken}`,
          },
          body: formData,
        });
        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to update report: ${errText} (Status: ${res.status})`
          );
        }
        return await res.json();
      } catch (err: any) {
        console.error("Error in updateReport:", err);
        setError(err.message);
        throw err;
      } finally {
        setLoading(false);
      }
    },
    []
  );

  const deleteReport = useCallback(async (id: number) => {
    setLoading(true);
    setError(null);
    try {
      const res = await fetch(`${API_BASE_URL}/reports/${id}`, {
        method: "DELETE",
      });
      if (!res.ok) {
        const errText = await res.text();
        throw new Error(
          `Failed to delete report: ${errText} (Status: ${res.status})`
        );
      }
      return true;
    } catch (err: any) {
      console.error("Error in deleteReport:", err);
      setError(err.message);
      throw err;
    } finally {
      setLoading(false);
    }
  }, []);

  const getMonthlySummary = useCallback(async () => {
    if (!backendAccessToken) return;
    setLoading(true);
    setError(null);
    try {
      const res = await fetch(`${API_BASE_URL}/reports/monthly-summary`, {
        method: "GET",
        headers: {
          Authorization: `Bearer ${backendAccessToken}`,
        },
      });
      if (!res.ok) {
        const errText = await res.text();
        throw new Error(
          `Failed to fetch monthly summary: ${errText} (Status: ${res.status})`
        );
      }
      const data = await res.json();
      return data;
    } catch (err: any) {
      console.error("Error in getMonthlySummary:", err);
      setError(err.message);
      throw err;
    } finally {
      setLoading(false);
    }
  }, [backendAccessToken]);

  return {
    getAllReports,
    getReport,
    createFullReport,
    updateReport,
    deleteReport,
    getMonthlySummary,
    loading,
    error,
  };
}
