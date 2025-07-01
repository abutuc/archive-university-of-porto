package pt.up.feup.homemaestro.interpreter;

import pt.up.feup.homemaestro.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private static Context instance;
    private final Map<String, Double> sensorValues = new HashMap<>(); // Sensor values
    private final Map<String, String> sensorStates = new HashMap<>(); // Sensor states
    private final Map<String, String> actuatorStates = new HashMap<>(); // Actuator states
    private final Map<String, Command> actuatorLastCommand = new HashMap<>(); // Last command sent to an actuator

    // Private constructor to prevent instantiation
    private Context() {
    }

    // Public method to provide access to the instance
    public static synchronized Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }

    // Set or update a sensor value
    public void setSensorValue(String sensorName, double value) {
        sensorValues.put(sensorName, value);
    }

    // Get the current value of a sensor
    public double getSensorValue(String sensorName) {
        return sensorValues.getOrDefault(sensorName, 0.0);
    }

    // Set or update a sensor state
    public void setSensorState(String sensorName, String state) {
        sensorStates.put(sensorName, state);
    }

    // Get the current state of a sensor
    public String getSensorState(String sensorName) {
        return sensorStates.getOrDefault(sensorName, "off");
    }

    // Set or update an actuator state
    public void setActuatorState(String actuatorName, String state) {
        actuatorStates.put(actuatorName, state);
    }

    // Get the current state of an actuator
    public String getActuatorState(String actuatorName) {
        return actuatorStates.getOrDefault(actuatorName, "off");
    }

    // Set or update the last command sent to an actuator
    public void setActuatorLastCommand(String actuatorName, Command command) {
        actuatorLastCommand.put(actuatorName, command);
    }

    // Get the last command sent to an actuator
    public Command getActuatorLastCommand(String actuatorName) {
        return actuatorLastCommand.get(actuatorName);
    }

    public Map<String, Double> getSensorValues() {
        return sensorValues;
    }

    public Map<String, String> getSensorStates() {
        return sensorStates;
    }

    public Map<String, String> getActuatorStates() {
        return actuatorStates;
    }

    public Map<String, Command> getActuatorLastCommand() {
        return actuatorLastCommand;
    }
}
