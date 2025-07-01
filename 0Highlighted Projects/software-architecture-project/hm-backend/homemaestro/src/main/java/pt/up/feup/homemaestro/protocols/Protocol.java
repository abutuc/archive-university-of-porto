package pt.up.feup.homemaestro.protocols;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.sensors.Sensor;

@JsonSerialize(using = ProtocolSerializer.class)
public interface Protocol<T> {
    T sendMessageAsSensor(Sensor sensor);

    T sendMessageAsActuator(Actuator actuator, String command);
}
