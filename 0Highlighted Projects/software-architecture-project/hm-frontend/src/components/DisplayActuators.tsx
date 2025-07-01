import React from "react";
import { AiOutlineAim } from "react-icons/ai";

interface DisplayActuatorProps {
  actuatorStates: any;
  actuatorCommands: any;
}

const DisplayActuators: React.FC<DisplayActuatorProps> = ({
  actuatorStates,
  actuatorCommands,
}) => {
  return (
    <div className="p-m rounded-rounded shadow-md w-full bg-background animate-fade-in">
      <div className="flex justify-between items-center mb-m">
        <h3 className="text-h3 font-semibold text-text">Actuators</h3>
      </div>

      <div className="p-2 flex gap-base">

            {Object.entries(actuatorStates).map(([key, value], index) => (
              <div
                key={index}
                className={`border-b ${
                  index % 2 === 0 ? "bg-intense" : "bg-secbackground"
                } hover:bg-primary hover:text-white transition-all duration-200 transform justify-items-center p-5 rounded-xl`}
              >
                <AiOutlineAim className="size-20" />
                <p className="p-s text-xl font-bold">{key}</p>
                <p className="p-s"><b>Last Command:</b> {actuatorCommands[key]}</p>
                <p className="p-s"><b>Last State:</b> {value}</p>
              </div>
            ))}
      </div>
    </div>
  );
};

export default DisplayActuators;
