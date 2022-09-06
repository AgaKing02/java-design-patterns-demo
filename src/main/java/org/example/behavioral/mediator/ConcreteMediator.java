package org.example.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague current) {
        for (Colleague colleague : colleagues) {
            if (colleague != current){
                colleague.receiveMessage(message);
            }
        }

    }
}
