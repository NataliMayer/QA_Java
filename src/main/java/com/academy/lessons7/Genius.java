package com.academy.lessons7;

public class Genius extends Person implements Fighter,QA,Dance {
    public Genius(String name) {
        super(name);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("I'm a genius");
    }

    @Override
    public void dance() {
        System.out.println("I'm genius dancer");


    }

    @Override
    public void fight() {
        System.out.println("I'm genius boxer");

    }

    @Override
    public void coding() {
        System.out.println("I'm genius QA");

    }
}
