package com.company;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Pecking...");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flapping its wings");
    }
}
