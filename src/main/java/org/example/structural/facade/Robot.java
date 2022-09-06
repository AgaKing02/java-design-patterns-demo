package org.example.structural.facade;

public class Robot implements Machine{
    @Override
    public void performTask() {
        System.out.println("Robot.performTask");
    }
}
