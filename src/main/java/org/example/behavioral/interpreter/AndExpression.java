package org.example.behavioral.interpreter;

public class AndExpression extends AbstractExpression {
    AbstractExpression expression1;
    AbstractExpression expression2;

    public AndExpression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
