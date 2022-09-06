package org.example.creational.factory;

public class PortableComputerFactory extends AbstractFactory{
    @Override
    public Computer getComputer(String name) {
        return switch (name) {
            case "Laptop" -> new Laptop();
            case "Phone" -> new Phone();
            default -> null;
        };
    }
}
