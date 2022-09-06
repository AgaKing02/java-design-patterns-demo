package org.example.behavioral.mediator;

public class ConcreteColleague implements Colleague {
    private Mediator mediator;
    private String name;

    public ConcreteColleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " : " + message);
        mediator.sendMessage(message, this);

    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message : " + message);

    }
}
