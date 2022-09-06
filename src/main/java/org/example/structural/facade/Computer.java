package org.example.structural.facade;

public class Computer implements Machine{
    @Override
    public void performTask() {
        System.out.println("Computer.performTask");
    }
}
