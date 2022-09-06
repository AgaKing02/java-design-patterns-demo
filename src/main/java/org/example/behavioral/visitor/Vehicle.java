package org.example.behavioral.visitor;

public class Vehicle implements VehiclePart {
    VehiclePart[] parts;

    public Vehicle() {
        this.parts = new VehiclePart[]{new CarBody(), new Engine(), new Headlights()};
    }

    @Override
    public void accept(VehiclePartVisitor visitor) {
        for (VehiclePart part : parts){
            part.accept(visitor);
        }
        visitor.visit(this);

    }
}
