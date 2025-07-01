package pt.up.feup.homemaestro;

import org.springframework.http.ResponseEntity;
import pt.up.feup.homemaestro.controllers.ActuatorController;
import pt.up.feup.homemaestro.controllers.HubController;
import pt.up.feup.homemaestro.controllers.RuleController;
import pt.up.feup.homemaestro.controllers.SensorController;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.hubs.Hub;
import pt.up.feup.homemaestro.devices.sensors.Sensor;

public class Simulation {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // NotifierSingleton.setInstance(new SlackDecorator(NotifierSingleton.getInstance()));
        // NotifierSingleton.setInstance(new DiscordDecorator(NotifierSingleton.getInstance()));

        HubController hubController = new HubController();
        SensorController sensorController = new SensorController();
        ActuatorController actuatorController = new ActuatorController();
        RuleController ruleController = new RuleController();

        ResponseEntity<Device> response = hubController.createHub("ZigBee");
        Hub hub = (Hub) response.getBody();

        // create and add sensors and actuators
        response = sensorController.createSensor("Light", "Internal");
        Sensor lightSensor = (Sensor) response.getBody();

        response = sensorController.createSensor("Temperature", "ZigBee");
        Sensor temperatureSensor = (Sensor) response.getBody();

        response = actuatorController.createActuator("Fan", "Internal");
        Actuator fanActuator = (Actuator) response.getBody();

        response = actuatorController.createActuator("WindowBlinds", "ZigBee");
        Actuator windowBlindsActuator = (Actuator) response.getBody();
        assert hub != null;
        assert lightSensor != null;
        assert temperatureSensor != null;
        assert fanActuator != null;
        assert windowBlindsActuator != null;

        hubController.connectHub(hub.getId());

        ruleController.addRule("if (" + temperatureSensor.getName() + " >= 20.0) then " + fanActuator.getName() + " SWITCHOFF");
        ruleController.addRule("if (" + temperatureSensor.getName() + " < 20.0) then " + fanActuator.getName() + " SWITCHON");
        ruleController.addRule("if (" + lightSensor.getName() + " >= 99.0) then " + windowBlindsActuator.getName() + " BRINGDOWN");
        ruleController.addRule("if (" + lightSensor.getName() + " < 99.0) then " + windowBlindsActuator.getName() + " BRINGUP");

        // Test with complex rules
        // ruleController.addRule("if (" + temperatureSensor.getName() + " < 20.0 AND " + lightSensor.getName() + " > 99.0) then " + fanActuator.getName() + " INCREASEINTENSITY AND " + windowBlindsActuator.getName() + " BRINGDOWN");

        // Activate sensors and actuators
        actuatorController.connectActuator(fanActuator.getId());
        actuatorController.connectActuator(windowBlindsActuator.getId());
        sensorController.connectSensor(lightSensor.getId());
        sensorController.connectSensor(temperatureSensor.getId());

    }
}