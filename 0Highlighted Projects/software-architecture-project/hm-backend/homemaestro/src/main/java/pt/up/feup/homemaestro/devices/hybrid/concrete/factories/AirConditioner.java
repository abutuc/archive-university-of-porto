package pt.up.feup.homemaestro.devices.hybrid.concrete.factories;

import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.actuators.concrete.factories.FanActuatorFactory;
import pt.up.feup.homemaestro.devices.hybrid.HybridDevice;
import pt.up.feup.homemaestro.devices.hybrid.HybridDeviceFactory;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.devices.sensors.concrete.factories.TemperatureSensorFactory;
import pt.up.feup.homemaestro.protocols.Protocol;

import java.util.Map;

public class AirConditioner extends HybridDeviceFactory {

    @Override
    public HybridDevice createHybridDevice(Protocol<?> protocol) {
        Sensor temperatureSensor = new TemperatureSensorFactory().createDevice(protocol);
        Actuator actuator = new FanActuatorFactory().createDevice(protocol);
        return new HybridDevice(Map.of(temperatureSensor.getId(), temperatureSensor), Map.of(actuator.getId(), actuator), this.getClass().getSimpleName());
    }
}
