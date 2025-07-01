package pt.up.feup.homemaestro.interpreter;

import pt.up.feup.homemaestro.commands.Command;
import pt.up.feup.homemaestro.interpreter.expression.*;
import pt.up.feup.homemaestro.repository.Inventory;

import java.util.ArrayList;
import java.util.List;


public class Parser {
    private final List<String> tokens;
    private final List<Action> actions;
    private int currentPosition;

    public Parser(List<String> tokens) {
        this.tokens = tokens;
        this.currentPosition = 0;
        this.actions = new ArrayList<>();
    }

    public Expression parse() {
        Expression condition = parseCondition();
        if (match("then")) {
            Expression action = parseAction();
            return new ConditionalExpression(condition, action);
        }
        return new NullExpression();
    }

    private Expression parseCondition() {
        if (!match("if")) return new NullExpression();
        return parseLogicalExpression();
    }

    private Expression parseAction() {
        return parseActuatorCommands();
    }

    private Expression parseLogicalExpression() {
        Expression expression = parseComparison();

        while (currentPosition < tokens.size()) {
            if (match("or")) {
                expression = new OrExpression(expression, parseComparison());
            } else if (match("and")) {
                expression = new AndExpression(expression, parseComparison());
            } else {
                break;
            }
        }
        return expression;
    }

    private Expression parseComparison() {
        if (match("(")) {
            Expression innerExpression = parseLogicalExpression();
            match(")"); // Ensure closing parenthesis
            return innerExpression;
        }

        String deviceName = tokens.get(currentPosition++);

        // Check if the comparison is a value comparison or a state check
        if (currentPosition < tokens.size() && tokens.get(currentPosition).equalsIgnoreCase("is")) {
            currentPosition++; // Consume "is"
            String state = tokens.get(currentPosition++);
            return new StateCheckExpression(deviceName, state);
        } else {
            String operator = tokens.get(currentPosition++);
            double value = Double.parseDouble(tokens.get(currentPosition++));
            return new SensorComparisonExpression(deviceName, operator, value);
        }
    }

    private Expression parseActuatorCommands() {
        Expression expression = parseActuatorCommand();

        while (currentPosition < tokens.size()) {
            if (match("and")) {
                expression = new AndExpression(expression, parseActuatorCommand());
            } else {
                break;
            }
        }
        return expression;
    }

    private Expression parseActuatorCommand() {
        String actuatorName = tokens.get(currentPosition++);
        String action = tokens.get(currentPosition++);

        Command command = Inventory.getCommandRepository().get(actuatorName, action);

        if (command == null) {
            return new NullExpression();
        }

        Action actuatorAction = new Action(actuatorName, command);

        actions.add(actuatorAction);

        return new ActuatorCommandExpression(actuatorName, action);
    }

    private boolean match(String keyword) {
        if (currentPosition < tokens.size() && tokens.get(currentPosition).equalsIgnoreCase(keyword)) {
            currentPosition++;
            return true;
        }
        return false;
    }

    public List<Action> getActions() {
        return actions;
    }
}

