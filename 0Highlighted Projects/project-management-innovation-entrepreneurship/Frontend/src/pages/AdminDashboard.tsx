import Input from "../components/InputField";
import Label from "../components/Label";
import Button from "../components/Button";
import { useTranslation } from "react-i18next";
import PageMeta from "../components/PageMeta";
import { useSystemVariables } from "../hooks/useSystemVariables";
import { SystemVariable, SystemVariableType } from "../types/SystemVariable";
import { useEffect, useState } from "react";
import LoadingOverlay from "../components/LoadingOverlay";

export default function AdminDashboard() {
  const { t, i18n } = useTranslation();
  const lang = i18n.language;
  const { variableObjects, updateSystemVariables, loading, loadingMessage } =
    useSystemVariables();
  const [isEditing, setIsEditing] = useState(false);
  const [updatedVariables, setUpdatedVariables] = useState<SystemVariable[]>(
    []
  );

  useEffect(() => {
    setUpdatedVariables(variableObjects);
  }, [variableObjects]);

  const handleChange = (index: number, newValue: string) => {
    setUpdatedVariables((prev) => {
      const updated = [...prev];
      updated[index] = { ...updated[index], value: newValue };
      return updated;
    });
  };

  const handleSave = async () => {
    updateSystemVariables(updatedVariables);
    setIsEditing(false);
  };

  return (
    <div>
      <PageMeta
        title="Dashboard"
        description="This is the page for managing system variables"
      />
      <div className="pb-2 space-y-4">
        {updatedVariables.map((variable, index) => (
          <div key={variable.name}>
            <Label htmlFor={variable.name}>
              {lang === "pt" ? variable.pt_label : variable.en_label}
            </Label>
            {isEditing ? (
              <Input
                type={
                  variable.type === SystemVariableType.NUMBER
                    ? "number"
                    : "text"
                }
                id={variable.name}
                value={variable.value}
                onChange={(e) => handleChange(index, e.target.value)}
              />
            ) : (
              <div className="h-11 w-full rounded-lg border border-gray-300 p-3 bg-gray-100 text-sm shadow-theme-xs">
                {variable.value}
              </div>
            )}
          </div>
        ))}
      </div>

      <div className="mt-4">
        {isEditing ? (
          <Button
            className="mr-4"
            size="sm"
            variant="outline"
            onClick={handleSave}
          >
            {t("save")}
          </Button>
        ) : (
          <Button
            size="sm"
            variant="outline"
            onClick={() => setIsEditing(true)}
          >
            {t("edit")}
          </Button>
        )}
      </div>
      {loading && <LoadingOverlay messageKey={loadingMessage} />}
    </div>
  );
}
