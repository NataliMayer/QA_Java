package com.academy.lessons7;

public class Programmer extends Person implements QA {

    public Programmer(String name) {
        super(name);
    }


    @Override
    public void info() {
        super.info();//супер ссылку на базовый класс
        System.out.println("I am programmer" );


    }
    public void coding(){
        System.out.println("I build application");
    }

}
