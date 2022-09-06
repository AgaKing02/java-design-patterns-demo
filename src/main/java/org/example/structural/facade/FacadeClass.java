package org.example.structural.facade;

public class FacadeClass {
    private Robot robot;
    private Computer computer;

    public FacadeClass() {
        robot = new Robot();
        computer = new Computer();
    }

    public void performRobotTask(){
        robot.performTask();
    }
    public void performComputerTask(){
        computer.performTask();
    }

}
