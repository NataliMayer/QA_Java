package com.academy.lessons7;


public class InterfaceDemo {
    public static void main(String[] args) {
        Profile person = new Person("Vasya");
        person.info();//не стат метод, для вызова нужно создавать екземпляр класа
        Person.about();// статический метод, можно вызвать не создавая екземпляр класа(обьект)
        if (person instanceof Person)
        ((Person)person).description();


        System.out.println("*****");

        Profile programmer = new Programmer("Vova");
        programmer.info();

        System.out.println("********");

        Profile boxer = new Boxer("Petya");
        boxer.info();

        System.out.println("******");


        Profile[] persons = new Profile[5];
        persons[0] = new Person("Kolya");
        persons[1] = new Boxer("Miha");
        persons[2] = new Boxer("Vitaliy");
        persons[3] = new Programmer("Ivan");
        persons[4] = new Person("Alexey");

        //System.out.println(Arrays.toString(persons));
        for (int i = 0;i<persons.length;i++){
            persons[i].info();//вывод инф вместо систем аут
            if (persons[i] instanceof Boxer )// вывести только боксеров
                ((Boxer) persons[i]).boxing();

        }
        System.out.println("*****************");

        String[] array = {"Boxer", "Programmer","Dancer","Genius","Boxer","Dancer"};
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }

}
