package com.company;

public class Eagle extends  Bird{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+" Planning in the sky...");
    }
}
