import { t } from "i18next";

interface ConfirmDeleteDialogProps {
    isOpen: boolean;
    onConfirm: () => void;
    onCancel: () => void;
    is_expense: boolean; // If false, then it is an expenditure
}

export const ConfirmDeleteDialog: React.FC<ConfirmDeleteDialogProps> = ({
    isOpen,
    onConfirm,
    onCancel,
    is_expense,
}) => {
    if (!isOpen) return null;
    
    return (
        <div
            className={`fixed inset-0 z-50 flex items-center justify-center bg-black-50 transition-opacity`}
        >
            <div className="bg-white rounded-lg shadow-lg p-6">
                <h2 className="text-lg font-semibold mb-4">
                    {t("confirm_delete")}
                </h2>
                <p>
                    {is_expense
                        ? t("confirm_delete_expense")
                        : t("confirm_delete_expenditure")}
                </p>
                <div className="flex justify-end mt-4">
                    <button
                        className="mr-2 px-4 py-2 bg-gray-300 text-gray-700 rounded-md hover:bg-gray-400"
                        onClick={onCancel}
                    >
                        {t("cancel")}
                    </button>
                    <button
                        className="px-4 py-2 bg-red-600 text-white rounded-md hover:bg-red-700"
                        onClick={() => {
                            onConfirm();
                        }}
                    >
                        {t("delete")}
                    </button>
                </div>
            </div>
        </div>
    );
}