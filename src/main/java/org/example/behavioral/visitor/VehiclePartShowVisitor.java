package org.example.behavioral.visitor;

public class VehiclePartShowVisitor implements VehiclePartVisitor{
    @Override
    public void visit(VehiclePart part) {
        System.out.println("Displaying the "+part.getClass().getSimpleName());
    }
}
