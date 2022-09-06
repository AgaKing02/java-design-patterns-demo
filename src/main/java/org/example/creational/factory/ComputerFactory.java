package org.example.creational.factory;

public class ComputerFactory extends AbstractFactory{
    public Computer getComputer(String name) {
        return switch (name) {
            case "Laptop" -> new Laptop();
            case "Phone" -> new Phone();
            case "TV" -> new SmartTV();
            default -> null;
        };
    }
}
