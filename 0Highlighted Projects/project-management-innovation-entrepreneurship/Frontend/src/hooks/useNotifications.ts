import { useState, useCallback } from "react";
import { API_BASE_URL } from "../config.ts";
import { useAuth } from "../auth/AuthContext.tsx";

export function useNotifications() {
  const [loading, setLoading] = useState<boolean>(false);
  const [error, setError] = useState<string | null>(null);
  const { backendAccessToken } = useAuth();

  const getUnreadNotifications = useCallback(
    async (userId: string) => {
      if (!backendAccessToken) return [];
      setLoading(true);
      setError(null);
      try {
        const res = await fetch(
          `${API_BASE_URL}/notifications/user/${userId}/unread`,
          {
            method: "GET",
            headers: {
              "Content-Type": "application/json",
              Authorization: `Bearer ${backendAccessToken}`,
            },
          }
        );
        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to fetch notifications: ${errText} (Status: ${res.status})`
          );
        }
        return await res.json();
      } catch (err: unknown) {
        if (err instanceof Error) {
          console.error("Error in getUnreadNotifications:", err);
          setError(err.message);
        } else {
          setError("An unknown error occurred in getUnreadNotifications.");
        }
        throw err;
      } finally {
        setLoading(false);
      }
    },
    [backendAccessToken]
  );

  const markNotificationAsRead = useCallback(
    async (id: string) => {
      if (!backendAccessToken) return;
      setLoading(true);
      setError(null);

      try {
        const res = await fetch(`${API_BASE_URL}/notifications/${id}/read`, {
          method: "PATCH",
          headers: {
            "Content-Type": "application/json",
            Authorization: `Bearer ${backendAccessToken}`,
          },
        });
        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to mark notification as read: ${errText} (Status: ${res.status})`
          );
        }
        return await res.json();
      } catch (err: unknown) {
        if (err instanceof Error) {
          console.error("Error in markNotificationAsRead:", err);
          setError(err.message);
        } else {
          setError("An unknown error occurred in markNotificationAsRead.");
        }
        throw err;
      } finally {
        setLoading(false);
      }
    },
    [backendAccessToken]
  );

  return {
    getUnreadNotifications,
    markNotificationAsRead,
    loading,
    error,
  };
}
