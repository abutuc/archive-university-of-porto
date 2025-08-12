import { Loader2 } from "lucide-react";
import { useTranslation } from "react-i18next";

type LoadingOverlayProps = {
  messageKey?: string; // optional key for translation
};

export default function LoadingOverlay({ messageKey }: LoadingOverlayProps) {
  const { t } = useTranslation();

  return (
    <div
      className="fixed inset-0 z-50 flex flex-col items-center justify-center backdrop-blur-sm"
      style={{ backgroundColor: "rgba(0, 0, 0, 0.1)" }}
    >
      <Loader2 className="animate-spin text-black w-12 h-12 mb-4" />
      {messageKey && (
        <p className="text-black text-lg font-medium">{t(messageKey)}</p>
      )}
    </div>
  );
}
