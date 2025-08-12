import { Link } from "react-router";
import NotificationDropdown from "../components/NotificationDropdown";
import UserDropdown from "../components/UserDropdown";
import { LanguageSwitcher } from "../components/LanguageSwitcher";
import { useAuth } from "../auth/AuthContext";

const AppHeader: React.FC = () => {
  const { jobTitle } = useAuth();

  return (
    <header className="sticky top-0 flex w-full bg-white border-gray-200 z-99999 border-b">
      <div className="flex flex-row items-center justify-between grow px-4 sm:px-6">
        <div className="flex items-center justify-normal w-full gap-2 px-0 py-4 border-b-0">
          <Link to="/">
            <img
              src="./images/logo/inovamais_logo.png"
              alt="Logo"
              className="w-24 sm:w-32 md:w-36 lg:w-40 h-auto"
            />
          </Link>
        </div>
        <div className="flex items-center justify-end w-full shadow-none gap-1 sm:gap-2 md:gap-4 px-0 py-4">
          <div className="flex items-center gap-1">
            <LanguageSwitcher />
          </div>
          {jobTitle != "Super Admin" && (
            <div className="flex items-center">
              <NotificationDropdown />
            </div>
          )}

          <UserDropdown />
        </div>
      </div>
    </header>
  );
};

export default AppHeader;
