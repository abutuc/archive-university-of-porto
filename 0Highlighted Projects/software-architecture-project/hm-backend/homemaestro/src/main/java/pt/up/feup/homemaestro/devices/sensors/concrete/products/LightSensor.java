package pt.up.feup.homemaestro.devices.sensors.concrete.products;

import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.simulation.SimulationSensorController;

public class LightSensor extends Sensor {

    public LightSensor(Protocol<?> protocol) {
        super(protocol);
        SimulationSensorController.createSensor("light", getId());

    }

}