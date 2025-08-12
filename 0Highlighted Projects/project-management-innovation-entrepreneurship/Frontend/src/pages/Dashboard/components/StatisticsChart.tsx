import Chart from "react-apexcharts";
import { ApexOptions } from "apexcharts";
import ChartTab from "./ChartTab";
import Select from "../../../components/Select";
import { useState, useEffect, useCallback } from "react";
import { useReports } from "../../../hooks/useReports";
import { useAuth } from "../../../auth/AuthContext";
import { useTranslation } from "react-i18next";
import { useCatalogs } from "../../../hooks/useCatalogs";
import { mapToOptions } from "../../../utils/CatalogMapper";

// Types
type MonthlySummaryItem = {
  year: number;
  month: number;
  amount: number;
};

type MonthlySummaryResponse = Record<string, MonthlySummaryItem[]>;

export default function StatisticsChart() {
  const { getMonthlySummary } = useReports();
  const { backendAccessToken } = useAuth();
  const { t, i18n } = useTranslation();
  const { catalogs } = useCatalogs();

  const [summaryData, setSummaryData] = useState<MonthlySummaryResponse>({});

  const expenditureTypes = mapToOptions(
    catalogs.expenditure_types,
    i18n.language
  );

  const [selectedType, setSelectedType] = useState<string>("");
  const [selectedMode, setSelectedMode] = useState<
    "monthly" | "quarterly" | "annually"
  >("monthly");
  const [selectedYear, setSelectedYear] = useState<string>("");
  const [series, setSeries] = useState<{ name: string; data: number[] }[]>([]);
  const [isLoaded, setIsLoaded] = useState(false);

  const [options, setOptions] = useState<ApexOptions>({
    legend: { show: false },
    colors: ["#465FFF", "#9CB9FF"],
    chart: {
      fontFamily: "Outfit, sans-serif",
      height: 310,
      type: "line",
      toolbar: { show: false },
    },
    stroke: { curve: "straight", width: [2, 2] },
    fill: { type: "gradient", gradient: { opacityFrom: 0.55, opacityTo: 0 } },
    markers: {
      size: 0,
      strokeColors: "#fff",
      strokeWidth: 2,
      hover: { size: 6 },
    },
    grid: {
      xaxis: { lines: { show: false } },
      yaxis: { lines: { show: true } },
    },
    dataLabels: { enabled: false },
    tooltip: { enabled: true },
    xaxis: {
      type: "category",
      categories: [],
      axisBorder: { show: false },
      axisTicks: { show: false },
      tooltip: { enabled: false },
    },
    yaxis: {
      labels: { style: { fontSize: "12px", colors: ["#6B7280"] } },
      title: { text: "", style: { fontSize: "0px" } },
    },
  });

  const transformData = useCallback(
    (
      data: MonthlySummaryItem[],
      mode: "monthly" | "quarterly" | "annually"
    ) => {
      if (mode === "monthly" || mode === "quarterly") {
        const filteredYear = parseInt(selectedYear);
        const filteredData = selectedYear
          ? data.filter((item) => item.year === filteredYear)
          : data;

        if (mode === "monthly") {
          const months = Array(12).fill(0);
          filteredData.forEach(({ month, amount }) => {
            months[month - 1] += amount;
          });
          return {
            categories: [
              "Jan",
              "Feb",
              "Mar",
              "Apr",
              "May",
              "Jun",
              "Jul",
              "Aug",
              "Sep",
              "Oct",
              "Nov",
              "Dec",
            ],
            data: months,
          };
        } else {
          const quarters = Array(4).fill(0);
          filteredData.forEach(({ month, amount }) => {
            const quarter = Math.floor((month - 1) / 3);
            quarters[quarter] += amount;
          });
          return {
            categories: ["Q1", "Q2", "Q3", "Q4"],
            data: quarters,
          };
        }
      } else {
        const yearMap: Record<number, number> = {};
        data.forEach(({ year, amount }) => {
          yearMap[year] = (yearMap[year] || 0) + amount;
        });

        let years = Object.keys(yearMap)
          .map(Number)
          .sort((a, b) => a - b);

        if (years.length === 1) {
          const onlyYear = years[0];
          years = [onlyYear - 1, onlyYear, onlyYear + 1];
          return {
            categories: years.map(String),
            data: [0, yearMap[onlyYear], 0],
          };
        }

        return {
          categories: years.map(String),
          data: years.map((year) => yearMap[year]),
        };
      }
    },
    [selectedYear]
  );

  useEffect(() => {
    const fetchData = async () => {
      try {
        const [summary] = await Promise.all([getMonthlySummary(), ,]);

        setSummaryData(summary);

        const firstKey = Object.keys(summary)[0];
        if (firstKey) setSelectedType(firstKey);
      } catch (err) {
        console.error("Error fetching summary or expenditure types:", err);
      } finally {
        setIsLoaded(true);
      }
    };
    fetchData();
  }, [getMonthlySummary, i18n.language, backendAccessToken]);

  useEffect(() => {
    if (!selectedType || !summaryData[selectedType]) return;
    const transformed = transformData(summaryData[selectedType], selectedMode);

    const label =
      expenditureTypes.find((et) => et.value === selectedType)?.label ||
      selectedType;
    setSeries([{ name: label, data: transformed.data }]);
    setOptions((prev) => ({
      ...prev,
      xaxis: { ...prev.xaxis, categories: transformed.categories },
    }));
  }, [
    selectedType,
    selectedMode,
    summaryData,
    expenditureTypes,
    transformData,
  ]);

  const selectOptions = Object.keys(summaryData).map((key) => ({
    value: key,
    label: expenditureTypes.find((et) => et.value === key)?.label || key,
  }));

  const availableYears = selectedType
    ? Array.from(new Set(summaryData[selectedType].map((item) => item.year)))
        .sort((a, b) => a - b)
        .map((year) => ({ value: String(year), label: String(year) }))
    : [];

  const yearOptions = [{ value: "", label: "" }, ...availableYears];

  if (!isLoaded) {
    return (
      <div className="rounded-2xl border border-gray-200 bg-white px-5 py-10 text-center text-gray-500 dark:border-gray-800 dark:bg-white/[0.03] dark:text-gray-400">
        Loading...
      </div>
    );
  }

  if (isLoaded && Object.keys(summaryData).length === 0) {
    return (
      <div className="rounded-2xl border border-gray-200 bg-white px-5 py-10 text-center text-gray-500 dark:border-gray-800 dark:bg-white/[0.03] dark:text-gray-400">
        No data available.
      </div>
    );
  }

  return (
    <div className="rounded-2xl border border-gray-200 bg-white px-5 pb-5 pt-5 dark:border-gray-800 dark:bg-white/[0.03] sm:px-6 sm:pt-6">
      <div className="flex flex-col gap-5 mb-6 sm:flex-row sm:justify-between">
        <div className="w-full">
          <h3 className="text-lg font-semibold text-gray-800 dark:text-white/90">
            {t("expenses_per_type")}
          </h3>
          <p className="mt-1 text-gray-500 text-theme-sm dark:text-gray-400">
            {t("accumulative_expenses")}
          </p>
        </div>
        <div className="flex items-start w-full gap-3 sm:justify-end">
          <Select
            key={selectedType}
            options={selectOptions}
            placeholder={t("select_expense_type")}
            onChange={(value) => setSelectedType(value)}
            defaultValue={selectedType}
            className="dark:bg-dark-900"
          />
          <Select
            key={selectedYear || "default"}
            options={yearOptions}
            placeholder={t("select_year")}
            onChange={(value) => setSelectedYear(value)}
            defaultValue={selectedYear}
            className="dark:bg-dark-900"
            disabled={selectedMode === "annually"}
          />
          <ChartTab
            onChange={setSelectedMode}
            selected={selectedMode}
            disableAnnually={selectedYear !== ""}
          />
        </div>
      </div>

      <div className="max-w-full overflow-x-auto custom-scrollbar">
        <div className="min-w-[1000px] xl:min-w-full">
          <Chart options={options} series={series} type="area" height={310} />
        </div>
      </div>
    </div>
  );
}
