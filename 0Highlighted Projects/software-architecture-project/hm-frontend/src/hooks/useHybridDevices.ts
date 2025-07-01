import { useEffect, useState } from "react";
import { HybridDevice } from "../types.ts";

class RequestHybridDevice extends HybridDevice {
  type: string | undefined;
}

export default function useHybridDevices() {
  const [hybridDevices, setHybridDevices] = useState<HybridDevice[]>([]);

  const getHybridDevices = async () => {
    const response = await fetch("http://localhost/api/hybrid-device");
    const data = await response.json();
    setHybridDevices(data);
  };

  const addHybridDevice = async (hybridDevice: RequestHybridDevice) => {
    await fetch(
      `/api/hybrid-device?type=${hybridDevice.type}&protocol=${hybridDevice.protocol.type}`,
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
      }
    );
    getHybridDevices();
  };

  const removeHybridDevice = async (id: string) => {
    await fetch(`http://localhost/api/hybrid-device/${id}`, {
      method: "DELETE",
    });
    getHybridDevices();
  };

  const activateHybridDevice = async (id: string) => {
    const response = await fetch(`/api/hybrid-device/${id}/activate`, {
      method: "POST",
    });
    console.log(response.ok);
    getHybridDevices();
  };

  const deactivateHybridDevice = async (id: string) => {
    const response = await fetch(`/api/hybrid-device/${id}/deactivate`, {
      method: "POST",
    });
    console.log(response.ok);
    getHybridDevices();
  };

  useEffect(() => {
    getHybridDevices();
  }, []);

  return {
    hybridDevices,
    addHybridDevice,
    removeHybridDevice,
    activateHybridDevice,
    deactivateHybridDevice,
  };
}
