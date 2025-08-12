export enum SystemVariableType {
  STRING = "STRING",
  NUMBER = "NUMBER",
}

export interface SystemVariable {
  name: string;
  type: SystemVariableType;
  value: string;
  pt_label: string;
  en_label: string;
}
