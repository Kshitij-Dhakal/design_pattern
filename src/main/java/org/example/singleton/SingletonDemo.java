package org.example.singleton;

import java.util.stream.IntStream;

public class SingletonDemo {
    public static void main(String[] args) {
        IntStream.range(0, 10).parallel().forEach(value -> Singleton.getInstance().increment());
        System.out.println("Final value " + Singleton.getInstance().getI());
    }
}
