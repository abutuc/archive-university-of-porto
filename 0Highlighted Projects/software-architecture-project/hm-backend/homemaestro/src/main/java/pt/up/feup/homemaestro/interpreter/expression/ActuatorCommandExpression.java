package pt.up.feup.homemaestro.interpreter.expression;

import pt.up.feup.homemaestro.commands.Command;
import pt.up.feup.homemaestro.interpreter.Context;
import pt.up.feup.homemaestro.repository.Inventory;

public class ActuatorCommandExpression implements Expression {
    private final String actuatorName;
    private final String action; // e.g., "on", "off", "close", "open"

    public ActuatorCommandExpression(String actuatorName, String action) {
        this.actuatorName = actuatorName;
        this.action = action;
    }

    @Override
    public boolean interpret(Context context) {
        // Directly set the actuator's state
        Command command = Inventory.getCommandRepository().get(actuatorName, action);

        // see if the command is valid
        return command != null;
    }

    @Override
    public String toString() {
        return "ActuatorCommandExpression{" +
                "actuatorName='" + actuatorName + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
