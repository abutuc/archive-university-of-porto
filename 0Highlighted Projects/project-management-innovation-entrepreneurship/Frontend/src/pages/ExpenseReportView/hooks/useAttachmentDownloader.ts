import { useCallback, useState } from "react";
import { useAuth } from "../../../auth/AuthContext";
import { API_BASE_URL } from "../../../config";

export function useAttachmentDownloader() {
  const { backendAccessToken } = useAuth();
  const [downloadError, setDownloadError] = useState<string | null>(null);

  const handleDownloadAttachment = useCallback(
    async (attachmentId: string, filename: string) => {
      if (!backendAccessToken) {
        console.error("Authentication token is missing.");
        setDownloadError("Authentication required to download files.");
        return;
      }

      setDownloadError(null);
      const downloadUrl = `${API_BASE_URL}/attachments/${attachmentId}/download`;

      try {
        const response = await fetch(downloadUrl, {
          method: "GET",
          headers: {
            Authorization: `Bearer ${backendAccessToken}`,
          },
        });

        if (!response.ok) {
          let errorDetail = `Failed to download file (Status: ${response.status})`;
          try {
            const errorData = await response.json();
            errorDetail = errorData.detail || errorDetail;
          } catch {
            errorDetail = response.statusText || errorDetail;
          }
          throw new Error(errorDetail);
        }

        const blob = await response.blob();
        const url = window.URL.createObjectURL(blob);
        const a = document.createElement("a");
        a.style.display = "none";
        a.href = url;
        a.download = filename;
        document.body.appendChild(a);
        a.click();
        window.URL.revokeObjectURL(url);
        document.body.removeChild(a);
      } catch (err: any) {
        console.error("Error downloading attachment:", err);
        setDownloadError(`Download failed: ${err.message}`);
      }
    },
    [backendAccessToken]
  );

  return { handleDownloadAttachment, downloadError };
}
