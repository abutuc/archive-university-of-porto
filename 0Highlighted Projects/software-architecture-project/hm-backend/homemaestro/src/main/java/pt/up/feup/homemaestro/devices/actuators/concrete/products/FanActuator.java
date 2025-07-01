package pt.up.feup.homemaestro.devices.actuators.concrete.products;

import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.simulation.SimulationActuatorController;

public class FanActuator extends Actuator {
    private boolean isFanSwitchOn;
    private int intensity;

    public FanActuator(Protocol<?> protocol) {
        super(protocol);
        this.isFanSwitchOn = false;
        this.intensity = 0;

        SimulationActuatorController.createActuator("fan", getId());

    }

    public void increaseIntensity() {
        intensity++;

        SimulationActuatorController.increaseFanActuatorIntensity(getId());

        confirmCommandExecution("Increase Intensity");

        NotifierSingleton.getInstance().notify("\u001B[36mACTION:\u001B[0m Fan increasing intensity! | " + this.getName());
    }

    public void decreaseIntensity() {
        if (intensity > 0) {
            intensity--;
        }

        SimulationActuatorController.decreaseFanActuatorIntensity(getId());

        confirmCommandExecution("Decrease Intensity");

        NotifierSingleton.getInstance().notify("\u001B[36mACTION:\u001B[0m Fan decreasing intensity! | " + this.getName());
    }

    public void switchOnFan() {
        this.isFanSwitchOn = true;

        SimulationActuatorController.turnOnActuator("fan", getId());

        confirmCommandExecution("Switch On");

        NotifierSingleton.getInstance().notify("\u001B[36mACTION:\u001B[0m Fan switched on! | " + this.getName());
    }

    public void switchOffFan() {
        this.isFanSwitchOn = false;

        SimulationActuatorController.turnOffActuator("fan", getId());

        confirmCommandExecution("Switch Off");

        NotifierSingleton.getInstance().notify("\u001B[36mACTION:\u001B[0m Fan switched off! | " + this.getName());
    }

    public boolean isFanSwitchOn() {
        return isFanSwitchOn;
    }

    public void setFanSwitchOn(boolean fanSwitchOn) {
        isFanSwitchOn = fanSwitchOn;
    }

}
