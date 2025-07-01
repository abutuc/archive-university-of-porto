package pt.up.feup.homemaestro.commands.concrete.fanactuator;

import pt.up.feup.homemaestro.commands.Command;
import pt.up.feup.homemaestro.devices.Device;
import pt.up.feup.homemaestro.devices.actuators.concrete.products.FanActuator;

public class FanActuatorDecreaseIntensityCommand implements Command {
    private FanActuator fanActuator;

    public FanActuatorDecreaseIntensityCommand(FanActuator fanActuator) {
        this.fanActuator = fanActuator;
    }

    @Override
    public void setReceiver(Device receiver) {
        if (receiver instanceof FanActuator castedfanActuator) {
            this.fanActuator = castedfanActuator;
        } else {
            throw new ClassCastException("Provided Device is not of type FanActuator");
        }
    }


    @Override
    public void execute() {
        fanActuator.decreaseIntensity();
    }

}
