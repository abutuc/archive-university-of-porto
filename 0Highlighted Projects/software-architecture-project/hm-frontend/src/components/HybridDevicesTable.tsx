import React, { useState } from "react";
import useHybridDevices from "../hooks/useHybridDevices.ts";
import { FiCheck, FiTrash, FiX } from "react-icons/fi";
import { HybridDevice } from "../types.ts";
import Modal from "./Modal.tsx";

const HybridDevicesTable: React.FC = () => {
  const {
    hybridDevices,
    removeHybridDevice,
    addHybridDevice,
    activateHybridDevice,
    deactivateHybridDevice,
  } = useHybridDevices();
  const [selectedHybridDevice, setSelectedHybridDevice] =
    useState<HybridDevice>(new HybridDevice({ type: "Internal" }));
  const [modalToggle, setModalToggle] = useState(false);

  return (
    <div className="p-4 rounded shadow-md w-full mb-4 bg-background">
      <div className="flex justify-between items-center mb-4">
        <h3 className="text-lg font-semibold capitalize">Hybrid Device</h3>
        <button
          className="bg-primary text-white w-36 px-3 py-1.5 rounded"
          onClick={() => {
            setSelectedHybridDevice(new HybridDevice({ type: "Internal" }));
            setModalToggle(true);
          }}
        >
          + Add Hybrid Device
        </button>
      </div>
      <div className="overflow-x-auto">
        <table className="w-full text-left text-base border-collapse">
          <thead className="bg-secbackground text-text">
            <tr>
              <th className="p-s text-center font-medium">Activated</th>
              <th className="p-s font-medium">Name</th>
              <th className="p-s text-center font-medium">Actions</th>
            </tr>
          </thead>
          <tbody>
            {hybridDevices.map((hybridDevice, index) => (
              <tr
                key={index}
                className={`border-b ${
                  index % 2 === 0 ? "bg-intense" : "bg-secbackground"
                } hover:bg-primary hover:text-white transition-all duration-200 transform`}
              >
                <td className="p-s justify-items-center">
                  {hybridDevice.on ? (
                    <FiCheck className="text-green-400 size-6" />
                  ) : (
                    <FiX className="text-red-400 size-6" />
                  )}
                </td>
                <td>{hybridDevice.name}</td>
                <td className="p-s flex justify-center gap-s">
                  <button
                    onClick={() => removeHybridDevice(hybridDevice.id)}
                    className="text-red-500 hover:text-red-700 hover:scale-110 active:scale-95 transition-transform duration-200"
                    title="Delete Actuator"
                  >
                    <FiTrash className="text-lg" />
                  </button>
                  {hybridDevice.on ? (
                    <button
                      onClick={() => deactivateHybridDevice(hybridDevice.id)}
                      className="underline text-blue-400 text-sm"
                    >
                      Deactivate
                    </button>
                  ) : (
                    <button
                      onClick={() => activateHybridDevice(hybridDevice.id)}
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
            device={selectedHybridDevice}
            protocols={["InternalProtocol", "ZigBeeProtocol"]}
            execute={addHybridDevice}
            onClose={() => setModalToggle(false)}
          />
        </div>
      )}
    </div>
  );
};

export default HybridDevicesTable;
