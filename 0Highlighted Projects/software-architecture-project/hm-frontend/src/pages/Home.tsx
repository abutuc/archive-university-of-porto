import React, { useEffect, useState } from "react";
import webSocketService from "../hooks/WebSocketService";
import DisplaySensors from "../components/DisplaySensors";
import DisplayActuators from "../components/DisplayActuators";
import PlatformSet from "../components/PlatformSet.tsx";

const Home: React.FC = () => {
  const [sensorValues, setSensorValues] = useState([]);
  const [sensorStates, setSensorStates] = useState([]);
  const [actuatorStates, setActuatorStates] = useState([]);
  const [actuatorCommands, setActuatorCommands] = useState([]);
  const [isOpened, setIsOpened] = useState(false);

  useEffect(() => {
    const onMessageReceived = (topic: string, data: any) => {
      if (topic === "sensorValues") {
        setSensorValues(data);
      } else if (topic === "sensorStates") {
        setSensorStates(data);
      } else if (topic === "actuatorStates") {
        setActuatorStates(data);
      } else if (topic === "actuatorCommands") {
        setActuatorCommands(data);
      }
    };
    webSocketService.connect(onMessageReceived);
  }, []);

  return (
    <>
      <PlatformSet isOpen={isOpened} setIsOpen={setIsOpened} />
      <DisplaySensors sensorValues={sensorValues} sensorStates={sensorStates} />
      <DisplayActuators
        actuatorStates={actuatorStates}
        actuatorCommands={actuatorCommands}
      />
    </>
  );
};

export default Home;