import { useEffect, useState } from "react";
import { Actuator } from "../types.ts";

class RequestSensor extends Actuator {
  type: string | undefined;
}

export default function useActuators() {
  const [actuators, setActuators] = useState<Actuator[]>([]);

  const getActuators = async () => {
    const response = await fetch("http://localhost/api/actuators");
    const data = await response.json();
    setActuators(data);
  };

  const addActuator = async (actuator: RequestSensor) => {
    await fetch(
      `/api/actuators?type=${actuator.type}&protocol=${actuator.protocol.type}`,
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
      }
    );
    getActuators();
  };

  const removeActuator = async (id: string) => {
    await fetch(`http://localhost/api/actuators/${id}`, {
      method: "DELETE",
    });
    getActuators();
  };

  const activateActuator = async (id: string) => {
    const response = await fetch(`/api/actuators/${id}/activate`, {
      method: "POST",
    });
    console.log(response.ok);
    getActuators();
  };

  const deactivateActuator = async (id: string) => {
    const response = await fetch(`/api/actuators/${id}/deactivate`, {
      method: "POST",
    });
    console.log(response.ok);
    getActuators();
  };

  useEffect(() => {
    getActuators();
  }, []);

  return {
    actuators,
    addActuator,
    removeActuator,
    activateActuator,
    deactivateActuator,
  };
}
