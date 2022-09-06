package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Market {
    private Map<String, Product> productMap = new HashMap<>();

    public Product lookUp(String name) {
        if (!productMap.containsKey(name)) {
            productMap.put(name, new Product(name));
        }
        return productMap.get(name);
    }

    public int getSizeOfProducts() {
        return productMap.size();
    }
}
