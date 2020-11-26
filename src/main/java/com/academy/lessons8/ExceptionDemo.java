package com.academy.lessons8;

import com.academy.lessons4.Abonent;
import com.academy.lessons5.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        Abonent abonent = new Abonent();
        abonent.setFirstName("Вася");

        try {
            abonent.setAge(10);
            abonent.setFirstName("Вася");
            System.out.println("-------");
        } catch (Exception e) {
            System.out.println("Unknown error. Details: " + e.getMessage());
        } finally {
            System.out.println("Complete");
        }

        System.out.println("****");
        System.out.println(abonent);



        //Date date = new Date(1, 23, 2020); // должно быть выброшено исключение
        //System.out.println(date);

        try {
            Date date = new Date(1, 23, 2020); // должно быть выброшено исключение
            System.out.println(date);
        } catch (Exception e) {
            System.out.println("Wrong month 23");
            //e.printStackTrace();
        }
    }
}
