import { useState } from "react";
import { useTranslation } from "react-i18next";

interface Option {
  value: string;
  label: string;
}

interface SelectProps {
  id: string;
  options: Option[];
  placeholder?: string;
  onChange: (value: string) => void;
  className?: string;
  currentValue?: string;
  defaultValue?: string;
  disabled?: boolean; // nová vlastnost
  error?: boolean;
}

const Select: React.FC<SelectProps> = ({
  id,
  options,
  placeholder = "Select an option",
  onChange,
  className = "",
  currentValue = "",
  defaultValue = "",
  disabled = false, // výchozí hodnota
  error = false, 
}) => {
  const { t } = useTranslation();

  const [selectedValue, setSelectedValue] = useState<string>(defaultValue);

  const handleChange = (e: React.ChangeEvent<HTMLSelectElement>) => {
    const value = e.target.value;
    setSelectedValue(value);
    onChange(value);
  };

  return (
    <select
      id={id}
      disabled={disabled}
      className={`h-11 w-full appearance-none rounded-lg border bg-transparent px-4 py-2.5 pr-11 text-sm shadow-theme-xs placeholder:text-gray-400 focus:outline-hidden focus:ring-3 ${
        error
          ? "border-red-500 focus:border-red-500 focus:ring-red-500/30 dark:border-red-600"
          : "border-gray-300 focus:border-brand-300 focus:ring-brand-500/10 dark:border-gray-700 dark:focus:border-brand-800"
      } ${
        (selectedValue || currentValue)
          ? "text-gray-800 dark:text-white/90"
          : "text-gray-400 dark:text-gray-400"
      } ${disabled ? "opacity-50 cursor-not-allowed" : ""} ${className}`}
      value={currentValue == "" ? selectedValue : currentValue}
      onChange={handleChange}
    >
      <option
        value=""
        disabled
        className="text-gray-700 dark:bg-gray-900 dark:text-gray-400"
      >
        {placeholder}
      </option>
      {options.map((option) => (
        <option
          key={option.value}
          value={option.value}
          className="text-gray-700 dark:bg-gray-900 dark:text-gray-400"
        >
          {t(option.label)}
        </option>
      ))}
    </select>
  );
};

export default Select;
