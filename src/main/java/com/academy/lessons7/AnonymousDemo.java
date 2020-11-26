package com.academy.lessons7;

public class AnonymousDemo {
    public static void main(String[] args) {

        Profile musician = new Profile() {
            @Override
            public void info() {
                System.out.println("I am musisian");
            }
        };
        musician.info();

        Profile footballer = ()-> System.out.println("I am footballer");//лямбда выражение
        footballer.info();
    }
}
