import React, { useEffect, useState } from "react";
import { MdEdgesensorHigh } from "react-icons/md";

interface DisplaySensorsProps {
  sensorValues: any;
  sensorStates: any;
}

type Sensor = {
  name: string;
  value: any;
  state: any;
};

const DisplaySensors: React.FC<DisplaySensorsProps> = ({
  sensorValues,
  sensorStates,
}) => {
  const [sensors, setSensors] = useState<Sensor[]>([]);

  useEffect(() => {
    const aggregatedData = Object.keys(sensorValues).map((key) => ({
      name: key,
      value: sensorValues[key],
      state: sensorStates[key],
    }));
    setSensors(aggregatedData);
  }, [sensorValues, sensorStates]);

  return (
    <div className="p-m rounded-rounded shadow-md w-full bg-background animate-fade-in">
      <div className="flex justify-between items-center mb-m">
        <h3 className="text-h3 font-semibold text-text">Sensors</h3>
      </div>

      <div className=" p-2 flex gap-base">
            {sensors.map((sensor: any, index: any) => (
              <div
                key={index}
                className={`border-b ${
                  index % 2 === 0 ? "bg-intense" : "bg-secbackground"
                } hover:bg-primary hover:text-white transition-all duration-200 transform justify-items-center p-5 rounded-xl`}
              >
               <MdEdgesensorHigh className="size-20" />
                <p className="p-s text-xl font-bold">{sensor.name}</p>
                <p className="p-s"><b>Value:</b> {Number(sensor.value.toFixed(2))}</p>
                <p className="p-s"><b>State:</b> {sensor.state}</p>
              </div>
            ))}
      </div>
    </div>
  );
};

export default DisplaySensors;
