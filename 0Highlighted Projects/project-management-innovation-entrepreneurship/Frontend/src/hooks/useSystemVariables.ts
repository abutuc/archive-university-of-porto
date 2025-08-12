import { useCallback, useEffect, useState } from "react";
import { useAuth } from "../auth/AuthContext";
import { API_BASE_URL } from "../config";
import { SystemVariable } from "../types/SystemVariable";

export function useSystemVariables() {
  const [loading, setLoading] = useState<boolean>(false);
  const [loadingMessage, setLoadingMessage] = useState<string>();
  const [error, setError] = useState<string | null>(null);
  const [variableObjects, setVariableObjects] = useState<SystemVariable[]>([]);
  const [variables, setVariables] = useState<Record<string, string>>({});
  const { backendAccessToken } = useAuth();

  useEffect(() => {
    const fetchSystemVariables = async () => {
      if (!backendAccessToken) return;
      setLoading(true);
      setLoadingMessage("fetching_system_variables");
      setError(null);
      try {
        const res = await fetch(`${API_BASE_URL}/system-variables/`, {
          method: "GET",
          headers: {
            "Content-Type": "application/json",
            Authorization: `Bearer ${backendAccessToken}`,
          },
        });
        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to get system variables: ${errText} (Status: ${res.status})`
          );
        }
        const json: SystemVariable[] = await res.json();
        setVariableObjects(json);
        const mapped = Object.fromEntries(json.map((v) => [v.name, v.value]));
        setVariables(mapped);
        return mapped;
      } catch (err: any) {
        console.log("Error in getSystemVariables", err);
        setError(err.message);
        throw err;
      } finally {
        setLoading(false);
      }
    };
    fetchSystemVariables();
  }, [backendAccessToken]);

  const updateSystemVariables = useCallback(
    async (updatedVariables: SystemVariable[]) => {
      if (!backendAccessToken) return;
      setLoading(true);
      setLoadingMessage("updating_system_variables");
      setError(null);
      try {
        const res = await fetch(`${API_BASE_URL}/system-variables/`, {
          method: "PUT",
          headers: {
            "Content-Type": "application/json",
            Authorization: `Bearer ${backendAccessToken}`,
          },
          body: JSON.stringify(updatedVariables),
        });

        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to update system variables: ${errText} (Status: ${res.status})`
          );
        }

        const message = await res.json();
        console.log("Update success:", message);
        return message;
      } catch (err: any) {
        console.log("Error in updateSystemVariables", err);
        setError(err.message);
        throw err;
      } finally {
        setLoading(false);
      }
    },
    [backendAccessToken]
  );

  return {
    loading,
    loadingMessage,
    error,
    variables,
    variableObjects,
    updateSystemVariables,
  };
}
