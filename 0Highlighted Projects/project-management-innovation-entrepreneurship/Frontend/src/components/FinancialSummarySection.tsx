import { t } from "i18next";
import React, { Dispatch, SetStateAction, useState } from "react";
import CurrencyInput, { CurrencyInputProps } from "react-currency-input-field";

interface FinancialSummarySectionProps {
  totalExpenditure: number;
  setAdvancePayments: Dispatch<SetStateAction<number>>;
  setCompanyPayments: Dispatch<SetStateAction<number>>;
  receivePay: number;
  advancePayments?: number;
  companyPayments?: number;
}

export const FinancialSummarySection: React.FC<
  FinancialSummarySectionProps
> = ({
  totalExpenditure,
  setAdvancePayments,
  setCompanyPayments,
  receivePay,
  advancePayments,
  companyPayments,
}) => {
  const [localValues, setLocalValues] = useState<Record<string, string | number>>({
    advancePayments: advancePayments ?? 0,
    companyPayments: companyPayments ?? 0,
  });

  const handleCurrencyChange: CurrencyInputProps["onValueChange"] = (
    _value,
    name
  ) => {
    if (!name) return;

    setLocalValues((prev) => ({ ...prev, [name]: _value ?? "" }));

    if (_value === undefined || _value === "") {
      if (name === "advancePayments") setAdvancePayments(0);
      if (name === "companyPayments") setCompanyPayments(0);
      return;
    }

    const parsed = parseFloat(("" + _value).replace(",", "."));
    if (name === "advancePayments") setAdvancePayments(isNaN(parsed) ? 0 : parsed);
    if (name === "companyPayments") setCompanyPayments(isNaN(parsed) ? 0 : parsed);
  };

  return (
    <div className="rounded-2xl border border-black bg-gray-100 border-l-4 p-4 shadow-md text-gray-800 text-sm">
      <div className="p-4 border-t border-gray-100 bg-grey-200 dark:border-gray-800 sm:p-6">
        <div className="grid grid-cols-1 gap-4 text-center md:grid-cols-4">
          <div>
            <div className="font-semibold">{t("total_expenditure")}</div>
            <div>{"€ " + totalExpenditure}</div>
          </div>

          <div>
            <label className="font-semibold" htmlFor="advancePayments">
              {t("advance_payments")}
            </label>
            <CurrencyInput
              id="advancePayments"
              name="advancePayments"
              value={localValues.advancePayments}
              onValueChange={handleCurrencyChange}
              placeholder={t("enter_amount")}
              prefix="€"
              decimalsLimit={2}
              className="border rounded-md p-2 w-full"
            />
          </div>

          <div>
            <label className="font-semibold" htmlFor="companyPayments">
              {t("payments_made_by_company")}
            </label>
            <CurrencyInput
              id="companyPayments"
              name="companyPayments"
              value={localValues.companyPayments}
              onValueChange={handleCurrencyChange}
              placeholder={t("enter_amount")}
              prefix="€"
              decimalsLimit={2}
              className="border rounded-md p-2 w-full"
            />
          </div>

          <div>
            <div className="font-semibold">{t("receive_pay")}</div>
            <div>{"€ " + receivePay}</div>
          </div>
        </div>
      </div>
    </div>
  );
};
