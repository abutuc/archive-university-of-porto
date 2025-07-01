package pt.up.feup.homemaestro.interpreter.expression;

import pt.up.feup.homemaestro.interpreter.Context;

public interface Expression {
    boolean interpret(Context context);
}

