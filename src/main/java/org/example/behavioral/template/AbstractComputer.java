package org.example.behavioral.template;

public abstract class AbstractComputer {
    public void mountMotherboard() {
        System.out.println("AbstractComputer.mountMotherboard");
    }

    public void mountProcessor() {
        System.out.println("AbstractComputer.mountProcessor");
    }

    public void mountProcessorCooling() {
        System.out.println("AbstractComputer.mountProcessorCooling");
    }

    public void mountGPU() {
        System.out.println("AbstractComputer.mountGPU");
    }

    public void mountMemory() {
        System.out.println("AbstractComputer.mountMemory");
    }

    public void buildComputer() {
        mountMotherboard();
        mountProcessor();
        mountProcessorCooling();
        mountGPU();
        mountMemory();
    }

}
