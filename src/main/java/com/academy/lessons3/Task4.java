package com.academy.lessons3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку :");
        String inp = sc.nextLine();
        System.out.println("Введенная строка :" + inp);
        //getSubStr(inp);


        String numberOnly = inp.replaceAll("[^0-9]", "");
        System.out.println("Строка только цифры : "+numberOnly);

        String lettersOnly = inp.replaceAll("[^a-z]", "");
        System.out.println("Сторока только буквы: "+ lettersOnly);

    }
}
