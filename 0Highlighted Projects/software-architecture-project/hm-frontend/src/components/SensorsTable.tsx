import React, { useState } from "react";
import useSensors from "../hooks/useSensors";
import { FiCheck, FiTrash, FiX } from "react-icons/fi";
import Modal from "./Modal";
import { Sensor } from "../types";

const SensorsTable: React.FC = () => {
  const { sensors, removeSensor, addSensor, activateSensor, deactivateSensor } =
    useSensors();
  const [selectedDevice, setSelectedDevice] = useState<Sensor>(
    new Sensor({ type: "Internal" })
  );
  const [modalToggle, setModalToggle] = useState(false);

  console.log("sensors", sensors);
  return (
    <div className="p-m rounded-rounded shadow-md w-full bg-background animate-fade-in">
      <div className="flex justify-between items-center mb-m">
        <h3 className="text-h3 font-semibold text-text">Sensors</h3>
        <button
          className="bg-primary text-white font-medium px-base py-s rounded-soft shadow hover:bg-secondary hover:scale-105 active:scale-95 transition-transform duration-200"
          onClick={() => {
            setSelectedDevice(new Sensor({ type: "Internal" }));
            setModalToggle(true);
          }}
        >
          + Add Sensor
        </button>
      </div>

      <div className="overflow-x-auto">
        <table className="w-full text-left text-base border-collapse">
          <thead className="bg-secbackground text-text">
            <tr>
              <th className="p-s text-center font-medium">Activated</th>
              <th className="p-s font-medium">Name</th>
              <th className="p-s font-medium">Measurement Value</th>
              <th className="p-s font-medium">Protocol</th>
              <th className="p-s text-center font-medium">Actions</th>
            </tr>
          </thead>
          <tbody>
            {sensors.map((sensor, index) => (
              <tr
                key={index}
                className={`border-b ${
                  index % 2 === 0 ? "bg-intense" : "bg-secbackground"
                } hover:bg-primary hover:text-white transition-all duration-200 transform`}
              >
                <td className="p-s justify-center items-center flex">
                  {sensor.on ? (
                    <>
                      <FiCheck className="text-green-500 size-6" />
                    </>
                  ) : (
                    <>
                      <FiX className="text-red-500 size-6" />
                    </>
                  )}
                </td>
                <td className="p-s">{sensor.name}</td>
                <td className="p-s">{sensor.measurementValue}</td>
                <td className="p-s">{sensor.protocol.type}</td>
                <td className="p-s flex justify-center gap-s">
                  <button
                    onClick={() => removeSensor(sensor.id)}
                    className="text-red-500 hover:text-red-700 hover:scale-110 active:scale-95 transition-transform duration-200"
                    title="Delete Sensor"
                  >
                    <FiTrash className="text-lg" />
                  </button>
                  {sensor.on ? (
                    <button
                      onClick={() => deactivateSensor(sensor.id)}
                      className="underline text-blue-400 text-sm"
                    >
                      Deactivate
                    </button>
                  ) : (
                    <button
                      onClick={() => activateSensor(sensor.id)}
                      className="underline text-blue-400 text-sm"
                    >
                      Activate
                    </button>
                  )}
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>

      {modalToggle && (
        <div className="fixed inset-0 bg-black bg-opacity-30 flex justify-center items-center z-50 animate-slide-in-up">
          <Modal
            device={selectedDevice}
            protocols={["InternalProtocol", "ZigBeeProtocol"]}
            execute={addSensor}
            onClose={() => setModalToggle(false)}
          />
        </div>
      )}
    </div>
  );
};

export default SensorsTable;
