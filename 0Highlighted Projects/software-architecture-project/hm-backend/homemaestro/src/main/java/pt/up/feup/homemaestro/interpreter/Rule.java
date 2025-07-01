package pt.up.feup.homemaestro.interpreter;

import pt.up.feup.homemaestro.communication.singleton.NotifierSingleton;
import pt.up.feup.homemaestro.interpreter.expression.Expression;

import java.util.List;

public class Rule {
    private String id;
    private String ruleString;
    private List<String> tokens;
    private Expression expression;
    private List<Action> actions;

    public Rule(String id, List<String> tokens, Expression expression, List<Action> actions, String ruleString) {
        this.id = id;
        this.tokens = tokens;
        this.expression = expression;
        this.actions = actions;
        this.ruleString = ruleString;
        NotifierSingleton.getInstance().notify("\u001B[32mNEW RULE:\u001B[0m " + ruleString);
    }

    public Rule() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public String getRuleString() {
        return ruleString;
    }

    public void setRuleString(String ruleString) {
        this.ruleString = ruleString;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id='" + id + '\'' +
                ", ruleString='" + ruleString + '\'' +
                ", tokens=" + tokens +
                ", expression=" + expression.toString() +
                ", actions=" + actions +
                '}';
    }
}
