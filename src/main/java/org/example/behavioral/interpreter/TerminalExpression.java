package org.example.behavioral.interpreter;

public class TerminalExpression extends AbstractExpression {
    private final String data;

    public TerminalExpression(String context) {
        this.data = context;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
