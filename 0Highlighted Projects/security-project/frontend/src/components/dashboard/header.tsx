import { DashboardHeaderProps } from "../types/props";

export function DashboardHeader({ 
  heading, 
  text, 
  children 
}: DashboardHeaderProps) {
  return (
    <div className="flex flex-col sm:flex-row sm:items-center sm:justify-between gap-3 px-2 pb-2">
      <div>
        <h1 className="text-3xl font-bold tracking-tight text-[#183657]">{heading}</h1>
        {text && <p className="text-gray-500 mt-1">{text}</p>}
      </div>
      {children}
    </div>
  );
}
