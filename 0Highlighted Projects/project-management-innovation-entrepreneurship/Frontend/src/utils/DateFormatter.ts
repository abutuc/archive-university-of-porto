import { format } from "date-fns";

export const formatDate = (dateString: string, language: string): string => {
  const date = new Date(dateString);
  return language === "pt"
    ? format(date, "dd-MM-yyyy")
    : format(date, "yyyy-MM-dd");
};
