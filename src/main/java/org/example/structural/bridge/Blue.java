package org.example.structural.bridge;

public class Blue implements Color{
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
