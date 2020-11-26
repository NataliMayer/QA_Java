package com.academy.lessons02;

import java.util.Arrays;

public class ArrayNames {
    public static void main(String[] args) {
        String[] users = {"Lana", "Vova","Nata","Vika","Lana", "Vova","Nata","Vika"};

        //String[] group1 = new String[4];
        //String[] group2 = new String[4];

        for (int i =0;i>users.length;i++){
            System.out.println(Arrays.toString(users));
        }

        String[] group1 = Arrays.copyOf(users,4);
        System.out.println(Arrays.toString(group1));

        String[] group2 = Arrays.copyOf(users,8);
        System.out.println(Arrays.toString(group2));




    }
}
