import { useTranslation } from "react-i18next";
import Button from "../../../components/Button";
import React, { Dispatch, SetStateAction } from "react";

interface PaginationProps {
  totalNumberOfReports: number;
  itemsPerPage: number;
  currentPage: number;
  setCurrentPage: Dispatch<SetStateAction<number>>;
}

export const Pagination: React.FC<PaginationProps> = ({
  totalNumberOfReports,
  itemsPerPage,
  currentPage,
  setCurrentPage,
}) => {
  const { t } = useTranslation();
  const totalPages = Math.ceil(totalNumberOfReports / itemsPerPage);

  const handleNextPage = () => {
    if (currentPage < totalPages) setCurrentPage(currentPage + 1);
  };

  const handlePreviousPage = () => {
    if (currentPage > 1) setCurrentPage(currentPage - 1);
  };

  return (
    <div className="flex flex-wrap justify-between items-center mt-4 text-sm">
      <Button
        size="sm"
        variant="outline"
        onClick={handlePreviousPage}
        disabled={currentPage === 1}
      >
        {t("previous")}
      </Button>
      <span className="mt-2 sm:mt-0">
        {t("page")} {currentPage} {t("of")} {totalPages} ({totalNumberOfReports}{" "}
        {t("total_records")})
      </span>
      <Button
        size="sm"
        variant="outline"
        onClick={handleNextPage}
        disabled={currentPage === totalPages}
      >
        {t("next")}
      </Button>
    </div>
  );
};
