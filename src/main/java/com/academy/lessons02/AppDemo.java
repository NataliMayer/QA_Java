package com.academy.lessons02;


import java.util.Scanner;

public class AppDemo {
    public static void main(String[] args) {
        //System.out.println("\"\\\\ Hello World\\\\\"" );
        //double x = 1.1, y = 3, z = 5;

        //System.out.println("z - y - x ");
        //double result = z - y - x;
        //System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        int  age =  scanner.nextInt();
        System.out.println("Input your age");


        if ( age <= 1){
            System.out.println("Error");
        }
        else if (age >1 && age <= 18){
            System.out.println("Несовершенолетний");
        }
        else if (age >= 19 && age <=89){
            System.out.println("Взрослый");
        }
        else if (age >= 90) {
            System.out.println("Долгожитель");
        }
        }
    }





