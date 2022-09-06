package org.example.structural.composite;

public class Human implements Worker{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void performTask() {
        System.out.println("Human.performTask");
    }
}
