import React, { useState } from 'react';
import ModalRules from './ModalRules.tsx'; // Import your modal component
import useRules from '../hooks/useRules.ts'; // Import your custom hook
import useSensors from "../hooks/useSensors.ts";
import useActuators from "../hooks/useActuators.ts";
import { FiTrash } from "react-icons/fi"; // Import operation enum if needed


// Define the Rule type
type Condition = {
    sensor: string;
    operation: string;
    value: string;
    connector?: string; // AND/OR for complex conditions
};

type Action = {
    actuator: string;
    action: string;
};

type Rule = {
    id: string;
    conditions: Condition[];
    actions: Action[];
};

const parseRule = (id: string, description: string): Rule => {
    const conditionActionSplit = description.split(') then ');
    const conditionPart = conditionActionSplit[0].replace(/^if \(/, '').trim();
    const actionPart = conditionActionSplit[1].trim();

    const parseConditions = (conditionStr: string): Condition[] => {
        const conditions: Condition[] = [];
        const conditionRegex = /([^\s<>=]+)\s*(<|<=|=|>=|>)\s*([^\sANDOR]+)/g;
        let match;
        while ((match = conditionRegex.exec(conditionStr)) !== null) {
            const [, sensor, operation, value] = match;
            conditions.push({ sensor, operation, value });
        }

        // Add connectors (AND/OR) if present
        const connectors = conditionStr.match(/\b(AND|OR)\b/g);
        if (connectors) {
            connectors.forEach((connector, index) => {
                if (conditions[index]) {
                    conditions[index].connector = connector;
                }
            });
        }
        return conditions;
    };

    const parseActions = (actionStr: string): Action[] => {
        return actionStr.split(' AND ').map((action) => {
            const [actuator, actionType] = action.split(' ');
            return { actuator, action: actionType };
        });
    };

    return {
        id,
        conditions: parseConditions(conditionPart),
        actions: parseActions(actionPart),
    };
};

const TableRules: React.FC = () => {
    const { rules, addRule, removeRule } = useRules();
    const [modalToggle, setModalToggle] = useState(false);
    const { sensors } = useSensors();
    const { actuators } = useActuators();

    const handleAddRule = () => {
        setModalToggle(true);
    };

    const parsedRules: Rule[] = Object.entries(rules).map(([id, description]) =>
      parseRule(id, description)
    );

    return (
      <div className="p-4 rounded shadow-md w-full mb-4 bg-background">
          <div className="flex justify-between items-center mb-4">
              <h3 className="text-lg font-semibold capitalize">Rules</h3>
              <button
                onClick={handleAddRule}
                className="bg-primary text-white font-medium px-base py-s rounded-soft shadow hover:bg-secondary hover:scale-105 active:scale-95 transition-transform duration-200"
              >
                  + Add Rule
              </button>
          </div>

          <table className="w-full text-left">
              <thead>
              <tr>
                  <th>ID</th>
                  <th>Conditions</th>
                  <th>Actions</th>
                  <th>Controls</th>
              </tr>
              </thead>
              <tbody>
              {parsedRules.map((rule) => (
                <tr key={rule.id} className="border-t">
                    <td className="py-2">{rule.id}</td>
                    <td className="py-2">
                        {rule.conditions.map((condition, index) => (
                          <>
                          <span key={index}>
                                        {condition.sensor} {condition.operation} {condition.value}
                              {condition.connector && ` ${condition.connector} `}
                                    </span><br /></>
                        ))}
                    </td>
                    <td className="py-2">
                        {rule.actions.map((action, index) => (
                          <>
                          <span key={index}>
                                        {action.actuator} {action.action}
                              {index < rule.actions.length}
                                    </span><br />
                          </>
                        ))}
                    </td>
                    <td className="py-2">
                        <button
                          onClick={() => removeRule(rule.id)}
                          className="text-red-500 hover:text-red-700 hover:scale-110 active:scale-95 transition-transform duration-200"
                          title="Delete Sensor"
                        >
                            <FiTrash className="text-lg" />
                        </button>
                    </td>
                </tr>
              ))}
              </tbody>
          </table>
          <hr />
          {modalToggle && (
            <ModalRules
              isOpen={modalToggle}
              onClose={() => setModalToggle(false)}
              onSave={(newRule) => {
                  addRule(newRule).then(() => {
                      setModalToggle(false);
                  });
              }}
              sensors={sensors}
              actuators={actuators}
            />
          )}
      </div>
    );
};

export default TableRules;