package org.example.singleton;

public class Singleton {
    private int i = 0;

    public void increment() {
        i++;
    }

    public int getI() {
        return i;
    }

    private Singleton() {
    }
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
