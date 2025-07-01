import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom"; // Import Router components for routing
import { HubsProvider } from "./context/HubsProvider.tsx";
import { ActuatorsProvider } from "./context/ActuatorsProvider.tsx";
import Dashboard from "./pages/Dashboard"; // Import the Dashboard page component
import Devices from "./pages/Devices.tsx";
import Rules from "./pages/Rules.tsx"; // Import the Login page component
import Home from "./pages/Home.tsx";

// Main App component
const App: React.FC = () => {
  return (
    <ActuatorsProvider>
      <HubsProvider>
        <BrowserRouter>
          {/* Define routes for the app */}
          <Routes>
            {/* Route for the dashboard page */}
            <Route path="/" element={<Dashboard />}>
              <Route index element={<Home />} />
              <Route path="devices" element={<Devices />} />
              <Route path="rules" element={<Rules />} />
            </Route>
          </Routes>
        </BrowserRouter>
      </HubsProvider>
    </ActuatorsProvider>
  );
};

export default App; // Export the App component
