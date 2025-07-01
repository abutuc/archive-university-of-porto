import React, { useState } from "react";
import useHubs from "../hooks/useHubs.ts";
import { FiCheck, FiTrash, FiX } from "react-icons/fi";
import { Hub } from "../types.ts";
import Modal from "./Modal.tsx";

const HubsTable: React.FC = () => {
  const { hubs, removeHub, addHub, activateHub, deactivateHub } = useHubs();
  const [selectedDevice, setSelectedDevice] = useState<Hub>(
    new Hub({ type: "ZigBee" })
  );
  const [modalToggle, setModalToggle] = useState(false);
  console.log("hubs", hubs);

  return (
    <div className="p-4 rounded shadow-md w-full mb-4 bg-background">
      <div className="flex justify-between items-center mb-4">
        <h3 className="text-lg font-semibold capitalize">Hubs</h3>
        <button
          className="bg-primary text-white w-36 px-3 py-1.5 rounded"
          onClick={() => {
            setSelectedDevice(new Hub({ type: "ZigBee" }));
            setModalToggle(true);
          }}
        >
          + Add Hub
        </button>
      </div>
      <div className="overflow-x-auto">
        <table className="w-full text-left text-base border-collapse">
          <thead className="bg-secbackground text-text">
            <tr>
              <th className="p-s text-center font-medium">Activated</th>
              <th className="p-s font-medium">Name</th>
              <th className="p-s font-medium">Protocol</th>
              <th className="p-s text-center font-medium">Actions</th>
            </tr>
          </thead>
          <tbody>
            {hubs.length > 0 &&
              hubs.map((hub, index) => (
                <tr
                  key={index}
                  className={`border-b ${
                    index % 2 === 0 ? "bg-intense" : "bg-secbackground"
                  } hover:bg-primary hover:text-white transition-all duration-200 transform`}
                >
                  <td className="p-s justify-items-center">
                    {hub.on ? (
                      <FiCheck className="text-green-400 size-6" />
                    ) : (
                      <FiX className="text-red-400 size-6" />
                    )}
                  </td>
                  <td className="p-s">{hub.name}</td>
                  <td className="p-s">{hub.protocol.type}</td>
                  <td className="p-s flex justify-center gap-s">
                    <button
                      onClick={() => removeHub(hub.id)}
                      className="text-red-500 hover:text-red-700 hover:scale-110 active:scale-95 transition-transform duration-200"
                      title="Delete Sensor"
                    >
                      <FiTrash className="text-lg" />
                    </button>
                    {hub.on ? (
                      <button
                        onClick={() => deactivateHub(hub.id)}
                        className="underline text-blue-400 text-sm"
                      >
                        Deactivate
                      </button>
                    ) : (
                      <button
                        onClick={() => activateHub(hub.id)}
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
            protocols={["ZigBeeProtocol"]}
            execute={addHub}
            onClose={() => setModalToggle(false)}
          />
        </div>
      )}
    </div>
  );
};

export default HubsTable;
