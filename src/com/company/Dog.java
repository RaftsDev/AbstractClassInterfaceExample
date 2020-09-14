package com.company;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Biting...");
    }

    public void bark(){
        System.out.println("Woof!");
    }
}
