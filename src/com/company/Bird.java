package com.company;

public class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Picking...");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "is flapping its wings");
    }
}
