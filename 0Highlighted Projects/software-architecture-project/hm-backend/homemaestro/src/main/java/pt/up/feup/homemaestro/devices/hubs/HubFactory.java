package pt.up.feup.homemaestro.devices.hubs;

import pt.up.feup.homemaestro.devices.DeviceFactory;
import pt.up.feup.homemaestro.protocols.Protocol;

public abstract class HubFactory extends DeviceFactory {

    @Override
    public abstract Hub createDevice(Protocol<?> protocol);

}
