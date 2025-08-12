import { useTranslation } from "react-i18next";

type ChartMode = "monthly" | "quarterly" | "annually";

type Props = {
  selected: ChartMode;
  onChange: (mode: ChartMode) => void;
  disableAnnually?: boolean;
};

const ChartTab: React.FC<Props> = ({ selected, onChange, disableAnnually = false }) => {
  const { t } = useTranslation();

  const getButtonClass = (option: ChartMode) =>
    selected === option
      ? "shadow-theme-xs text-gray-900 dark:text-white bg-white dark:bg-gray-800"
      : "text-gray-500 dark:text-gray-400";

  return (
    <div className="flex items-center gap-0.5 rounded-lg bg-gray-100 p-0.5 dark:bg-gray-900">
      <button
        onClick={() => onChange("monthly")}
        className={`px-3 py-2 font-medium w-full rounded-md text-theme-sm hover:text-gray-900 dark:hover:text-white ${getButtonClass("monthly")}`}
      >
        {t("monthly")}
      </button>

      <button
        onClick={() => onChange("quarterly")}
        className={`px-3 py-2 font-medium w-full rounded-md text-theme-sm hover:text-gray-900 dark:hover:text-white ${getButtonClass("quarterly")}`}
      >
        {t("quarterly")}
      </button>

      <button
        onClick={() => onChange("annually")}
        disabled={disableAnnually}
        className={`px-3 py-2 font-medium w-full rounded-md text-theme-sm ${
          disableAnnually
            ? "opacity-50 cursor-not-allowed"
            : "hover:text-gray-900 dark:hover:text-white"
        } ${getButtonClass("annually")}`}
      >
        {t("annually")}
      </button>
    </div>
  );
};

export default ChartTab;