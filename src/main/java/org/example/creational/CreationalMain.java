package org.example.creational;

import org.example.creational.builder.OnlineStoreAccount;
import org.example.creational.factory.AbstractFactory;
import org.example.creational.factory.Computer;
import org.example.creational.factory.ComputerFactory;
import org.example.creational.factory.FactoryProducer;
import org.example.creational.pool.ObjectPool;
import org.example.creational.pool.RobotsPool;
import org.example.creational.prototype.Robot;
import org.example.creational.singleton.SingletonHolder;

import java.util.Arrays;
import java.util.List;

public class CreationalMain {
    public static void main(String[] args) {
        /*
         * Builder Pattern example */
        OnlineStoreAccount account = new OnlineStoreAccount
                .Builder(1L)
                .withName("John")
                .withAddress("Nur-Sultan city")
                .withBudget(1000L)
                .withDiscountRate(3L)
                .build();

        System.out.println(account.getName());
        //Simple factory design
        ComputerFactory factory = new ComputerFactory();
        Computer laptop = factory.getComputer("Laptop");
        laptop.compute();
        Computer phone = factory.getComputer("Phone");
        phone.compute();

        //Abstract factory example
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        Computer phone1 = abstractFactory.getComputer("Phone");
        phone1.compute();

        //Singleton design pattern example
        SingletonHolder holder = SingletonHolder.getInstance();
        holder.loggingStart();
        holder.loggingEnd();

        //Prototype design pattern example
        List<String> features = Arrays.asList("a", "b", "c");
        Robot.Component component = new Robot.Component();
        component.setName("name");
        component.setFunctionality("function");

        Robot robot = new Robot();
        robot.setId(1);
        robot.setComponent(component);
        robot.setFeatures(features);

        System.out.println(robot.toString());

        Robot clone = robot.clone();

        System.out.println(clone.toString());

        //Object pool pattern example
        ObjectPool<Robot> pool=new RobotsPool();
        Robot robot1 = pool.create();
        Robot robot2 = pool.create();

        pool.checkOut(robot1);

        Robot robot3 = pool.checkIn();



    }
}
