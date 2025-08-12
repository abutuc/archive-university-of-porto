import { useState, useEffect } from "react";
import StatisticsChart from "./components/StatisticsChart";
import { useAuth } from "../../auth/AuthContext";
import { useTranslation } from "react-i18next";
import { useReports } from "../../hooks/useReports";
import { ReportsTable } from "./components/ReportsTable";
import { ITEMS_PER_PAGE } from "../../constants";
import {
  staffTableColumns,
  TabularExpenseReport,
} from "../../types/ExpenseReportTable";
import { Pagination } from "./components/Pagination";
import PageMeta from "../../components/PageMeta";

interface NoReportsMessage {
  message: string;
}

export default function StaffDashboard() {
  const { t } = useTranslation();
  const { jobTitle } = useAuth();
  const { getAllReports, loading, error } = useReports();
  const [expenseReports, setExpenseReports] = useState<TabularExpenseReport[]>(
    []
  );
  const [currentPage, setCurrentPage] = useState(1);
  const [paginatedReports, setPaginatedReports] = useState<
    TabularExpenseReport[]
  >([]);

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

  const noReportsFound = !loading && !error && expenseReports.length === 0;

  const [selectedTab, setSelectedTab] = useState<
    "Issues To Review" | "Statistics"
  >("Issues To Review");

  const getButtonClass = (option: "Issues To Review" | "Statistics") =>
    selectedTab === option
      ? "shadow-theme-xs text-gray-900 dark:text-white bg-white dark:bg-gray-800"
      : "text-gray-500 dark:text-gray-400";

  return (
    <div className="p-4 sm:p-6">
      <PageMeta
        title="Dashboard"
        description="This is the page for looking at the submitted reports."
      />
      <h1 className="mb-4 text-2xl font-semibold">
        {jobTitle === "Financial Officer"
          ? t("fo_dashboard_title")
          : t("acc_dashboard_title")}
      </h1>
      <div className="pb-2">
        <div className="flex items-center gap-0.5 rounded-lg bg-gray-100 p-0.5 dark:bg-gray-900">
          <button
            onClick={() => setSelectedTab("Issues To Review")}
            className={`px-3 py-2 font-medium w-full rounded-md text-theme-sm hover:text-gray-900 dark:hover:text-white ${getButtonClass(
              "Issues To Review"
            )}`}
          >
            {t("dashboard_issues_to_review")}
          </button>

          <button
            onClick={() => setSelectedTab("Statistics")}
            className={`px-3 py-2 font-medium w-full rounded-md text-theme-sm hover:text-gray-900 dark:hover:text-white ${getButtonClass(
              "Statistics"
            )}`}
          >
            {t("dashboard_statistics")}
          </button>
        </div>
      </div>
      {selectedTab === "Issues To Review" && (
        <>
          <div className="overflow-hidden rounded-xl border border-gray-200 bg-white dark:border-white/[0.05] dark:bg-white/[0.03]">
            {loading ? (
              <div className="p-4 text-center text-gray-500 dark:text-gray-400">
                {t("loading_reports")}...
              </div>
            ) : error ? (
              <div className="p-4 text-center text-red-500">
                {t("error_fetching_reports")}: {error}
              </div>
            ) : noReportsFound ? (
              <div className="p-4 text-center text-gray-500 dark:text-gray-400">
                {t("no_expense_reports_found")}
              </div>
            ) : (
              <>
                <div className="max-w-full overflow-x-auto">
                  <div className="min-w-[1102px] block">
                    <ReportsTable
                      columns={staffTableColumns}
                      reports={paginatedReports}
                    />
                  </div>
                </div>
              </>
            )}
          </div>
          <Pagination
            totalNumberOfReports={expenseReports.length}
            itemsPerPage={ITEMS_PER_PAGE}
            currentPage={currentPage}
            setCurrentPage={setCurrentPage}
          />
        </>
      )}
      {selectedTab === "Statistics" && <StatisticsChart />}
    </div>
  );
}
