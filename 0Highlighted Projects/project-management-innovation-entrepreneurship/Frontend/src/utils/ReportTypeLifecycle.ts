export const getNextReportPhase = (documentType: string): string => {
  console.log(documentType);
  if (documentType === "Advance Request") {
    return "Expense Report";
  } else if (documentType == "Pedido de Adiantamento") {
    return "Relatório de Despesa";
  } else if (documentType == "Pedido de Validação") {
    return "Pedido de Adiantamento";
  } else if (documentType == "Validation Request") {
    return "Advance Request";
  }
  return "";
};

export const getNextReportPhaseId = (documentType: string): string => {
  if (documentType === "VALIDATION_REQUEST") {
    return "ADVANCE_REQUEST";
  } else if (documentType == "ADVANCE_REQUEST") {
    return "EXPENSE_REPORT";
  }
  return documentType;
};
