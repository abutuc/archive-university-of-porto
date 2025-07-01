package pt.up.feup.homemaestro.devices.hybrid;

import pt.up.feup.homemaestro.protocols.Protocol;

public abstract class HybridDeviceFactory {
    public abstract HybridDevice createHybridDevice(Protocol<?> protocol);
}
