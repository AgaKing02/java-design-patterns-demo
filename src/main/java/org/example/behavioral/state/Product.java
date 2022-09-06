package org.example.behavioral.state;

public class Product {
    private ProductState state;

    public Product() {
        this.state = new Available();
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public void previousState() {
        this.state.previous(this);
    }

    public void nextState() {
        this.state.next(this);
    }

    public void printStatus() {
        System.out.println("The current state of this object is " + state.getClass().getSimpleName());
    }
}
