package org.example.creational.factory;

public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println(this.getClass().getSimpleName()+" computed;");
    }
}
