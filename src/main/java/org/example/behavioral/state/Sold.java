package org.example.behavioral.state;

public class Sold implements ProductState {
    @Override
    public void previous(Product product) {
        product.setState(new Available());
    }

    @Override
    public void next(Product product) {
        System.out.println("Product is already sold");
    }
}
