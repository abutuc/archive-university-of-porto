import React, { Dispatch, SetStateAction } from "react";
import ComponentCard from "../../../components/ComponentCard";
import Label from "../../../components/Label";
import TextArea from "../../../components/TextArea";
import Radio from "../../../components/Radio";
import Button from "../../../components/Button";
import { t } from "i18next";

interface ReportReviewSectionProps {
  observations: string;
  setObservations: Dispatch<SetStateAction<string>>;
  selectedReviewDecision: string;
  reportUpdateStatus: boolean;
  handleReviewDecisionChange: (value: string) => void;
  handleSubmitReview: () => Promise<void>;
}

export const ReportReviewSection: React.FC<ReportReviewSectionProps> = ({
  observations,
  setObservations,
  selectedReviewDecision,
  handleReviewDecisionChange,
  handleSubmitReview,
  reportUpdateStatus,
}) => {
  return (
    <ComponentCard title="Report Review" className="border-gray-400 border-2">
      <div className="grid grid-cols-1 gap-4">
        <div className="receiptsLabel">Review the below document:</div>
      </div>

      <div>
        <Label>Observations</Label>
        <TextArea
          placeholder="Enter review observations."
          value={observations}
          onChange={setObservations}
        />
      </div>

      <div>
        <Label>Review Decision</Label>
        <div className="flex flex-wrap items-center gap-8">
          <Radio
            id="radio1"
            name="group1"
            value="Require Justification/Correction"
            checked={
              selectedReviewDecision === "Require Justification/Correction"
            }
            onChange={handleReviewDecisionChange}
            label="Require Justification/Correction"
          />
          <Radio
            id="radio2"
            name="group1"
            value="Approve"
            checked={selectedReviewDecision === "Approve"}
            onChange={handleReviewDecisionChange}
            label="Approve"
          />
        </div>
      </div>
      <Button
        size="sm"
        variant="outline"
        onClick={() => {
          handleSubmitReview();
        }}
      >
        Submit Review
      </Button>
      {reportUpdateStatus && (
        <div className="text-sm text-orange-500">
          {t("report_updated")}
        </div>
      )}
    </ComponentCard>
  );
};
