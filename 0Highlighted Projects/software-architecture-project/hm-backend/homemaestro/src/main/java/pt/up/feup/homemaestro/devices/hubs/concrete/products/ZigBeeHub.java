package pt.up.feup.homemaestro.devices.hubs.concrete.products;

import pt.up.feup.homemaestro.devices.hubs.Hub;
import pt.up.feup.homemaestro.protocols.InternalProtocol;
import pt.up.feup.homemaestro.protocols.messages.internalprotocol.InternalProtocolHeader;
import pt.up.feup.homemaestro.protocols.messages.internalprotocol.InternalProtocolMessage;
import pt.up.feup.homemaestro.protocols.messages.internalprotocol.InternalProtocolMessageType;
import pt.up.feup.homemaestro.protocols.messages.zigbeeprotocol.ZigBeeProtocolMessage;
import pt.up.feup.homemaestro.protocols.zigbee.ZigBeeProtocol;
import pt.up.feup.homemaestro.simulation.SimulationHubController;
import pt.up.feup.homemaestro.utils.RoutingUtils;

import java.util.Map;

public class ZigBeeHub extends Hub {

    public ZigBeeHub() {
        super(new ZigBeeProtocol());
        SimulationHubController.createHub("zigbee", getId());
    }

    @Override
    protected Object translateMessageToSensorSystemProtocol(Object message) {
        if (message instanceof ZigBeeProtocolMessage zigBeeMessage && RoutingUtils.getSystemProtocol().getClass().equals(InternalProtocol.class)) {
            InternalProtocolHeader header = new InternalProtocolHeader(InternalProtocolMessageType.MEASUREMENT, zigBeeMessage.from(), zigBeeMessage.target(), InternalProtocol.class.getSimpleName());
            Map<String, String> body = Map.of(header.type().toString(), zigBeeMessage.content());
            return new InternalProtocolMessage(header, body);
        }
        return null;
    }

    @Override
    protected Object translateMessageToActuatorSystemProtocol(Object message) {
        if (message instanceof ZigBeeProtocolMessage zigBeeMessage && RoutingUtils.getSystemProtocol().getClass().equals(InternalProtocol.class)) {
            InternalProtocolHeader header = new InternalProtocolHeader(InternalProtocolMessageType.COMMAND, zigBeeMessage.from(), zigBeeMessage.target(), InternalProtocol.class.getSimpleName());
            Map<String, String> body = Map.of(header.type().toString(), zigBeeMessage.content());
            return new InternalProtocolMessage(header, body);
        }
        return null;
    }


}
