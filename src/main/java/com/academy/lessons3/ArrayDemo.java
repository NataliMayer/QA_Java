package com.academy.lessons3;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1, min = (int)1;
        while(in.hasNext()){
            if(a<min&& a>0){
                min=a;
            }
        }
        System.out.print(min);
    }
}
