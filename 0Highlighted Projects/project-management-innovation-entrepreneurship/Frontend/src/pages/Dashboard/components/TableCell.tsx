import { TableCellType } from "../../../types/TableCellType";
import { formatDate } from "../../../utils/DateFormatter";
import { useTranslation } from "react-i18next";
import Badge from "../../../components/Badge";
import {
  getExpenseReportStatusBadgeColor,
  getExpenseReportStatusLabel,
} from "../../../types/ExpenseReportStatus";

interface TableCellProps {
  value: any;
  isHeader?: boolean; // If true, renders as <th>, otherwise <td>
  className?: string; // Optional className for styling
  cellType?: TableCellType;
}

export const TableCell: React.FC<TableCellProps> = ({
  value,
  isHeader = false,
  className,
  cellType,
}) => {
  const CellTag = isHeader ? "th" : "td";
  const { i18n } = useTranslation();
  let contentValue = value;
  if (cellType === TableCellType.DATE) {
    contentValue = formatDate(value, i18n.language);
  } else if (cellType === TableCellType.STATUS) {
    contentValue = (
      <Badge size="sm" color={getExpenseReportStatusBadgeColor(value)}>
        {getExpenseReportStatusLabel(value)}
      </Badge>
    );
  }
  return <CellTag className={` ${className}`}>{contentValue}</CellTag>;
};
