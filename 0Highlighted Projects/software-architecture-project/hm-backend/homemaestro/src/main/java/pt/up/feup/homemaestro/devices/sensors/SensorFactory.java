package pt.up.feup.homemaestro.devices.sensors;

import pt.up.feup.homemaestro.devices.DeviceFactory;
import pt.up.feup.homemaestro.protocols.Protocol;


public abstract class SensorFactory extends DeviceFactory {
    @Override
    public abstract Sensor createDevice(Protocol<?> protocol);
}
