package pt.up.feup.homemaestro.devices.actuators;

import pt.up.feup.homemaestro.devices.DeviceFactory;
import pt.up.feup.homemaestro.protocols.Protocol;

public abstract class ActuatorFactory extends DeviceFactory {
    @Override
    public abstract Actuator createDevice(Protocol<?> protocol);

}
