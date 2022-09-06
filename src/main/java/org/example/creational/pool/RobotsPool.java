package org.example.creational.pool;

import org.example.creational.prototype.Robot;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RobotsPool extends ObjectPool<Robot> {
    @Override
    public Robot create() {
        int id = ThreadLocalRandom.current().nextInt();
        Robot robot = new Robot(id, new ArrayList<>(), new Robot.Component());

        return robot;
    }
}
