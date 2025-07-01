import React, {useEffect, useState} from "react";
import { Sensor, Actuator, Operation } from "../types";

type Condition = {
    sensor: string;
    operation: Operation;
    value: string;
    connector?: string; // AND/OR
};

type Action = {
    actuator: string;
    action: string;
};

type Rule = {
    id?: string; // Optional for new rules
    conditions: Condition[];
    actions: Action[];
};

type ModalRulesProps = {
    isOpen: boolean;
    onClose: () => void;
    onSave: (rule: string) => void;
    existingRule?: Rule;
    sensors: Sensor[];
    actuators: Actuator[];
};

const ModalRules: React.FC<ModalRulesProps> = ({
                                                   isOpen,
                                                   onClose,
                                                   onSave,
                                                   existingRule,
                                                   sensors,
                                                   actuators,
                                               }) => {
    const [conditions, setConditions] = useState<Condition[]>(
      existingRule?.conditions || []
    );
    const [actions, setActions] = useState<Action[]>(existingRule?.actions || []);
    const [commands, setCommands] = useState<any>();
    const handleConditionChange = (index: number, key: keyof Condition, value: string) => {
        console.log(index, key, value);
        const updatedConditions = [...conditions];
        updatedConditions[index][key] = value;
        setConditions(updatedConditions);
    };

    const fetchCommands = async () => {
        try {
            const response = await fetch(
                `/api/rules/actuatorCommands`
            );
            if (!response.ok) {
                throw new Error("Failed to fetch commands");
            }
            const data = await response.json();
            console.log(data);
            setCommands(data);
        } catch (error) {
            console.error("Error fetching commands:", error);
        }
    };

    useEffect(() => {
        fetchCommands();
    }, []);

    const handleActionChange = (index: number, key: keyof Action, value: string) => {
        const updatedActions = [...actions];
        updatedActions[index][key] = value;
        setActions(updatedActions);
    };

    const addCondition = () => {
        setConditions([...conditions, { sensor: "", operation: Operation.EQ, value: "" }]);
    };

    const addAction = () => {
        setActions([...actions, { actuator: "", action: "" }]);
    };

    const saveRule = () => {
        const newRule: Rule = {
            id: existingRule?.id || undefined,
            conditions,
            actions,
        };
        const convertRuleToString = (rule: Rule): string => {
            const conditionsStr = rule.conditions
              .map((condition, index) => {
                  const base = `${condition.sensor} ${condition.operation} ${condition.value}`;
                  return condition.connector && index < rule.conditions.length
                    ? `${base} ${condition.connector}`
                    : base;
              })
              .join(" ");

            const actionsStr = rule.actions
              .map((action) => `${action.actuator} ${action.action}`)
              .join(" AND ");

            return `if (${conditionsStr}) then ${actionsStr}`;
        };
        const ruleString = convertRuleToString(newRule);
        onSave(ruleString);
        onClose();
    };

    if (!isOpen) return null;

    return (
      <div className="fixed inset-0 z-50 flex items-center justify-center bg-black bg-opacity-50">
          <div className="bg-intense rounded-lg shadow-lg w-full max-w-3xl p-6">
              <h2 className="text-xl font-semibold text-text mb-4">
                  {existingRule ? "Edit Rule" : "Add Rule"}
              </h2>

              {/* Conditions Section */}
              <div className="mb-6">
                  <h3 className="text-lg font-medium text-text mb-2">Conditions</h3>
                  {conditions.map((condition, index) => (
                    <div
                      key={index}
                      className="flex items-center gap-4 mb-3 border-b border-gray-300 pb-2"
                    >
                        <select
                          value={condition.sensor}
                          required
                          onChange={(e) => handleConditionChange(index, "sensor", e.target.value)}
                          className="flex-1 p-2 border border-gray-300 rounded focus:outline-none focus:ring focus:ring-blue-300"
                        >
                            <option value="">Select Sensor</option>
                            {sensors.map((sensor) => (
                              <option key={sensor.id} value={sensor.name}>
                                  {sensor.name}
                              </option>
                            ))}
                        </select>
                        <select
                          value={condition.operation}
                          required
                          onChange={(e) =>
                            handleConditionChange(index, "operation", e.target.value as Operation)
                          }
                          className="flex-1 p-2 border border-gray-300 rounded focus:outline-none focus:ring focus:ring-blue-300"
                        >
                            {Object.entries(Operation).map(([key, value]) => (
                              <option key={value} value={value}>
                                  {value}
                              </option>
                            ))}
                        </select>
                        <input
                          type="text"
                          required
                          placeholder="Value"
                          value={condition.value}
                          onChange={(e) => handleConditionChange(index, "value", e.target.value)}
                          className="flex-1 p-2 border border-gray-300 rounded focus:outline-none focus:ring focus:ring-blue-300"
                        />
                        {index < conditions.length - 1 && (
                          <select
                            value={condition.connector || ""}
                            required
                            onChange={(e) =>
                              handleConditionChange(index, "connector", e.target.value)
                            }
                            className="flex-1 p-2 border border-gray-300 rounded focus:outline-none focus:ring focus:ring-blue-300"
                          >
                              <option value="AND">AND</option>
                              <option value="OR">OR</option>
                          </select>
                        )}
                    </div>
                  ))}
                  <button
                    onClick={addCondition}
                    className="px-4 py-2 bg-blue-500 text-white rounded hover:bg-blue-600 transition"
                  >
                      Add Condition
                  </button>
              </div>

              {/* Actions Section */}
              <div className="mb-6">
                  <h3 className="text-lg font-medium text-text mb-2">Actions</h3>
                  {actions.map((action, index) => (
                    <div
                      key={index}
                      className="flex items-center gap-4 mb-3 border-b border-gray-300 pb-2"
                    >
                        <select
                          value={action.actuator}
                          required
                          onChange={(e) => handleActionChange(index, "actuator", e.target.value)}
                          className="flex-1 p-2 border border-gray-300 rounded focus:outline-none focus:ring focus:ring-blue-300"
                        >
                            <option value="">Select Actuator</option>
                            {actuators.map((actuator) => (
                              <option selected key={actuator.id} value={actuator.name}>
                                  {actuator.name}
                              </option>
                            ))}
                        </select>
                        {action.actuator && (
                          <select
                            required
                            onChange={(e) => handleActionChange(index, "action", e.target.value)}
                            className="flex-1 p-2 border border-gray-300 rounded focus:outline-none focus:ring focus:ring-blue-300"
                          >
                              <option value="">Select Command</option>
                              {commands[action.actuator.slice(0, action.actuator.lastIndexOf("-")).toUpperCase()].map((command, idx) => (
                                <option key={idx} value={command}>
                                    {command}
                                </option>
                              ))}
                          </select>
                        )}

                    </div>
                  ))}
                  <button
                    onClick={addAction}
                    className="px-4 py-2 bg-green-500 text-white rounded hover:bg-green-600 transition"
                  >
                      Add Action
                  </button>
              </div>

              {/* Modal Footer */}
              <div className="flex justify-end gap-4">
                  <button
                    onClick={onClose}
                    className="px-4 py-2 bg-gray-300 text-gray-800 rounded hover:bg-gray-400 transition"
                  >
                      Cancel
                  </button>
                  <button
                    onClick={saveRule}
                    className="bg-primary text-white font-medium px-base py-s rounded-soft shadow hover:bg-secondary hover:scale-105 active:scale-95 transition-transform duration-200"
                  >
                      Save
                  </button>
              </div>
          </div>
      </div>
    );
};

export default ModalRules;