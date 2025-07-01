package pt.up.feup.homemaestro.commands.concrete.windowblindsactuator;

import pt.up.feup.homemaestro.commands.Command;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.WindowBlindsActuator;

public class WindowBlindsActuatorBringDownCommand implements Command {
    private WindowBlindsActuator windowBlindsActuator;

    public WindowBlindsActuatorBringDownCommand(WindowBlindsActuator windowBlindsActuator) {
        this.windowBlindsActuator = windowBlindsActuator;
    }

    @Override
    public void execute() {
        windowBlindsActuator.blindsGoDown();
    }

    @Override
    public void setReceiver(Device receiver) {
        if (receiver instanceof WindowBlindsActuator castedWindowBlindsActuator) {
            this.windowBlindsActuator = castedWindowBlindsActuator;
        } else {
            throw new ClassCastException("Provided Device is not of type WindowBlindsActuator");
        }
    }
}
