package org.example.creational.factory;

public class SmartTV implements Computer {
    @Override
    public void compute() {
        System.out.println(this.getClass().getSimpleName()+" computed;");
    }
}
