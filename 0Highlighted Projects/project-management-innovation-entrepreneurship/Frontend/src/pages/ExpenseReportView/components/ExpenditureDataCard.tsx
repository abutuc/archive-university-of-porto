import React from "react";
import ComponentCard from "../../../components/ComponentCard";
import { t } from "i18next";
import Label from "../../../components/Label";
import { Expenditure } from "../../../types/ExpenseReport";

interface ExpenditureDataCardProps {
  index: number;
  expenditure: Expenditure;
}

export const ExpenditureDataCard: React.FC<ExpenditureDataCardProps> = ({
  index,
  expenditure,
}) => {
  return (
    <ComponentCard
      title={"Expenditure " + (index + 1)}
      hideOutFunctionality={true}
    >
      <div className="grid grid-cols-1 gap-6 md:grid-cols-2" key={index}>
        <div className="grid grid-cols-1 gap-4">
          <div className="projectLabel">
            <Label>{t("expenditure_type")}</Label>
            <div className="border border-gray-300 p-3 rounded-md bg-gray-100">
              {expenditure.expenditure_type}
            </div>
          </div>
        </div>
        {expenditure.expenditure_type === "Car" ||
        expenditure.expenditure_type === "Carro" ? (
          <>
            <div className="grid grid-cols-1 gap-4">
              <div className="projectLabel">
                <Label>{t("car_type")}</Label>
                <div className="border border-gray-300 p-3 rounded-md bg-gray-100 min-h-[38px]">
                  {expenditure.car_type || (
                    <span className="text-gray-400">—</span>
                  )}
                </div>
              </div>
            </div>
            <div className="grid grid-cols-1 gap-4">
              <div className="projectLabel">
                <Label>{t("km_travelled")}</Label>
                <div className="border border-gray-300 p-3 rounded-md bg-gray-100 min-h-[38px]">
                  {expenditure.km_travelled || (
                    <span className="text-gray-400">—</span>
                  )}
                </div>
              </div>
            </div>
            <div className="grid grid-cols-1 gap-4">
              <div className="projectLabel">
                <Label>{t("license_plate")}</Label>
                <div className="border border-gray-300 p-3 rounded-md bg-gray-100 min-h-[38px]">
                  {expenditure.license_plate || (
                    <span className="text-gray-400">—</span>
                  )}
                </div>
              </div>
            </div>
            <div className="grid grid-cols-1 gap-4">
              <div className="projectLabel">
                <Label>{t("fuel")}</Label>
                <div className="border border-gray-300 p-3 rounded-md bg-gray-100 min-h-[38px]">
                  {expenditure.fuel !== null || expenditure.fuel !== undefined
                    ? "€ " + expenditure.fuel
                    : ""}
                </div>
              </div>
            </div>
            <div className="grid grid-cols-1 gap-4">
              <div className="projectLabel">
                <Label>{t("parking_tolls")}</Label>
                <div className="border border-gray-300 p-3 rounded-md bg-gray-100 min-h-[38px]">
                  {expenditure.parking_tolls !== null ||
                  expenditure.parking_tolls !== undefined
                    ? "€ " + expenditure.parking_tolls
                    : ""}
                </div>
              </div>
            </div>
          </>
        ) : (
          <div className="grid grid-cols-1 gap-4">
            <div className="projectLabel">
              <Label>{t("expenditure_value")}</Label>
              <div className="border border-gray-300 p-3 rounded-md bg-gray-100 min-h-[38px]">
                {expenditure.value !== null || expenditure.value !== undefined
                  ? "€ " + expenditure.value
                  : ""}
              </div>
            </div>
          </div>
        )}
      </div>
    </ComponentCard>
  );
};
