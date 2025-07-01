import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { GoogleOAuthProvider } from "@react-oauth/google";
import Home from "./pages/Home";
import Dashboard from "./pages/Dashboard";
import DashboardShared from "./pages/DashboardShared";
import "./App.css";
import { AuthProvider } from "./auth/AuthContext";
import { CliComplete } from "./pages/CliComplete";
import { CliLoginForm } from "./components/cli-auth-form";

const GOOGLE_CLIENT_ID =
  "600658539746-k08bunm4hmi6amnhkmhnmm3ujp4mnij2.apps.googleusercontent.com";

function App() {
  return (
    <GoogleOAuthProvider clientId={GOOGLE_CLIENT_ID}>
      <AuthProvider>
        <Routes>
          <Route
            path="/dashboard"
            element={
                <Dashboard />
            }
          />
          <Route
            path="/dashboard/*"
            element={
                <Dashboard />
            }
          />
          <Route
            path="/dashboard/shared"
            element={
                <DashboardShared />
            }
          />
          <Route
            path="/cli-login"
            element={
                <CliLoginForm />
            }
          />
          <Route
            path="/cli-complete"
            element={
                <CliComplete />
            }
          />
          <Route path="*" element={<Home />} />
        </Routes>
      </AuthProvider>
    </GoogleOAuthProvider>
  );
}

export default App;
