package pt.up.feup.homemaestro.devices;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pt.up.feup.homemaestro.communication.Notifier;
import pt.up.feup.homemaestro.communication.decorator.MessagingDecorator;
import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.protocols.Protocol;

public abstract class Device {
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private final Protocol<?> protocol;
    private boolean isOn;


    public Device(Protocol<?> protocol) {
        this.id = idCounter++;
        this.isOn = false;
        this.protocol = protocol;
        this.name = this.getClass().getSimpleName() + "-" + id;

        NotifierSingleton.getInstance().notify("\u001B[32mNEW " + getClass().getSimpleName().toUpperCase() + ":\u001B[0m " + this.getName());
    }

    public final void activate() {
        turnOn();
        connect();
    }

    public final void deactivate() {
        disconnect();
        turnOff();
    }

    public int getId() {
        return id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public Protocol<?> getProtocol() {
        return protocol;
    }

    public String getName() {
        return this.name;
    }

    protected abstract void connect();

    protected abstract void disconnect();

    private void turnOn() {
        setIsOn(true);
        NotifierSingleton.getInstance().notify("\u001B[34mACTIVATED:\u001B[0m " + getName());
    }

    private void turnOff() {
        setIsOn(false);
        NotifierSingleton.getInstance().notify("\u001B[31mDEACTIVATED:\u001B[0m " + getName());
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", protocol=" + protocol +
                ", isOn=" + isOn +
                '}';
    }
}
