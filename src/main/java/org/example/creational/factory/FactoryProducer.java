package org.example.creational.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean portable) {
        if (portable) {
            return new PortableComputerFactory();
        }
        return new ComputerFactory();
    }
}
