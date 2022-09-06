package org.example.behavioral.visitor;

public class CarBody implements VehiclePart {
    @Override
    public void accept(VehiclePartVisitor visitor) {
        visitor.visit(this);
    }
}
