package org.example.behavioral.memento;

public class Originator {
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento storeStateMemento() {
        return new Memento(state);
    }

    public void retrieveStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
