package org.example.behavioral.command;

public class Report {
    private String name;

    public void generate() {
        System.out.println("report is being generated:");
        System.out.println("__________________________");
        System.out.println("report is generated;");
    }
}
