import i18next from "i18next";
import { initReactI18next, Translation } from "react-i18next";
import LanguageDetector from "i18next-browser-languagedetector";
import translationPT from "./locales/pt.json";
import translationEN from "./locales/en.json";

i18next
  .use(initReactI18next)
  .use(LanguageDetector)
  .init({
    fallbackLng: "en",
    resources: {
      en: {
        translation: translationEN,
      },

      pt: {
        translation: translationPT,
      },
    },
  });
