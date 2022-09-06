package org.example.structural.flyweight;

public class Order {
    private final int orderId;
    private final Product product;

    public Order(int orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    void manageOrder() {
        System.out.println("orderId = " + orderId + "; product = " + product);
    }
}
