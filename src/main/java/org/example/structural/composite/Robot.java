package org.example.structural.composite;

public class Robot implements Worker{
    private int id;
    private String name;

    public Robot(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void performTask() {
        System.out.println("Robot.performTask");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
