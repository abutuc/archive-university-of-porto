import React, { useState } from "react";
import { Expenditure } from "../../../types/ExpenseReport";
import { TrashBinIcon } from "../../../assets/icons";
import Label from "../../../components/Label";
import { t } from "i18next";
import Select from "../../../components/Select";
import Input from "../../../components/InputField";
import CurrencyInput, { CurrencyInputProps } from "react-currency-input-field";

interface ExpenditureCardProps {
  expenditure: Expenditure;
  index: number;
  expIndex: number;
  removeExpenditure: (index: number, expIndex: number) => void;
  expenditureTypes: {
    value: string;
    label: string;
  }[];
  updateExpenditure: (
    index: number,
    expIndex: number,
    key: keyof Expenditure,
    value: Expenditure[keyof Expenditure]
  ) => void;
  fieldErrors?: Record<string, boolean>;
}

export const ExpenditureCard: React.FC<ExpenditureCardProps> = ({
  expenditure,
  index,
  expIndex,
  removeExpenditure,
  expenditureTypes,
  updateExpenditure,
  fieldErrors = {},
}) => {
  const isCarExpenditure = expenditure.expenditure_type === "CAR";

  const [localValues, setLocalValues] = useState<
    Record<string, string | number>
  >({
    fuel: expenditure.fuel,
    parking_tolls: expenditure.parking_tolls,
    value: expenditure.value,
  });

  const handleCurrencyChange: CurrencyInputProps["onValueChange"] = (
    _value,
    name
  ) => {
    if (!name) return;

    setLocalValues((prev) => ({ ...prev, [name]: _value ?? "" }));

    if (_value === undefined || _value === "") {
      updateExpenditure(index, expIndex, name as keyof Expenditure, 0);
      return;
    }

    const parsed = parseFloat(("" + _value).replace(",", "."));
    updateExpenditure(
      index,
      expIndex,
      name as keyof Expenditure,
      isNaN(parsed) ? 0 : parsed
    );
  };

  return (
    <div
      key={expenditure.renderId}
      className="relative rounded-2xl border border-gray-200 bg-white dark:border-gray-800 dark:bg-white/[0.03]"
    >
      <button
        className="absolute top-2 right-2 rounded-md border border-slate-300 p-1 text-sm transition-all shadow-sm hover:shadow-lg text-slate-600 hover:text-white hover:bg-slate-800 hover:border-slate-800 focus:text-white focus:bg-slate-800 focus:border-slate-800 active:border-slate-800 active:text-white active:bg-slate-800 disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none"
        type="button"
        onClick={() => removeExpenditure(index, expIndex)}
      >
        <TrashBinIcon fontSize={16} color="red" />
      </button>
      <div className="p-4 border-t border-gray-100 dark:border-gray-800 sm:p-6">
        <div className="grid grid-cols-1 gap-6 md:grid-cols-2">
          <div>
            <Label required htmlFor={`-${index}-${expIndex}-expenditure_type`}>{t("expenditure_type")}</Label>
            <Select
              id={`-${index}-${expIndex}-expenditure_type`}
              options={expenditureTypes}
              currentValue={expenditure.expenditure_type}
              placeholder={t("select_expenditure_type")}
              onChange={(value) =>
                updateExpenditure(index, expIndex, "expenditure_type", value)
              }
              className="dark:bg-dark-900"
              error={fieldErrors[`expenditure_type_${index}_${expIndex}`]}
            />
          </div>
          {isCarExpenditure ? (
            <>
              <div>
                <Label required htmlFor={`-${index}-${expIndex}-car_type`}>
                  {t("car_type")}
                </Label>
                <Input
                  type="text"
                  id={`-${index}-${expIndex}-car_type`}
                  value={expenditure.car_type}
                  onChange={(e) =>
                    updateExpenditure(
                      index,
                      expIndex,
                      "car_type",
                      e.target.value
                    )
                  }
                  error={fieldErrors[`car_type_${index}_${expIndex}`]}
                />
              </div>
              <div>
                <Label required htmlFor={`-${index}-${expIndex}-km_travelled`}>
                  {t("km_travelled")}
                </Label>
                <Input
                  type="number"
                  id={`-${index}-${expIndex}-km_travelled`}
                  min="0"
                  onChange={(e) =>
                    updateExpenditure(
                      index,
                      expIndex,
                      "km_travelled",
                      e.target.value
                    )
                  }
                  error={fieldErrors[`km_travelled_${index}_${expIndex}`]}
                />
              </div>
              <div>
                <Label htmlFor={`-${index}-${expIndex}-license_plate`}>{t("license_plate")}</Label>
                <Input
                  type="text"
                  id={`-${index}-${expIndex}-license_plate`}
                  onChange={(e) =>
                    updateExpenditure(
                      index,
                      expIndex,
                      "license_plate",
                      e.target.value
                    )
                  }
                />
              </div>
              <div>
                <Label htmlFor={`-${index}-${expIndex}-fuel`}>{t("fuel")}</Label>
                <CurrencyInput
                  id={`-${index}-${expIndex}-fuel`}
                  name="fuel"
                  value={localValues.fuel}
                  onValueChange={handleCurrencyChange}
                  placeholder={t("enter_amount")}
                  prefix="€"
                  decimalsLimit={2}
                  className="border rounded-md p-2 w-full"
                />
              </div>
              <div>
                <Label htmlFor={`-${index}-${expIndex}-parking_tolls`}>{t("parking_tolls")}</Label>
                <CurrencyInput
                  id={`-${index}-${expIndex}-parking_tolls`}
                  name="parking_tolls"
                  value={localValues.parking_tolls}
                  onValueChange={handleCurrencyChange}
                  placeholder={t("enter_amount")}
                  prefix="€"
                  decimalsLimit={2}
                  className="border rounded-md p-2 w-full"
                />
              </div>
            </>
          ) : (
            <div>
              <Label required htmlFor={`-${index}-${expIndex}-value`}>
                {t("value")}
              </Label>
              <CurrencyInput
                id={`-${index}-${expIndex}-value`}
                name="value"
                value={localValues.value}
                onValueChange={handleCurrencyChange}
                placeholder={t("enter_amount")}
                prefix="€"
                decimalsLimit={2}
                className={`border rounded-md p-2 w-full ${
                  fieldErrors[`value_${index}_${expIndex}`]
                    ? "border-red-500"
                    : ""
                }`}
              />
            </div>
          )}
        </div>
      </div>
    </div>
  );
};
