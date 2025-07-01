package pt.up.feup.homemaestro.devices.hubs;

import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.enums.DeviceType;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.pubsub.PubSub;
import pt.up.feup.homemaestro.pubsub.Subscriber;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.utils.RoutingUtils;

public abstract class Hub extends Device implements Subscriber {

    private String sensorEventQueue;
    private String actuatorEventQueue;

    public Hub(Protocol<?> protocol) {
        super(protocol);
        Inventory.getHubRepository().add(this);
    }

    @Override
    protected void connect() {
        sensorEventQueue = RoutingUtils.getEventQueue(DeviceType.Sensor, getProtocol().getClass());
        PubSub.getInstance().subscribe(sensorEventQueue, this);

        actuatorEventQueue = RoutingUtils.getEventQueue(DeviceType.Actuator, getProtocol().getClass());
        PubSub.getInstance().subscribe(actuatorEventQueue, this);


        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL CONNECTION:\u001B[0m " + getName() + " -> " + sensorEventQueue);
        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL CONNECTION:\u001B[0m " + getName() + " -> " + actuatorEventQueue);
    }

    @Override
    protected void disconnect() {
        PubSub.getInstance().unsubscribe(sensorEventQueue, this);
        PubSub.getInstance().unsubscribe(actuatorEventQueue, this);

        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL DISCONNECTION:\u001B[0m " + getName() + " -> " + sensorEventQueue);
        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL DISCONNECTION:\u001B[0m " + getName() + " -> " + actuatorEventQueue);
    }

    @Override
    public void update(String eventQueue, Object message) {
        Object translatedMessage;
        if (eventQueue.equals(sensorEventQueue)) {
            translatedMessage = translateMessageToSensorSystemProtocol(message);
            PubSub.getInstance().publish(RoutingUtils.getEventQueue(DeviceType.Sensor, RoutingUtils.getSystemProtocol().getClass()), translatedMessage);
        } else if (eventQueue.equals(actuatorEventQueue)) {
            translatedMessage = translateMessageToActuatorSystemProtocol(message);
            PubSub.getInstance().publish(RoutingUtils.getEventQueue(DeviceType.Actuator, RoutingUtils.getSystemProtocol().getClass()), translatedMessage);
        }
    }

    protected abstract Object translateMessageToSensorSystemProtocol(Object message);

    protected abstract Object translateMessageToActuatorSystemProtocol(Object message);

}
