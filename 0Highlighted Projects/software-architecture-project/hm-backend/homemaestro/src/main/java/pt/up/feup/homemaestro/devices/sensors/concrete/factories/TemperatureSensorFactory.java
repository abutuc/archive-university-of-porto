package pt.up.feup.homemaestro.devices.sensors.concrete.factories;

import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.devices.sensors.SensorFactory;
import pt.up.feup.homemaestro.devices.sensors.concrete.products.TemperatureSensor;
import pt.up.feup.homemaestro.protocols.Protocol;

public class TemperatureSensorFactory extends SensorFactory {

    @Override
    public Sensor createDevice(Protocol<?> protocol) {
        return new TemperatureSensor(protocol);
    }
}
