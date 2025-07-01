package pt.up.feup.homemaestro.interpreter.expression;

import pt.up.feup.homemaestro.interpreter.Context;

public class ConditionalExpression implements Expression {
    private final Expression condition;
    private final Expression action;

    public ConditionalExpression(Expression condition, Expression action) {
        this.condition = condition;
        this.action = action;
    }

    @Override
    public boolean interpret(Context context) {
        if (condition.interpret(context)) {
            action.interpret(context);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ConditionalExpression{" +
                "condition=" + condition +
                ", action=" + action +
                '}';
    }
}

