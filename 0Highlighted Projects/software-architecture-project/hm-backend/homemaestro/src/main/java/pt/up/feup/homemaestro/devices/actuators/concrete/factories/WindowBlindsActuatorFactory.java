package pt.up.feup.homemaestro.devices.actuators.concrete.factories;

import pt.up.feup.homemaestro.commands.concrete.windowblindsactuator.WindowBlindsActuatorBringDownCommand;
import pt.up.feup.homemaestro.commands.concrete.windowblindsactuator.WindowBlindsActuatorBringUpCommand;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.actuators.ActuatorFactory;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.WindowBlindsActuator;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.repository.Inventory;

public class WindowBlindsActuatorFactory extends ActuatorFactory {

    @Override
    public Actuator createDevice(Protocol<?> protocol) {
        WindowBlindsActuator windowBlindsActuator = new WindowBlindsActuator(protocol);
        Inventory.getCommandRepository().add(windowBlindsActuator.getClass().getSimpleName() + "BRINGUPCOMMAND", new WindowBlindsActuatorBringUpCommand(windowBlindsActuator));
        Inventory.getCommandRepository().add(windowBlindsActuator.getClass().getSimpleName() + "BRINGDOWNCOMMAND", new WindowBlindsActuatorBringDownCommand(windowBlindsActuator));
        return windowBlindsActuator;
    }
}
