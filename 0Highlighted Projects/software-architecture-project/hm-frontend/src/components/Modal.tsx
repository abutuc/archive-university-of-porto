import React, { useState } from "react";
import { Actuator, Device, HybridDevice, Sensor } from "../types";

interface ModalProps {
  device: Device;
  protocols: string[];
  execute: (data: any) => Promise<void>;
  onClose: () => void;
}

const Modal: React.FC<ModalProps> = ({
  device,
  protocols,
  execute,
  onClose,
}) => {
  const [inputs, setInputs] = useState(device);

  const handleChange = (
    event: React.ChangeEvent<HTMLInputElement | HTMLSelectElement>
  ) => {
    const name = event.target.name;
    const value =
      event.target.type === "checkbox"
        ? (event.target as HTMLInputElement).checked
        : event.target.value;
    setInputs((values) => ({ ...values, [name]: value }));
  };

  const handleSubmit = async (event: React.FormEvent) => {
    event.preventDefault();
    const formattedData = {
      ...inputs,
      protocol: {
        type:
          typeof inputs.protocol === "string"
            ? inputs.protocol
            : inputs.protocol.type,
      },
    };
    await execute(formattedData);
    onClose();
  };

  return (
    <form
      onSubmit={handleSubmit}
      className="fixed inset-0 bg-black bg-opacity-50 flex justify-center items-center z-50 animate-fade-in"
    >
      <div className="bg-background p-6 rounded-rounded shadow-xl w-full max-w-md transform transition-all duration-300 scale-100">
        <h3 className="text-h3 font-semibold text-text mb-4">
          {device.id === "" ? "Add Device" : "Edit Device"}
        </h3>
        <div className="mb-6">
          {device instanceof Sensor && (
            <>
              <label className="block text-sm font-medium mb-1 text-text">
                Type
              </label>
              <select
                required
                name="type"
                onChange={handleChange}
                className="w-full p-2 border rounded-soft focus:outline-none focus:ring-2 focus:ring-primary mb-3"
              >
                <option value="">--- Select Type ---</option>
                <option value="Temperature">Temperature</option>
                <option value="Light">Light</option>
              </select>
            </>
          )}

          {device instanceof Actuator && (
            <>
              <label className="block text-sm font-medium mb-1 text-text">
                Type
              </label>
              <select
                required
                name="type"
                onChange={handleChange}
                className="w-full p-2 border rounded-soft focus:outline-none focus:ring-2 focus:ring-primary mb-3"
              >
                <option value="">--- Select Type ---</option>
                <option value="Fan">Fan</option>
                <option value="WindowBlinds">Window Blinds</option>
              </select>
            </>
          )}

          {device instanceof HybridDevice && (
            <>
              <label className="block text-sm font-medium mb-1 text-text">
                Type
              </label>
              <select
                required
                name="type"
                onChange={handleChange}
                className="w-full p-2 border rounded-soft focus:outline-none focus:ring-2 focus:ring-primary mb-3"
              >
                <option value="">--- Select Type ---</option>
                <option value="AirConditioner">Air Conditioner</option>
              </select>
            </>
          )}

          {/* Protocol Dropdown */}
          <label className="block text-sm font-medium mb-1 text-text">
            Protocol
          </label>
          <select
            name="protocol"
            onChange={handleChange}
            className="w-full p-2 border rounded-soft focus:outline-none focus:ring-2 focus:ring-primary mb-3"
          >
            {protocols.map((protocol) => (
              <option
                selected={inputs.protocol.type === protocol}
                key={protocol}
                value={protocol.slice(0, -8)}
              >
                {protocol}
              </option>
            ))}
          </select>
        </div>

        {/* Action Buttons */}
        <div className="flex justify-end gap-3">
          <button
            type="submit"
            className="bg-primary text-white font-medium px-4 py-2 rounded-soft shadow hover:bg-secondary hover:scale-105 active:scale-95 transition-transform duration-200"
          >
            Save
          </button>
          <button
            type="button"
            onClick={onClose}
            className="bg-gray-400 text-white font-medium px-4 py-2 rounded-soft shadow hover:bg-gray-500 hover:scale-105 active:scale-95 transition-transform duration-200"
          >
            Cancel
          </button>
        </div>
      </div>
    </form>
  );
};

export default Modal;
