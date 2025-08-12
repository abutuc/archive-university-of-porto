import PageMeta from "../../components/PageMeta";
import { useTranslation } from "react-i18next";
import { LanguageSwitcher } from "../../components/LanguageSwitcher";
import { useAuth } from "../../auth/AuthContext";
import { useNavigate } from "react-router";

export default function SignIn() {
  const navigate = useNavigate();
  const { login } = useAuth();
  const { t } = useTranslation();

  const handleLogin = async () => {
    await login();
    navigate("/");
  };

  return (
    <>
      <PageMeta
        title={t("app_name")}
        description={t("auth_signIn_description")}
      />
      <div className="overflow-y-auto">
        <div className="relative flex flex-col justify-center w-full md:h-screen md:flex-row">
          <div className="flex flex-col-reverse md:flex-row flex-1">
            <div className="flex-1 flex items-center justify-center px-6 py-12 sm:px-8">
              <div className="w-full max-w-md">
                <h1 className="mb-6 text-2xl font-semibold text-gray-800 dark:text-white sm:text-3xl">
                  {t("auth_signIn_title")}
                </h1>

                <button
                  className="w-full flex items-center justify-center gap-3 py-3 text-sm font-medium text-gray-700 bg-gray-100 rounded-lg hover:bg-gray-200 transition"
                  onClick={handleLogin}
                >
                  <img
                    src="images/logo/microsoft_icon.png"
                    alt="Microsoft Logo"
                    className="w-5 h-5"
                  />
                  {t("auth_signIn_with_microsoft")}
                </button>
              </div>
            </div>

            <div className="bg-brand-950 flex flex-col items-center justify-center p-8 text-center text-white md:w-1/2">
              <div className="mb-4">
                <img
                  src="/images/logo/inova_logo-white.png"
                  alt="Logo"
                  className="mx-auto w-[185px] h-auto"
                />
                <h1 className="text-xl font-bold mt-4">{t("app_name")}</h1>
              </div>
              <p className="text-sm text-gray-400 max-w-xs">
                {t("auth_signIn_altDescription")}
              </p>
            </div>
          </div>

          <div className="fixed z-50 bottom-6 left-6 sm:block">
            <LanguageSwitcher />
          </div>
        </div>
      </div>
    </>
  );
}
