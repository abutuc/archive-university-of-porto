import { TableHeader } from "./TableHeader";
import { TableRow } from "./TableRow";
import {
  TabularExpenseReport,
  TabularExpenseReportColumn,
} from "../../../types/ExpenseReportTable";
import { TableCell } from "./TableCell";
import { TableCellType } from "../../../types/TableCellType";
import { t } from "i18next";
import { TableBody } from "./TableBody";
import { useNavigate } from "react-router";

// Props for Table
interface TableProps {
  columns: TabularExpenseReportColumn[];
  reports: TabularExpenseReport[];
}

export const ReportsTable: React.FC<TableProps> = ({ columns, reports }) => {
  const navigate = useNavigate();

  const handleRowClick = (id: string) => {
    navigate("/view-expense-report", { state: { reportId: id } });
  };

  return (
    <table className="min-w-full">
      <TableHeader className="border-b border-gray-100">
        <TableRow>
          {columns.map((column) => (
            <TableCell
              key={column.columnKey}
              isHeader
              className="px-5 py-3 font-medium text-gray-500 text-start text-theme-sm"
              cellType={TableCellType.TEXT}
              value={t(column.columnLabel)}
            />
          ))}
        </TableRow>
      </TableHeader>
      <TableBody className="divide-y divide-gray-100">
        {reports.map((report) => (
          <TableRow
            key={report.id}
            onClick={() => handleRowClick(report.id)}
            className="hover:bg-gray-200 transition-colors cursor-pointer"
          >
            {columns.map((column) => (
              <TableCell
                key={column.columnKey}
                cellType={column.columnType}
                value={report[column.columnKey]}
                className="px-5 py-3 text-start text-theme-sm"
              />
            ))}
          </TableRow>
        ))}
      </TableBody>
    </table>
  );
};
