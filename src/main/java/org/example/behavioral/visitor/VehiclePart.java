package org.example.behavioral.visitor;

public interface VehiclePart {
    void accept(VehiclePartVisitor visitor);
}
