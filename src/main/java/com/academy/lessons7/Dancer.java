package com.academy.lessons7;

public class Dancer extends Person implements Dance {
    public Dancer(String name) {
        super(name);
    }
    @Override
    public void dance(){
        System.out.println("I am a Dancer");

    }
    @Override
    public void info(){
        super.info();
        System.out.println("I like dance");
    }

}
