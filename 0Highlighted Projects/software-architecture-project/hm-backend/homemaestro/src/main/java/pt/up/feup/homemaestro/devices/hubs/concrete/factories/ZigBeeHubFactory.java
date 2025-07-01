package pt.up.feup.homemaestro.devices.hubs.concrete.factories;

import pt.up.feup.homemaestro.devices.hubs.Hub;
import pt.up.feup.homemaestro.devices.hubs.HubFactory;
import pt.up.feup.homemaestro.devices.hubs.concrete.products.ZigBeeHub;
import pt.up.feup.homemaestro.protocols.Protocol;

public class ZigBeeHubFactory extends HubFactory {
    @Override
    public Hub createDevice(Protocol<?> protocol) {
        return new ZigBeeHub();
    }
}
