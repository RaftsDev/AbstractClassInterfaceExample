package com.company;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println(this.getName() + " eating.");
    }

    public void breath(){
        System.out.println(this.getName() + "Breath in... breath out...");
    }
}
