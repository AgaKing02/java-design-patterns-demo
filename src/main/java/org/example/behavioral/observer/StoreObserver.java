package org.example.behavioral.observer;

public class StoreObserver implements Observer {
    ProductSubject productSubject;

    public StoreObserver(ProductSubject productSubject) {
        this.productSubject = productSubject;
        this.productSubject.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Store observer is updated, the current state is : " + productSubject.getState());
    }
}
