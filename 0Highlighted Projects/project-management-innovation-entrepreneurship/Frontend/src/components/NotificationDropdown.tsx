import { useState, useEffect } from "react";
import { Dropdown } from "./Dropdown";
import { DropdownItem } from "./DropdownItem";
import { useNavigate } from "react-router";
import { useTranslation } from "react-i18next";
import { useNotifications } from "../hooks/useNotifications";
import { useAuth } from "../auth/AuthContext";
import { useReports } from "../hooks/useReports";
import { ExpenseReportStatus } from "../types/ExpenseReportStatus";
import UserAvatar from "./UserAvatar";

export enum NotificationPurposeEnum {
  WAITING_FOR_REVIEW = "WAITING_FOR_REVIEW",
  REPORT_APPROVED_BY_FO = "REPORT_APPROVED_BY_FO",
  REPORT_APPROVED_BY_ACCOUNTANT = "REPORT_APPROVED_BY_ACCOUNTANT",
  JUSTIFICATION_CORRECTION_REQUIRED = "JUSTIFICATION_CORRECTION_REQUIRED",
  ADDITIONAL_STEPS_REQUIRED = "ADDITIONAL_STEPS_REQUIRED",
  APPROVED = "APPROVED",
}

export type Notification = {
  id: string;
  user_id: string;
  report_id: string;
  is_read: boolean;
  created_at: string;
  notification_purpose: NotificationPurposeEnum;
  report_type: string;
  report_status: ExpenseReportStatus;
  created_by: string;
};

export default function NotificationDropdown() {
  const [isOpen, setIsOpen] = useState(false);
  const [notifying, setNotifying] = useState(false);
  const [notifications, setNotifications] = useState<Notification[]>([]);
  const { t } = useTranslation();
  const { id } = useAuth() as any;

  const navigate = useNavigate();

  const { getUnreadNotifications, markNotificationAsRead } = useNotifications();
  const { getAllReports } = useReports();

  // PULL every 5 seconds
  useEffect(() => {
    const fetchNotifications = async () => {
      const newNotifications = await getUnreadNotifications(id);
      const allReports = await getAllReports();
      const visibleReportIds = new Set(
        (allReports || []).map((r: any) => r.id)
      );
      const latestNotificationsMap = new Map<string, Notification>();

      for (const notif of newNotifications) {
        if (!visibleReportIds.has(notif.report_id)) continue;
        if (!matchingNotificationStatusWithText(notif, notif.report_status))
          continue;

        const existing = latestNotificationsMap.get(notif.report_id);
        if (
          !existing ||
          new Date(notif.created_at) > new Date(existing.created_at)
        ) {
          latestNotificationsMap.set(notif.report_id, notif);
        }
      }
      const filteredNotifications = Array.from(latestNotificationsMap.values());

      setNotifications((prev) => {
        const prevIds = new Set(prev.map((n) => n.id));
        const hasNew = filteredNotifications.some((n) => !prevIds.has(n.id));

        if (hasNew) setNotifying(true);

        return filteredNotifications;
      });
    };

    fetchNotifications();

    const interval = setInterval(fetchNotifications, 60000);
    return () => clearInterval(interval);
  }, [getUnreadNotifications, getAllReports, id]);

  function toggleDropdown() {
    setIsOpen(!isOpen);
  }

  function closeDropdown() {
    setIsOpen(false);
  }

  const handleClick = () => {
    toggleDropdown();
    setNotifying(false);
  };

  const handleClickDropdownItem = async (
    notificationId: string,
    reportId: string
  ) => {
    await markNotificationAsRead(notificationId);
    setNotifications((prev) =>
      prev.filter((notification) => notification.id !== notificationId)
    );

    navigate("/view-expense-report", { state: { reportId: reportId } });
    closeDropdown();
  };

  const formatNotificationDate = (dateString: string): string => {
    const createdDate = new Date(dateString);
    const now = new Date();

    const createdAtMidnight = new Date(
      createdDate.getFullYear(),
      createdDate.getMonth(),
      createdDate.getDate()
    );
    const nowMidnight = new Date(
      now.getFullYear(),
      now.getMonth(),
      now.getDate()
    );

    const diffInMs = nowMidnight.getTime() - createdAtMidnight.getTime();
    const diffInDays = Math.floor(diffInMs / (1000 * 60 * 60 * 24));

    if (diffInDays === 0) return t("today");
    if (diffInDays === 1) return t("one_day_ago");
    return diffInDays + " " + t("days_ago");
  };

  function filterReportType(reportType: string) {
    switch (reportType) {
      case "126a6a46-a100-45e4-8700-a2f4f18efe70":
        return "Advance Request";
      case "9b9b484c-2cef-467f-b012-c8bb9b3e2214":
        return "Validation Request";
      default:
        return "Expense Report";
    }
  }

  function getReportStatus(reportStatus: ExpenseReportStatus) {
    switch (reportStatus) {
      case ExpenseReportStatus.PENDING_FO_REVIEW:
        return t("Pending Finance Officer Review");
      case ExpenseReportStatus.PENDING_ACCOUNTANT_REVIEW:
        return t("Pending Accountant Review");
      case ExpenseReportStatus.JUSTIFICATION_CORRECTION_REQUIRED:
        return t("Justification Corrections Required");
      case ExpenseReportStatus.ADDITIONAL_STEPS_REQUIRED:
        return t("Additional Steps Required");
      default:
        return t("Approved");
    }
  }

  function matchingNotificationStatusWithText(
    notification: Notification,
    reportStatus: ExpenseReportStatus
  ) {
    const { notification_purpose } = notification;
    return (
      (notification_purpose === NotificationPurposeEnum.WAITING_FOR_REVIEW &&
        (reportStatus === ExpenseReportStatus.PENDING_FO_REVIEW ||
          reportStatus === ExpenseReportStatus.PENDING_ACCOUNTANT_REVIEW)) ||
      (notification_purpose ===
        NotificationPurposeEnum.REPORT_APPROVED_BY_ACCOUNTANT &&
        reportStatus === ExpenseReportStatus.APPROVED) ||
      (notification_purpose === NotificationPurposeEnum.REPORT_APPROVED_BY_FO &&
        reportStatus === ExpenseReportStatus.PENDING_ACCOUNTANT_REVIEW) ||
      (notification_purpose ===
        NotificationPurposeEnum.JUSTIFICATION_CORRECTION_REQUIRED &&
        reportStatus ===
          ExpenseReportStatus.JUSTIFICATION_CORRECTION_REQUIRED) ||
      (notification_purpose ===
        NotificationPurposeEnum.ADDITIONAL_STEPS_REQUIRED &&
        reportStatus === ExpenseReportStatus.ADDITIONAL_STEPS_REQUIRED)
    );
  }

  function getNotificationMessage(notification: Notification) {
    const { created_by, report_type, notification_purpose } = notification;
    const reportType = filterReportType(report_type);

    switch (notification_purpose) {
      case NotificationPurposeEnum.WAITING_FOR_REVIEW:
        return (
          <>
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(created_by)}
            </span>{" "}
            {t("submitted") + " "}
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(reportType)}
            </span>{" "}
            {t("require_attention") + "."}
          </>
        );

      case NotificationPurposeEnum.REPORT_APPROVED_BY_FO ||
        NotificationPurposeEnum.REPORT_APPROVED_BY_ACCOUNTANT:
        return (
          <>
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(created_by)}
            </span>{" "}
            {t("approved_a") + " "}
            <span className="font-medium text-gray-800 dark:text-white/90">
              {reportType}
            </span>
            .
          </>
        );

      case NotificationPurposeEnum.JUSTIFICATION_CORRECTION_REQUIRED:
        return (
          <>
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(created_by)}
            </span>{" "}
            {t("requested_justification") + " "}
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(reportType)}
            </span>
            .
          </>
        );

      case NotificationPurposeEnum.ADDITIONAL_STEPS_REQUIRED:
        return (
          <>
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(created_by)}
            </span>{" "}
            {t("requires_steps") + " "}
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(reportType)}
            </span>
            .
          </>
        );

      case NotificationPurposeEnum.APPROVED:
        return (
          <>
            {t("your") + " "}
            <span className="font-medium text-gray-800 dark:text-white/90">
              {t(reportType)}
            </span>{" "}
            {t("has_been_approved") + "."}
          </>
        );
    }
  }

  return (
    <div className="relative">
      <button
        className="relative flex items-center justify-center text-gray-500 transition-colors bg-white border border-gray-200 rounded-full dropdown-toggle hover:text-gray-700 h-8 w-8 sm:h-11 sm:w-11 hover:bg-gray-100 dark:border-gray-800 dark:bg-gray-900 dark:text-gray-400 dark:hover:bg-gray-800 dark:hover:text-white"
        onClick={handleClick}
      >
        <span
          className={`absolute -right-0.5 -top-0.5 sm:right-0 sm:top-0.5 z-10 h-1.5 w-1.5 sm:h-2 sm:w-2 rounded-full bg-orange-400 ${
            !notifying ? "hidden" : "flex"
          }`}
        >
          <span className="absolute inline-flex w-full h-full bg-orange-400 rounded-full opacity-75 animate-ping"></span>
        </span>
        <svg
          className="fill-current w-4 h-4 sm:w-5 sm:h-5"
          viewBox="0 0 20 20"
          xmlns="http://www.w3.org/2000/svg"
        >
          <path
            fillRule="evenodd"
            clipRule="evenodd"
            d="M10.75 2.29248C10.75 1.87827 10.4143 1.54248 10 1.54248C9.58583 1.54248 9.25004 1.87827 9.25004 2.29248V2.83613C6.08266 3.20733 3.62504 5.9004 3.62504 9.16748V14.4591H3.33337C2.91916 14.4591 2.58337 14.7949 2.58337 15.2091C2.58337 15.6234 2.91916 15.9591 3.33337 15.9591H4.37504H15.625H16.6667C17.0809 15.9591 17.4167 15.6234 17.4167 15.2091C17.4167 14.7949 17.0809 14.4591 16.6667 14.4591H16.375V9.16748C16.375 5.9004 13.9174 3.20733 10.75 2.83613V2.29248ZM14.875 14.4591V9.16748C14.875 6.47509 12.6924 4.29248 10 4.29248C7.30765 4.29248 5.12504 6.47509 5.12504 9.16748V14.4591H14.875ZM8.00004 17.7085C8.00004 18.1228 8.33583 18.4585 8.75004 18.4585H11.25C11.6643 18.4585 12 18.1228 12 17.7085C12 17.2943 11.6643 16.9585 11.25 16.9585H8.75004C8.33583 16.9585 8.00004 17.2943 8.00004 17.7085Z"
            fill="currentColor"
          />
        </svg>
      </button>
      <Dropdown
        isOpen={isOpen}
        onClose={closeDropdown}
        className="absolute -right-[280px] sm:-right-[240px] lg:right-0 mt-[12px] sm:mt-[17px] flex h-[400px] sm:h-[480px] w-[320px] sm:w-[350px] lg:w-[361px] flex-col rounded-2xl border border-gray-200 bg-white p-2 sm:p-3 shadow-theme-lg dark:border-gray-800 dark:bg-gray-dark"
      >
        <div className="flex items-center justify-between pb-2 sm:pb-3 mb-2 sm:mb-3 border-b border-gray-100 dark:border-gray-700">
          <h5 className="text-base sm:text-lg font-semibold text-gray-800 dark:text-gray-200">
            {t("notifications")}
          </h5>
          <button
            onClick={toggleDropdown}
            className="text-gray-500 transition dark:text-gray-400 hover:text-gray-700 dark:hover:text-gray-200 text-sm sm:text-base"
          >
            ✕
          </button>
        </div>
        <ul className="flex flex-col h-auto overflow-y-auto custom-scrollbar">
          {notifications.map((notification) => (
            <li key={notification.id}>
              <DropdownItem
                onItemClick={() =>
                  handleClickDropdownItem(
                    notification.id,
                    notification.report_id
                  )
                }
                className="flex gap-2 sm:gap-3 rounded-lg border-b border-gray-100 p-2 sm:p-3 px-3 sm:px-4.5 py-2 sm:py-3 hover:bg-gray-100 dark:border-gray-800 dark:hover:bg-white/5"
              >
                <span className="relative block w-8 h-8 sm:w-10 sm:h-10 rounded-full z-1 max-w-8 sm:max-w-10">
                  <UserAvatar 
                    name={notification.created_by || "User"} 
                    size="sm" 
                  />
                </span>
                <span className="block">
                  <span className="mb-1 sm:mb-1.5 block text-xs sm:text-theme-sm text-gray-500 dark:text-gray-400">
                    {getNotificationMessage(notification)}
                  </span>
                  <span className="flex justify-between w-full text-gray-500 text-xs sm:text-theme-xs dark:text-gray-400">
                    <span className="flex flex-col break-words">
                      <span className="text-xs">
                        Status: {getReportStatus(notification.report_status)}
                      </span>
                      <span className="text-xs">Report ID: {notification.report_id}</span>
                    </span>
                    <span className="flex items-center gap-1 sm:gap-2 whitespace-nowrap">
                      <span className="w-1 h-1 bg-gray-400 rounded-full"></span>
                      <span className="text-xs">
                        {formatNotificationDate(notification.created_at)}
                      </span>
                    </span>
                  </span>
                </span>
              </DropdownItem>
            </li>
          ))}
        </ul>
      </Dropdown>
    </div>
  );
}