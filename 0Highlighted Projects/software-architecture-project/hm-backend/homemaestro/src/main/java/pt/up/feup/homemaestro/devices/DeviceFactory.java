package pt.up.feup.homemaestro.devices;

import pt.up.feup.homemaestro.protocols.Protocol;

public abstract class DeviceFactory {
    public abstract Device createDevice(Protocol<?> protocol);
}
