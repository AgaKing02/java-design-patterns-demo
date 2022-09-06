package org.example.structural.bridge;

public class Purse extends Store {
    private final Color color;

    public Purse(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        System.out.println("The color of this purse is " + color.toString());
        return color;
    }
}
