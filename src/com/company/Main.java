package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        Bird woodPeaker = new Bird("Woodie");

        dog.eat();
        dog.bark();

        woodPeaker.eat();
        woodPeaker.breath();
    }
}
