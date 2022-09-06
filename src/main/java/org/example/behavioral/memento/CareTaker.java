package org.example.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> list;

    public CareTaker() {
        this.list = new ArrayList<>();
    }

    public void add(Memento memento) {
        this.list.add(memento);
    }

    public Memento get(int index) {
        return this.list.get(index);
    }

    public int getSize() {
        return this.list.size();
    }
}
