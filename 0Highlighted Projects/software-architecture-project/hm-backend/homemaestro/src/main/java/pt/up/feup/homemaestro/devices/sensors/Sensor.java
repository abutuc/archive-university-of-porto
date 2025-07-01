package pt.up.feup.homemaestro.devices.sensors;

import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.enums.DeviceType;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.pubsub.PubSub;
import pt.up.feup.homemaestro.repository.Inventory;
import pt.up.feup.homemaestro.utils.RoutingUtils;


public abstract class Sensor extends Device {
    private Double measurementValue;
    private String pubEventQueue;

    public Sensor(Protocol<?> protocol) {
        super(protocol);
        Inventory.getSensorRepository().add(this);
        this.measurementValue = 0.0;
    }

    public Double getMeasurementValue() {
        return measurementValue;
    }

    public void setMeasurementValue(Double measurementValue) {
        this.measurementValue = measurementValue;

        if (isOn() && pubEventQueue != null) {
            Object message = getProtocol().sendMessageAsSensor(this);
            PubSub.getInstance().publish(pubEventQueue, message);
        }
    }

    @Override
    protected void connect() {
        this.pubEventQueue = RoutingUtils.getEventQueue(DeviceType.Sensor, getProtocol().getClass());

        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL CONNECTION:\u001B[0m " + getName() + " -> " + this.pubEventQueue);
    }

    @Override
    protected void disconnect() {
        NotifierSingleton.getInstance().notify("\u001B[37mCHANNEL DISCONNECTION:\u001B[0m " + getName() + " -> " + this.pubEventQueue);

        this.pubEventQueue = null;
    }

}
