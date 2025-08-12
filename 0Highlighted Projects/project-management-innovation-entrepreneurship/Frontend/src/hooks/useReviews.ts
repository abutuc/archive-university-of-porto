import { useState, useCallback } from "react";
import { API_BASE_URL } from "../config";
import { useAuth } from "../auth/AuthContext";

export function useReviews() {
  const [loading, setLoading] = useState<boolean>(false);
  const [error, setError] = useState<string | null>(null);
  const { backendAccessToken } = useAuth();

  const createReview = useCallback(
    async (review: any) => {
      if (!backendAccessToken) return;
      setLoading(true);
      setError(null);
      try {
        const res = await fetch(`${API_BASE_URL}/reviews`, {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
            Authorization: `Bearer ${backendAccessToken}`,
          },
          body: JSON.stringify(review),
        });
        if (!res.ok) {
          const errText = await res.text();
          throw new Error(
            `Failed to create review: ${errText} (Status: ${res.status})`
          );
        }
        return await res.json();
      } catch (err: any) {
        console.error("Error in createReview:", err);
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
    error,
    createReview,
  };
}
