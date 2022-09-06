package org.example.behavioral.state;

public interface ProductState {
    void previous(Product product);
    void next(Product product);
}
