import React from "react";
import { ViewReport } from "../../../types/ExpenseReport";
import { t } from "i18next";
import ComponentCard from "../../../components/ComponentCard";

interface ExpenseSummarySectionProps {
  report: ViewReport;
}

export const ExpenseSummarySection: React.FC<ExpenseSummarySectionProps> = ({
  report,
}) => {
  return (
    <ComponentCard title={t("expense_summary")}>
      <div className="rounded-2xl border border-black bg-gray-100 border-l-4 p-4 shadow-md text-gray-800 text-sm">
        <div className="p-4 border-t border-gray-100 bg-grey-200 dark:border-gray-800 sm:p-6">
          <div className="grid grid-cols-1 gap-4 text-center md:grid-cols-4">
            <div>
              <div className="font-semibold">{t("total_expenditure")}</div>
              <div>{"€ " + report!.total_expenditure}</div>
            </div>

            <div>
              <label className="font-semibold" htmlFor="advance">
                {t("advance_payments")}
              </label>
              <div>{"€ " + report!.advance_payments}</div>
            </div>

            <div>
              <label className="font-semibold" htmlFor="company">
                {t("payments_made_by_company")}
              </label>
              <div>{"€ " + report!.company_payments}</div>
            </div>

            <div>
              <div className="font-semibold">{t("receive_pay")}</div>
              <div>{"€ " + report!.receive_pay}</div>
            </div>
          </div>
        </div>
      </div>
    </ComponentCard>
  );
};
