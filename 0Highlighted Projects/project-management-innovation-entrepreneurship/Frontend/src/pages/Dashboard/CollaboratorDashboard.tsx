import { useEffect, useState } from "react";
import { useNavigate } from "react-router";
import Button from "../../components/Button";
import { useTranslation } from "react-i18next";
import { useReports } from "../../hooks/useReports";
import {
  collaboratorTableColumns,
  TabularExpenseReport,
} from "../../types/ExpenseReportTable";
import { ReportsTable } from "./components/ReportsTable";
import { Pagination } from "./components/Pagination";
import { ITEMS_PER_PAGE } from "../../constants";
import PageMeta from "../../components/PageMeta";
import { useAuth } from "../../auth/AuthContext";
import { API_BASE_URL } from "../../config";

interface NoReportsMessage {
  message: string;
}

export default function CollaboratorDashboard() {
  const { t } = useTranslation();
  const navigate = useNavigate();
  const { getAllReports, loading, error } = useReports();
  const { backendAccessToken } = useAuth();

  const [expenseReports, setExpenseReports] = useState<TabularExpenseReport[]>(
    []
  );
  const [currentPage, setCurrentPage] = useState(1);
  const [paginatedReports, setPaginatedReports] = useState<
    TabularExpenseReport[]
  >([]);

  useEffect(() => {
    async function checkUserProfile() {
      try {
        const response = await fetch(`${API_BASE_URL}/user/me`, {
          headers: {
            Authorization: `Bearer ${backendAccessToken}`,
          },
        });

        if (!response.ok) {
          throw new Error("Failed to fetch user profile");
        }

        const user = await response.json();

        const requiredFields = [
          "company",
          "direction",
          "unit",
          "office",
          "type_of_employee",
        ];

        const hasEmptyFields = requiredFields.some(
          (field) => !user[field] || user[field].trim() === ""
        );

        if (hasEmptyFields) {
          navigate("/profile", { replace: true });
        }
      } catch (error) {
        console.error("User profile validation error:", error);
        // Optional: navigate to error page
      }
    }

    checkUserProfile();
  }, [backendAccessToken, navigate]);

  useEffect(() => {
    async function fetchReports() {
      try {
        const result: TabularExpenseReport[] | NoReportsMessage =
          await getAllReports();

        if (Array.isArray(result)) {
          setExpenseReports(result);
        } else if (
          result &&
          typeof result === "object" &&
          "message" in result
        ) {
          setExpenseReports([]);
          console.log("Received message from backend:", result.message);
        } else {
          console.warn("Received unexpected data structure:", result);
          setExpenseReports([]);
        }
      } catch (err) {
        console.error("Failed to fetch or process reports:", err);
        setExpenseReports([]);
      }
    }

    fetchReports();
  }, [getAllReports]);

  useEffect(() => {
    setPaginatedReports(
      expenseReports.slice(
        (currentPage - 1) * ITEMS_PER_PAGE,
        currentPage * ITEMS_PER_PAGE
      )
    );
  }, [expenseReports, currentPage]);

  const handleCreateExpenseReportClick = () => {
    navigate("/submit-report");
  };

  const noReportsFound = !loading && !error && expenseReports.length === 0;

  return (
    <div className="p-4 sm:p-6">
      <PageMeta
        title="Dashboard"
        description="This is the page for looking at the submitted reports"
      />
      <div className="grid grid-cols-2">
        <h1 className="mb-4 text-2xl font-semibold">
          {t("collaborator_dashboard_title")}
        </h1>
        <div className="grid grid-cols-1">
          <div className="flex justify-end items-start pb-5">
            <Button
              size="sm"
              variant="outline"
              onClick={handleCreateExpenseReportClick}
            >
              {t("create_expense_report_button")}
            </Button>
          </div>
        </div>
      </div>

      {loading ? (
        <div className="p-4 text-center text-gray-500">
          {t("loading_reports")}...
        </div>
      ) : error ? (
        <div className="p-4 text-center text-red-500">
          {t("error_fetching_reports")}: {error}
        </div>
      ) : noReportsFound ? (
        <div className="p-4 text-center text-gray-500">
          {t("no_expense_reports_found")}
        </div>
      ) : (
        <div>
          <div className="overflow-hidden rounded-xl border border-gray-200 bg-white">
            <div className="max-w-full overflow-x-auto">
              <div className="min-w-[1102px] block">
                <ReportsTable
                  columns={collaboratorTableColumns}
                  reports={paginatedReports}
                />
              </div>
            </div>
          </div>
          <Pagination
            totalNumberOfReports={expenseReports.length}
            itemsPerPage={ITEMS_PER_PAGE}
            currentPage={currentPage}
            setCurrentPage={setCurrentPage}
          />
        </div>
      )}
    </div>
  );
}
