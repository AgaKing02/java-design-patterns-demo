package org.example.structural.bridge;

public class Red implements Color {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
