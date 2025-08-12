import { useState } from "react";
import Button from "./Button";
import { TrashBinIcon } from "../assets/icons";

interface ComponentCardProps {
  title: string;
  children: React.ReactNode;
  className?: string; // Additional custom classes for styling
  desc?: string; // Description text
  showDelete?: boolean;
  deleteCallback?: VoidFunction;
  hideOutFunctionality?: boolean;
  showButton?: boolean;
  textOfButton?: string;
  onClickEvent?: VoidFunction;
}

const ComponentCard: React.FC<ComponentCardProps> = ({
  title,
  children,
  className = "",
  desc = "",
  showDelete = false,
  deleteCallback,
  hideOutFunctionality = false,
  showButton = false,
  textOfButton = "",
  onClickEvent,
}) => {
  const [hiddenContent, setHiddenContent] = useState(false);

  const toggleContent = () => {
    if (hideOutFunctionality) {
      setHiddenContent(!hiddenContent);
    }
  };

  return (
    <div
      className={`rounded-2xl border border-gray-200 bg-white dark:border-gray-800 dark:bg-white/[0.03] ${className}`}
    >
      {/* Card Header */}
      <div className="px-6 py-5" onClick={() => toggleContent()}>
        <div className="grid grid-cols-2">
          <h3 className="text-base font-medium text-gray-800 dark:text-white/90">
            {title}
          </h3>
          {showDelete && (
            <div className="flex justify-end">
              <button
                className="rounded-md border border-slate-300 p-2.5 text-center text-sm transition-all shadow-sm hover:shadow-lg text-slate-600 hover:text-white hover:bg-slate-800 hover:border-slate-800 focus:text-white focus:bg-slate-800 focus:border-slate-800 active:border-slate-800 active:text-white active:bg-slate-800 disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none"
                type="button"
                onClick={() => deleteCallback!()}
              >
                <TrashBinIcon fontSize={18} color="red" />
              </button>
            </div>
          )}
          {showButton && (
            <div className="flex justify-end">
              <Button size="sm" variant="outline" onClick={onClickEvent}>
                {textOfButton}
              </Button>
            </div>
          )}
        </div>
        {desc && (
          <p className="mt-1 text-sm text-gray-500 dark:text-gray-400">
            {desc}
          </p>
        )}
      </div>

      <div
        className={`p-4 border-t border-gray-100 dark:border-gray-800 sm:p-6 transition-all duration-300 ${
          hiddenContent ? "hidden" : ""
        }`}
      >
        <div className="space-y-6">{children}</div>
      </div>
    </div>
  );
};

export default ComponentCard;
