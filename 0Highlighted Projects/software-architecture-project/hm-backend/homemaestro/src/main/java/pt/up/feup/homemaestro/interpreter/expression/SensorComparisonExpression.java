package pt.up.feup.homemaestro.interpreter.expression;

import pt.up.feup.homemaestro.interpreter.Context;

public class SensorComparisonExpression implements Expression {
    private final String sensorName;
    private final String operator; // e.g., "<", ">", "=="
    private final double value;

    public SensorComparisonExpression(String sensorName, String operator, double value) {
        this.sensorName = sensorName;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        double sensorValue = context.getSensorValue(sensorName); // Get sensor's current value

        // Compare the sensor value based on the operator
        return switch (operator) {
            case "<" -> sensorValue < value;
            case ">" -> sensorValue > value;
            case "==" -> sensorValue == value;
            case "<=" -> sensorValue <= value;
            case ">=" -> sensorValue >= value;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
