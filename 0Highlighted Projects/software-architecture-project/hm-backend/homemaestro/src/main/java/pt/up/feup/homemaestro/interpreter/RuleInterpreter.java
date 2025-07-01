package pt.up.feup.homemaestro.interpreter;

import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.FanActuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.WindowBlindsActuator;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.protocols.messages.internalprotocol.InternalProtocolMessage;
import pt.up.feup.homemaestro.repository.Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class RuleInterpreter {
    private static RuleInterpreter ruleInterpreter;
    private final List<Rule> rules = new ArrayList<>();

    private RuleInterpreter() {
    }

    public static RuleInterpreter getRuleInterpreter() {
        if (ruleInterpreter == null) {
            ruleInterpreter = new RuleInterpreter();
        }
        return ruleInterpreter;
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void removeRule(Rule rule) {
        rules.remove(rule);
    }

    public List<Rule> getRules() {
        return new ArrayList<>(rules);
    }

    public Map<String, String> getRuleStrings() {
        Map<String, String> ruleStrings = new HashMap<>();
        for (Rule rule : rules) {
            ruleStrings.put(rule.getId(), rule.getRuleString());
        }
        return ruleStrings;
    }

    public boolean interpretRule(Rule rule) {
        return rule.getExpression().interpret(Context.getInstance());
    }

    public List<Action> evaluateRules(Object rawMessage) {
        // Get who sent the message
        if (rawMessage instanceof InternalProtocolMessage message) {
            List<Action> actionsToBeExecuted = new ArrayList<>();

            // Update the Rule's Context with the current state of the devices
            Context context = Context.getInstance();

            for (Sensor sensor : Inventory.getSensorRepository().getAll()) {
                context.setSensorValue(sensor.getName(), sensor.getMeasurementValue());
                context.setSensorState(sensor.getName(), sensor.isOn() ? "on" : "off");
            }

            for (Actuator actuator : Inventory.getActuatorRepository().getAll()) {
                // Check what is the actuator type and set the state accordingly
                if (actuator instanceof FanActuator) {
                    context.setActuatorState(actuator.getName(), ((FanActuator) actuator).isFanSwitchOn() ? "on" : "off");
                } else if (actuator instanceof WindowBlindsActuator) {
                    context.setActuatorState(actuator.getName(), ((WindowBlindsActuator) actuator).areWindowBlindsDown() ? "down" : "up");
                } else {
                    context.setActuatorState(actuator.getName(), actuator.isOn() ? "on" : "off");
                }
            }

            for (Rule rule : rules) {
                if (interpretRule(rule)) {
                    for (Action action : rule.getActions()) {
                        // Only add if the new action is not equal to the last command sent to the actuator
                        if (context.getActuatorLastCommand(action.actuatorName()) == null || !context.getActuatorLastCommand(action.actuatorName()).equals(action.command())) {
                            actionsToBeExecuted.add(action);
                            // set the last command sent to the actuator
                            context.setActuatorLastCommand(action.actuatorName(), action.command());
                        }
                    }
                }
            }

            return actionsToBeExecuted;
        }
        return new ArrayList<>();
    }
}
