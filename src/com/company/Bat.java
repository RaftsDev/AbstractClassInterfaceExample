package com.company;

public class Bat extends Animal implements CanFly {
    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flying in the night.");
    }
}
