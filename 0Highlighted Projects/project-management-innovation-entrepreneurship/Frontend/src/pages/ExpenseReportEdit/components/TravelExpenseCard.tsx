import React from "react";
import { useState } from "react";
import ComponentCard from "../../../components/ComponentCard";
import { Expenditure, Expense, Report } from "../../../types/ExpenseReport";
import { t } from "i18next";
import Label from "../../../components/Label";
import Flatpickr from "react-flatpickr";
import { DateRenderMap } from "../../../types/ExpenseReportForm";
import { BoxIcon, CalenderIcon, TimeIcon } from "../../../assets/icons";
import Input from "../../../components/InputField";
import Select from "../../../components/Select";
import { ExpenditureCard } from "./ExpenditureCard";
import { TRAVEL_LOCAL_TYPE } from "../../../constants";
import { AddExpenditureButton } from "../../../components/AddExpenditureButton";
import Button from "../../../components/Button";
import { ConfirmDeleteDialog } from "./ConfirmDeleteDialog";
import FileUpload from "../../../components/FileUpload";

interface TravelExpenseCardProps {
  expense: Expense;
  index: number;
  removeExpense: (index: number) => void;
  dateRenderMap: DateRenderMap;
  setDepartureDateOnRenderMap: (
    expenseId: number,
    date: Date | undefined
  ) => void;
  updateExpense: (
    index: number,
    attribute: keyof Expense,
    value: Expense[keyof Expense]
  ) => void;
  setArrivalDateOnRenderMap: (
    expenseId: number,
    date: Date | undefined
  ) => void;
  travelTypes: {
    value: string;
    label: string;
  }[];
  report: Report;
  removeExpenditure: (index: number, expIndex: number) => void;
  updateExpenditure: (
    index: number,
    expIndex: number,
    key: keyof Expenditure,
    value: Expenditure[keyof Expenditure]
  ) => void;
  expenditureTypes: {
    value: string;
    label: string;
  }[];
  addExpenditure: (index: number) => void;
  handleAddFiles: (files: FileList, index: number) => void;
  handleRemoveFile: (fileIndex: number, index: number) => void;
  uploadedFiles: File[] | undefined;
  visibleAttachments: string[];
  fieldErrors?: Record<string, boolean>;
}

export const TravelExpenseCard: React.FC<TravelExpenseCardProps> = ({
  expense,
  index,
  removeExpense,
  setDepartureDateOnRenderMap,
  updateExpense,
  setArrivalDateOnRenderMap,
  travelTypes,
  report,
  updateExpenditure,
  expenditureTypes,
  addExpenditure,
  removeExpenditure,
  handleAddFiles,
  handleRemoveFile,
  uploadedFiles,
  visibleAttachments,
  fieldErrors = {},
}) => {
  const [isConfirmOpen, setIsConfirmOpen] = useState(false);

  return (
    <>
      <ConfirmDeleteDialog
        isOpen={isConfirmOpen}
        onConfirm={() => {
          removeExpense(index);
          setIsConfirmOpen(false);
        }}
        onCancel={() => setIsConfirmOpen(false)}
        is_expense={true}
      />
      <ComponentCard
        title={`${t("travel_expense_nr")}${index + 1}`}
        showDelete={true}
        deleteCallback={() => {
          if (expense.fetched_from_api) {
            setIsConfirmOpen(true);
          } else {
            removeExpense(index); // Remove the expense directly if it was not fetched from the API
          }
        }}
        hideOutFunctionality={true}
      >
        <div className="grid grid-cols-1 gap-6 md:grid-cols-2">
          <div>
            <Label required htmlFor={`-${index}-departure_date`}>
              {t("departure_date")}
            </Label>
            <div className="relative w-full flatpickr-wrapper">
              <Flatpickr
                id={`-${index}-departure_date`}
                value={expense.departure_date}
                onChange={(departureDateArray) => {
                  const newDepartureDate = departureDateArray[0];
                  setDepartureDateOnRenderMap(index, newDepartureDate);
                  updateExpense(
                    index,
                    "departure_date",
                    newDepartureDate.toLocaleDateString("en-CA")
                  );

                  const arrivalDate = expense.arrival_date;
                  const arrivalTime = expense.arrival_time;
                  const departureTime = expense.departure_time;

                  if (
                    arrivalDate &&
                    new Date(arrivalDate).toDateString() ===
                      newDepartureDate.toDateString() &&
                    arrivalTime &&
                    departureTime &&
                    arrivalTime < departureTime
                  ) {
                    updateExpense(index, "departure_time", "");
                  }
                }}
                options={{
                  dateFormat: "Y-m-d",
                  minDate: new Date("2000-01-01"),
                  maxDate: expense.arrival_date || undefined,
                }}
                placeholder={t("select_departure_date")}
                className={`h-11 w-full rounded-lg border appearance-none px-4 py-2.5 text-sm shadow-theme-xs placeholder:text-gray-400 focus:outline-hidden focus:ring-3  dark:bg-gray-900 dark:text-white/90 dark:placeholder:text-white/30  bg-transparent text-gray-800 ${
                  fieldErrors[`departure_date_${index}`]
                    ? "border-red-500 focus:border-red-500 focus:ring-red-500/30"
                    : "border-gray-300 focus:border-brand-300 focus:ring-brand-500/20 dark:border-gray-700  dark:focus:border-brand-800"
                }`}
              />
              <span className="absolute text-gray-500 -translate-y-1/2 pointer-events-none right-3 top-1/2 dark:text-gray-400">
                <CalenderIcon className="size-6" />
              </span>
            </div>
          </div>

          <div>
            <Label required htmlFor={`-${index}-departure_time`}>
              {t("departure_time")}
            </Label>
            <div className="relative">
              <Input
                type="time"
                id={`-${index}-departure_time`}
                name="departure_time"
                value={expense.departure_time || ""}
                onChange={(e) => {
                  const newDepartureTime = e.target.value;
                  const departureDate = expense.departure_date;
                  const arrivalDate = expense.arrival_date;
                  const arrivalTime = expense.arrival_time;

                  if (
                    departureDate &&
                    arrivalDate &&
                    new Date(departureDate).toDateString() ===
                      new Date(arrivalDate).toDateString() &&
                    arrivalTime &&
                    newDepartureTime > arrivalTime
                  ) {
                    updateExpense(index, "arrival_time", "");
                  }

                  updateExpense(index, "departure_time", newDepartureTime);
                }}
                error={fieldErrors[`departure_time_${index}`]}
              />
              <span className="absolute text-gray-500 -translate-y-1/2 pointer-events-none right-3 top-1/2 dark:text-gray-400">
                <TimeIcon className="size-6" />
              </span>
            </div>
          </div>

          <div>
            <Label required htmlFor={`-${index}-travel_local_type`}>
              {t("arrival_date")}
            </Label>
            <div className="relative w-full flatpickr-wrapper">
              <Flatpickr
                id={`-${index}-arrival_date`}
                value={expense.arrival_date}
                onChange={(arrivalDateArray) => {
                  const newArrivalDate = arrivalDateArray[0];
                  setArrivalDateOnRenderMap(index, newArrivalDate);
                  updateExpense(
                    index,
                    "arrival_date",
                    newArrivalDate.toLocaleDateString("en-CA")
                  );

                  const departureDate = expense.departure_date;
                  const arrivalTime = expense.arrival_time;
                  const departureTime = expense.departure_time;

                  if (
                    departureDate &&
                    new Date(departureDate).toDateString() ===
                      newArrivalDate.toDateString() &&
                    arrivalTime &&
                    departureTime &&
                    arrivalTime < departureTime
                  ) {
                    updateExpense(index, "arrival_time", "");
                  }
                }}
                options={{
                  dateFormat: "Y-m-d",
                  minDate: expense.departure_date || new Date("2000-01-01"),
                }}
                placeholder={t("select_arrival_date")}
                className={`h-11 w-full rounded-lg border appearance-none px-4 py-2.5 text-sm shadow-theme-xs placeholder:text-gray-400 focus:outline-hidden focus:ring-3  dark:bg-gray-900 dark:text-white/90 dark:placeholder:text-white/30  bg-transparent text-gray-800 ${
                  fieldErrors[`arrival_date_${index}`]
                    ? "border-red-500 focus:border-red-500 focus:ring-red-500/30"
                    : "border-gray-300 focus:border-brand-300 focus:ring-brand-500/20 dark:border-gray-700  dark:focus:border-brand-800"
                }`}
              />
              <span className="absolute text-gray-500 -translate-y-1/2 pointer-events-none right-3 top-1/2 dark:text-gray-400">
                <CalenderIcon className="size-6" />
              </span>
            </div>
          </div>

          <div>
            <Label required htmlFor={`-${index}-arrival_time`}>
              {t("arrival_time")}
            </Label>
            <div className="relative">
              <Input
                type="time"
                id={`-${index}-arrival_time`}
                name="arrival_time"
                value={expense.arrival_time || ""}
                onChange={(e) => {
                  const newArrivalTime = e.target.value;
                  const departureDate = expense.departure_date;
                  const arrivalDate = expense.arrival_date;
                  const departureTime = expense.departure_time;

                  if (
                    departureDate &&
                    arrivalDate &&
                    new Date(departureDate).toDateString() ===
                      new Date(arrivalDate).toDateString() &&
                    departureTime &&
                    newArrivalTime < departureTime
                  ) {
                    updateExpense(index, "departure_time", "");
                  }

                  updateExpense(index, "arrival_time", newArrivalTime);
                }}
                error={fieldErrors[`arrival_time_${index}`]}
              />
              <span className="absolute text-gray-500 -translate-y-1/2 pointer-events-none right-3 top-1/2 dark:text-gray-400">
                <TimeIcon className="size-6" />
              </span>
            </div>
          </div>
          <div>
            <Label required htmlFor={`-${index}-travel_type`}>{t("travel_type")}</Label>
            <Select
              id={`-${index}-travel_type`}
              options={travelTypes}
              placeholder={t("select_travel_type")}
              currentValue={expense.travel_type}
              onChange={(travelType) => {
                updateExpense(index, "travel_type", travelType);
              }}
              error={fieldErrors[`travel_type_${index}`]}
            />
          </div>
          <div>
            <Label required htmlFor={`-${index}-departure_place`}>
              {t("departure_place")}
            </Label>
            <Input
              type="text"
              id={`-${index}-departure_place`}
              value={expense.departure_place}
              onChange={(e) => {
                updateExpense(index, "departure_place", e.target.value);
              }}
              error={fieldErrors[`departure_place_${index}`]}
            />
          </div>
          <div>
            <Label required htmlFor={`-${index}-meeting_place`}>
              {t("meeting_place")}
            </Label>
            <Input
              type="text"
              id={`-${index}-meeting_place`}
              value={expense.meeting_place}
              onChange={(e) => {
                updateExpense(index, "meeting_place", e.target.value);
              }}
              error={fieldErrors[`meeting_place_${index}`]}
            />
          </div>
          <div>
            <Label required htmlFor={`-${index}-arrival_place`}>
              {t("arrival_place")}
            </Label>
            <Input
              type="text"
              id={`-${index}-arrival_place`}
              value={expense.arrival_place}
              onChange={(e) => {
                updateExpense(index, "arrival_place", e.target.value);
              }}
              error={fieldErrors[`arrival_place_${index}`]}
            />
          </div>
        </div>
        {report.expenses![index].expenditures?.map((expenditure, expIndex) => (
          <ExpenditureCard
            key={expenditure.id ? expenditure.id : expenditure.renderId}
            expenditure={expenditure}
            index={index}
            expIndex={expIndex}
            removeExpenditure={removeExpenditure}
            updateExpenditure={updateExpenditure}
            expenditureTypes={expenditureTypes}
            fieldErrors={fieldErrors}
          />
        ))}
        <div className="grid grid-cols-1">
          <AddExpenditureButton index={index} addExpenditure={addExpenditure} />
        </div>
        <div className="mt-6">
          <FileUpload
            files={uploadedFiles}
            visibleAttachments={visibleAttachments}
            onAddFiles={handleAddFiles}
            onRemoveFile={handleRemoveFile}
            index={index}
          />
        </div>
      </ComponentCard>
    </>
  );
};
