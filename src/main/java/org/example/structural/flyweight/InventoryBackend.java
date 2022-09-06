package org.example.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class InventoryBackend {
    private final Market market = new Market();
    private final List<Order> list = new ArrayList<>();

    public void takeOrder(String name, int id) {
        Product product = market.lookUp(name);
        Order order = new Order(id, product);
        list.add(order);
    }

    public synchronized void process() {
        list.forEach(Order::manageOrder);
    }

   public String report() {
        return "The total number of objects created : " + market.getSizeOfProducts();
    }
}
