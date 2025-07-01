package pt.up.feup.homemaestro.devices.actuators.concrete.products;

import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.devices.actuators.Actuator;
import pt.up.feup.homemaestro.protocols.Protocol;
import pt.up.feup.homemaestro.simulation.SimulationActuatorController;

public class WindowBlindsActuator extends Actuator {
    private boolean areWindowBlindsDown;

    public WindowBlindsActuator(Protocol<?> protocol) {
        super(protocol);
        this.areWindowBlindsDown = false;

        SimulationActuatorController.createActuator("window-blinds", getId());
    }

    public boolean areWindowBlindsDown() {
        return areWindowBlindsDown;
    }

    public void blindsGoDown() {
        this.areWindowBlindsDown = true;

        SimulationActuatorController.goDownActuator("window-blinds", getId());

        confirmCommandExecution("Go Down");

        NotifierSingleton.getInstance().notify("\u001B[36mACTION:\u001B[0m Blinds going down! | " + this.getName());
    }

    public void blindsGoUp() {
        this.areWindowBlindsDown = false;

        SimulationActuatorController.goUpActuator("window-blinds", getId());

        confirmCommandExecution("Go Up");

        NotifierSingleton.getInstance().notify("\u001B[36mACTION:\u001B[0m Blinds going up! | " + this.getName());
    }

}
