import React from "react";
import Button from "./Button";
import { BoxIcon } from "../assets/icons";
import { t } from "i18next";

interface AddExpenditureButtonProps {
  index: number;
  addExpenditure: (index: number) => void;
}

export const AddExpenditureButton: React.FC<AddExpenditureButtonProps> = ({
  index,
  addExpenditure,
}) => {
  return (
    <div className="flex justify-center">
      <Button
        size="sm"
        variant="outline"
        endIcon={<BoxIcon className="size-5" />}
        onClick={() => addExpenditure(index)}
      >
        {t("add_manual_expenditure_button")}
      </Button>
    </div>
  );
};
