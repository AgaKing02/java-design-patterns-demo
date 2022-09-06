package org.example.behavioral.observer;

public class SupplyChainObserver implements Observer {
    ProductSubject productSubject;

    public SupplyChainObserver(ProductSubject productSubject) {
        this.productSubject = productSubject;
        this.productSubject.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Supply chain observer is updated, the current state is : " + productSubject.getState());
    }
}
