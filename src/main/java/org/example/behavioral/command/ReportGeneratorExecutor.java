package org.example.behavioral.command;

public class ReportGeneratorExecutor {
    public void executeOperation(ReportOperation operation) {
        operation.execute();
    }
}