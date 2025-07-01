package pt.up.feup.homemaestro.protocols;

import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.protocols.messages.internalprotocol.InternalProtocolHeader;
import pt.up.feup.homemaestro.protocols.messages.internalprotocol.InternalProtocolMessage;
import pt.up.feup.homemaestro.protocols.messages.internalprotocol.InternalProtocolMessageType;

import java.util.Map;

public class InternalProtocol implements Protocol<InternalProtocolMessage> {

    @Override
    public InternalProtocolMessage sendMessageAsSensor(Sensor sensor) {
        InternalProtocolHeader header = new InternalProtocolHeader(InternalProtocolMessageType.MEASUREMENT, sensor.getId(), null, sensor.getProtocol().getClass().getSimpleName());
        Map<String, String> body = Map.of(header.type().toString(), sensor.getMeasurementValue().toString());
        return new InternalProtocolMessage(header, body);
    }

    @Override
    public InternalProtocolMessage sendMessageAsActuator(Actuator actuator, String command) {
        InternalProtocolHeader header = new InternalProtocolHeader(InternalProtocolMessageType.COMMAND, actuator.getId(), null, actuator.getProtocol().getClass().getSimpleName());
        Map<String, String> body = Map.of(header.type().toString(), String.format("Executed %s successfully.", command));
        return new InternalProtocolMessage(header, body);
    }

}
