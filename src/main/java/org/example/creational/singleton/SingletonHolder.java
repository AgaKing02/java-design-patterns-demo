package org.example.creational.singleton;

public class SingletonHolder {
    private static SingletonHolder instance;

    private SingletonHolder() {
    }

    public static synchronized SingletonHolder getInstance() {
        if (instance == null) {
            instance = new SingletonHolder();
        }
        return instance;
    }

    public void loggingStart() {
        System.out.println("SingletonHolder.loggingStart");
    }

    public void loggingEnd() {
        System.out.println("SingletonHolder.loggingEnd");
    }
}
