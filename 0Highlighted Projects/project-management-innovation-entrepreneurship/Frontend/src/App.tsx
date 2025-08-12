import { BrowserRouter as Router } from "react-router";

import { AuthProvider } from "./auth/AuthContext";
import { Toaster } from "react-hot-toast";
import AppRoutes from "./routes/AppRoutes";

export default function App() {
  return (
    <AuthProvider>
      <Router>
        <AppRoutes />
      </Router>
      <Toaster position="bottom-right" />
    </AuthProvider>
  );
}