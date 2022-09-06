package org.example.behavioral.visitor;

public class Headlights implements VehiclePart {
    @Override
    public void accept(VehiclePartVisitor visitor) {
        visitor.visit(this);
    }
}
