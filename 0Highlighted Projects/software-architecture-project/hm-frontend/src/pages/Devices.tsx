import React from "react";
import HubsTable from "../components/HubsTable";
import SensorsTable from "../components/SensorsTable";
import ActuatorsTable from "../components/ActuatorsTable";
import HybridDevicesTable from "../components/HybridDevicesTable";

// Devices component that manages the layout of device tables for hubs, sensors, and actuators
const Devices: React.FC = () => {
  return (
    <div>
      {/* Render Tables for different device categories */}
      <HubsTable />
      <SensorsTable />
      <ActuatorsTable />
      <HybridDevicesTable />
    </div>
  );
};

export default Devices;
