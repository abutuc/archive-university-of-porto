package pt.up.feup.homemaestro.interpreter.expression;

import pt.up.feup.homemaestro.interpreter.Context;

public class NullExpression implements Expression {
    @Override
    public boolean interpret(Context context) {
        // No operation
        return false;
    }
}
