package org.example.behavioral.visitor;

public class Engine implements VehiclePart {
    @Override
    public void accept(VehiclePartVisitor visitor) {
        visitor.visit(this);
    }
}
