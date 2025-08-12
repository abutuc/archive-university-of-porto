import { ReactNode } from "react";

interface TableRowProps {
  children: ReactNode; // Cells (th or td)
  className?: string; // Optional className for styling
  onClick?: React.MouseEventHandler<HTMLTableRowElement>;
}

export const TableRow: React.FC<TableRowProps> = ({
  children,
  className,
  onClick,
}) => {
  return (
    <tr className={className} onClick={onClick}>
      {children}
    </tr>
  );
};
