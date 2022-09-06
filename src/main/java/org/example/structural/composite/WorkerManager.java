package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class WorkerManager implements Worker {
    private List<Human> humans=new ArrayList<>();
    private List<Robot> robots=new ArrayList<>();


    public void addWorker(Worker worker) {
        if (worker instanceof Human) {
            humans.add((Human) worker);
        } else {
            robots.add((Robot) worker);
        }
    }
    public void removeWorker(Worker worker) {
        if (worker instanceof Human) {
            humans.remove((Human) worker);
        } else {
            robots.remove((Robot) worker);
        }
    }



    @Override
    public void performTask() {
        System.out.println("WorkerManager.performTask");
    }
}
