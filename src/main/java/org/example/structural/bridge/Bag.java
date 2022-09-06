package org.example.structural.bridge;

public class Bag extends Store{
    private final Color color;

    public Bag(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        System.out.println("The color of this bag is "+color.toString());
        return color;
    }
}
