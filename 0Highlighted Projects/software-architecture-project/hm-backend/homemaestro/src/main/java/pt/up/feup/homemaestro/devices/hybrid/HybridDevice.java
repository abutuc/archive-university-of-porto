package pt.up.feup.homemaestro.devices.hybrid;

import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.repository.Inventory;

import java.util.Map;

public class HybridDevice {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private boolean on;
    private Map<Integer, Sensor> sensors;
    private Map<Integer, Actuator> actuators;

    public HybridDevice(Map<Integer, Sensor> sensors, Map<Integer, Actuator> actuators, String name) {
        this.sensors = sensors;
        this.actuators = actuators;
        this.id = idCounter++;
        this.name = name + "-" + id;
        this.on = false;
        Inventory.getHybridDeviceRepository().add(this);
    }

    public Map<Integer, Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(Map<Integer, Sensor> sensors) {
        this.sensors = sensors;
    }

    public Map<Integer, Actuator> getActuators() {
        return actuators;
    }

    public void setActuators(Map<Integer, Actuator> actuators) {
        this.actuators = actuators;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
