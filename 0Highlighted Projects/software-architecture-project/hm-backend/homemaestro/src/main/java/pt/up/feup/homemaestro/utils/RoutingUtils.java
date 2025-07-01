package pt.up.feup.homemaestro.utils;

import pt.up.feup.homemaestro.enums.DeviceType;
import pt.up.feup.homemaestro.protocols.InternalProtocol;
import pt.up.feup.homemaestro.protocols.Protocol;

public class RoutingUtils {

    public static String getEventQueue(DeviceType deviceType, Class<?> protocol) {
        return String.format("%s-%s", deviceType.toString(), protocol.getSimpleName());
    }

    public static Protocol<?> getSystemProtocol() {
        return new InternalProtocol();
    }
}
