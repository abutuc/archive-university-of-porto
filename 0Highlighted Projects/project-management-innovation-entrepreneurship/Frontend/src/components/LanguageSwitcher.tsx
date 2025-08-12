import { useTranslation } from "react-i18next";

const languages = {
  en: { nativeName: "English" },
  pt: { nativeName: "Português" },
};

export const LanguageSwitcher: React.FC = () => {
  const { i18n } = useTranslation();

  const changeLanguage = (lng: string) => {
    i18n.changeLanguage(lng);
  };

  return (
    <div className="flex items-center space-x-1 sm:space-x-2">
      {(Object.keys(languages) as Array<keyof typeof languages>).map((lng) => (
        <button
          type="submit"
          key={lng}
          onClick={() => changeLanguage(lng)}
          className={`px-3 py-1.5 text-xs sm:text-sm rounded ${
            i18n.language === lng
              ? "bg-blue-500 text-white"
              : "bg-gray-200 text-black"
          }`}
          disabled={i18n.language === lng}
        >
          {languages[lng].nativeName}
        </button>
      ))}
    </div>
  );
};
