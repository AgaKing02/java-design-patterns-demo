package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductSubject {
    private List<Observer> observers = new ArrayList<>();
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
