package org.example.behavioral.state;

public class Available implements ProductState {
    @Override
    public void previous(Product product) {
        System.out.println("There is no previous state of this object");
    }

    @Override
    public void next(Product product) {
        product.setState(new Sold());
    }
}
