package pt.up.feup.homemaestro.interpreter.expression;

import pt.up.feup.homemaestro.interpreter.Context;

public class StateCheckExpression implements Expression {
    private final String sensorName;
    private final String expectedState;

    public StateCheckExpression(String sensorName, String expectedState) {
        this.sensorName = sensorName;
        this.expectedState = expectedState;
    }

    @Override
    public boolean interpret(Context context) {
        String currentState = context.getSensorState(sensorName); // Get the current state of the sensor
        return expectedState.equalsIgnoreCase(currentState);      // Check if it matches the expected state
    }
}
