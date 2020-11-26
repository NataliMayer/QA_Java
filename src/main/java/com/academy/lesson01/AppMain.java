package com.academy.lesson01;

public class AppMain {
    public static void main(String[] args){
        //System.out.println("Hello World! ");

        int n = 10;
        //выводим строки
        for(int i = 0; i < n; i++) {
            System.out.println("*****");
            //выводим столбци
            for (int k = 0; k > n; k++) {
                System.out.println("*");
            }
        }
        System.out.println(" ");
    }
}


