package com.hptpd.duck.behavior.quack;

public class Quack implements QuackBehavior {
    private static Quack ourInstance = new Quack();

    public static Quack getInstance() {
        return ourInstance;
    }

    private Quack() {
    }

    @Override
    public void quack() {
        System.out.println("Quack !");
    }
}
