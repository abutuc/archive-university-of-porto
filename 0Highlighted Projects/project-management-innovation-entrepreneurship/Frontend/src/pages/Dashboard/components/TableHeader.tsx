import { ReactNode } from "react";

interface TableHeaderProps {
  children: ReactNode; // Header row(s)
  className?: string; // Optional className for styling
}

export const TableHeader: React.FC<TableHeaderProps> = ({
  children,
  className,
}) => {
  return <thead className={className}>{children}</thead>;
};
