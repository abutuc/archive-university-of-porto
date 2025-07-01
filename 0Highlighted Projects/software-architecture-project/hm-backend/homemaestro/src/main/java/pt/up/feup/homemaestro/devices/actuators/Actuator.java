package pt.up.feup.homemaestro.devices.actuators;

import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.enums.DeviceType;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.pubsub.PubSub;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.utils.RoutingUtils;

public abstract class Actuator extends Device {
    private String pubEventQueue;

    public Actuator(Protocol<?> protocol) {
        super(protocol);
        Inventory.getActuatorRepository().add(this);
    }

    @Override
    protected void connect() {
        this.pubEventQueue = RoutingUtils.getEventQueue(DeviceType.Actuator, getProtocol().getClass());

        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL CONNECTION:\u001B[0m " + getName() + " -> " + this.pubEventQueue);
    }

    @Override
    protected void disconnect() {
        this.pubEventQueue = null;

        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL DISCONNECTION:\u001B[0m " + getName() + " -> " + this.pubEventQueue);
    }

    protected void confirmCommandExecution(String command) {
        if (isOn() && pubEventQueue != null) {
            Object message = getProtocol().sendMessageAsActuator(this, command);
            PubSub.getInstance().publish(pubEventQueue, message);
        }
    }

}
