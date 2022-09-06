package org.example.behavioral.template;

public class QuantumComputer extends AbstractComputer{

    @Override
    public void mountProcessor() {
        System.out.println("QuantumComputer.mountProcessor");
    }

    @Override
    public void mountProcessorCooling() {
        System.out.println("QuantumComputer.mountProcessorCooling");
    }
}
