package com.academy.lessons7;


public class Boxer extends Person implements Fighter{

    public Boxer (String name) {
        super(name);
    }
    @Override
    public void info () {
        super.info();
        System.out.println("I'm a boxer");
    }
    @Override
    public void fight() {
        System.out.println("I'm a fighter");
    }

    public void boxing() {
    }
}