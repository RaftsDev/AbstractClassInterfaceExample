package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        Parrot parrot = new Parrot("Woodie");
        Penguin penguin = new Penguin("Emperor");

        dog.eat();
        dog.bark();

        parrot.eat();
        parrot.breath();
        parrot.fly();

        penguin.fly();

    }
}
