package org.example.structural.decorator;

public class ParkingAssistant extends CarDecorator {
    public ParkingAssistant(Machine machine) {
        super(machine);
    }

    @Override
    public String doOperation() {
        return machine.doOperation() + parkingAssistant();
    }

    public String parkingAssistant() {
        return " + parking";
    }
}
