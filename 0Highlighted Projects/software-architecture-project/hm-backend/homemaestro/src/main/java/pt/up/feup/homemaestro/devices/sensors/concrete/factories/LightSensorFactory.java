package pt.up.feup.homemaestro.devices.sensors.concrete.factories;

import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.devices.sensors.SensorFactory;
import pt.up.feup.homemaestro.devices.sensors.concrete.products.LightSensor;
import pt.up.feup.homemaestro.protocols.Protocol;

public class LightSensorFactory extends SensorFactory {

    @Override
    public Sensor createDevice(Protocol<?> protocol) {
        return new LightSensor(protocol);
    }
}
