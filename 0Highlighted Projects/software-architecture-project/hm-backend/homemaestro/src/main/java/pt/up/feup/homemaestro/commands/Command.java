package pt.up.feup.homemaestro.commands;

import pt.up.feup.homemaestro.devices.Device;

public interface Command {
    void execute();

    void setReceiver(Device receiver);
}
