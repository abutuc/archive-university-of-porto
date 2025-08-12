import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import "swiper/swiper-bundle.css";
import "simplebar-react/dist/simplebar.min.css";
import "flatpickr/dist/flatpickr.css";

import App from "./App.tsx";
import { AppWrapper } from "./components/PageMeta.tsx";

import { PublicClientApplication } from "@azure/msal-browser";
import { MsalProvider } from "@azure/msal-react";
import { msalConfig } from "./auth/authConfig.ts";

import "./i18n"; // Import i18n configuration

const msalInstance = new PublicClientApplication(msalConfig);

async function renderApp() {
  await msalInstance.initialize();

  createRoot(document.getElementById("root")!).render(
    <StrictMode>
      <MsalProvider instance={msalInstance}>
        <AppWrapper>
          <App />
        </AppWrapper>
      </MsalProvider>
    </StrictMode>
  );
}

renderApp();
