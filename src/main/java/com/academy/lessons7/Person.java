package com.academy.lessons7;

public class Person implements Profile {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("I am  "+ name);
    }
    public static void about(){
        System.out.println("Static method: I am a person" );
    }
    public  void description(){
        System.out.println("some text");
    }


}
