package com.academy.lessons4;

public class ForAbonent {
    public static void main(String[] args) {
        Abonent abonent = initAbonentData();
        handleAbonent(abonent);

    }

    private static Abonent initAbonentData() {
        Abonent abonent = new Abonent();
        abonent.setFirstName("Nata");
        abonent.setLastName("Tereshchuk");
        abonent.setAge(27);
        abonent.setGender('f');
        return abonent;
    }
    private static void handleAbonent(Abonent abonent) {
        System.out.println(abonent.getFirstName());
        System.out.println(abonent.getLastName());

    }

}