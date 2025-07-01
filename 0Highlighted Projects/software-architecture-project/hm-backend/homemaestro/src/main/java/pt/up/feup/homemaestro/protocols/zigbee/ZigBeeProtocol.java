package pt.up.feup.homemaestro.protocols.zigbee;

import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.sensors.Sensor;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.protocols.messages.zigbeeprotocol.ZigBeeProtocolMessage;


public class ZigBeeProtocol implements Protocol<ZigBeeProtocolMessage> {

    @Override
    public ZigBeeProtocolMessage sendMessageAsSensor(Sensor sensor) {
        return new ZigBeeProtocolMessage(sensor.getId(), null, sensor.getMeasurementValue().toString());
    }


    @Override
    public ZigBeeProtocolMessage sendMessageAsActuator(Actuator actuator, String command) {
        return new ZigBeeProtocolMessage(actuator.getId(), null, String.format("Executed %s successfully.", command));
    }

}
