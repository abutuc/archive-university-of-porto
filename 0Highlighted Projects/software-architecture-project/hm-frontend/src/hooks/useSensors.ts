import { useEffect, useState } from "react";
import { Sensor } from "../types.ts";

class RequestSensor extends Sensor {
  type: string | undefined;
}

export default function useSensors() {
  const [sensors, setSensors] = useState<Sensor[]>([]);

  const getSensors = async () => {
    const response = await fetch("/api/sensors");
    const data = await response.json();
    setSensors(data);
  };

  const addSensor = async (formData: RequestSensor) => {
    console.log(formData);
    await fetch(
      `/api/sensors?type=${formData.type}&protocol=${formData.protocol.type}`,
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
      }
    );
    getSensors();
  };

  const removeSensor = async (id: string) => {
    await fetch(`/api/sensors/${id}`, {
      method: "DELETE",
    });
    getSensors();
  };

  const activateSensor = async (id: string) => {
    const response = await fetch(`/api/sensors/${id}/activate`, {
      method: "POST",
    });
    console.log(response.ok);
    getSensors();
  };

  const deactivateSensor = async (id: string) => {
    const response = await fetch(`/api/sensors/${id}/deactivate`, {
      method: "POST",
    });
    console.log(response.ok);
    getSensors();
  };

  useEffect(() => {
    getSensors();
  }, []);

  return { sensors, addSensor, removeSensor, activateSensor, deactivateSensor };
}
