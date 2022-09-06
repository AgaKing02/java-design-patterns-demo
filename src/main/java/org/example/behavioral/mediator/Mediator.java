package org.example.behavioral.mediator;

public interface Mediator {
    void addColleague(Colleague colleague);

    void sendMessage(String message, Colleague colleague);
}
