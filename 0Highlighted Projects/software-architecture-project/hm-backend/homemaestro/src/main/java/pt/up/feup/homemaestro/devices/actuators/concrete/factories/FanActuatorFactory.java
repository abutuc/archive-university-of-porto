package pt.up.feup.homemaestro.devices.actuators.concrete.factories;

import pt.up.feup.homemaestro.commands.concrete.fanactuator.FanActuatorDecreaseIntensityCommand;
import pt.up.feup.homemaestro.commands.concrete.fanactuator.FanActuatorIncreaseIntensityCommand;
import pt.up.feup.homemaestro.commands.concrete.fanactuator.FanActuatorSwitchOffCommand;
import pt.up.feup.homemaestro.commands.concrete.fanactuator.FanActuatorSwitchOnCommand;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.devices.actuators.ActuatorFactory;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.FanActuator;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.repository.Inventory;

public class FanActuatorFactory extends ActuatorFactory {

    @Override
    public Actuator createDevice(Protocol<?> protocol) {
        FanActuator fanActuator = new FanActuator(protocol);
        Inventory.getCommandRepository().add(fanActuator.getClass().getSimpleName() + "INCREASEINTENSITYCOMMAND", new FanActuatorIncreaseIntensityCommand(fanActuator));
        Inventory.getCommandRepository().add(fanActuator.getClass().getSimpleName() + "DECREASEINTENSITYCOMMAND", new FanActuatorDecreaseIntensityCommand(fanActuator));
        Inventory.getCommandRepository().add(fanActuator.getClass().getSimpleName() + "SWITCHONCOMMAND", new FanActuatorSwitchOnCommand(fanActuator));
        Inventory.getCommandRepository().add(fanActuator.getClass().getSimpleName() + "SWITCHOFFCOMMAND", new FanActuatorSwitchOffCommand(fanActuator));
        return fanActuator;
    }
}
