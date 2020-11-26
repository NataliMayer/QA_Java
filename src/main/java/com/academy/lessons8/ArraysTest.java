package com.academy.lessons8;

public class ArraysTest {
    public static void main(String[] args) {
        int [] intex = new int[4];
        intex[0] = 1;
        intex[1] = 3;
        intex[2] = 0;
        intex[3] = 2;

        String [] islands = new String[4];
        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        int y = 0;
        int ref;
        while (y <4){
            ref = intex[y];
            System.out.print("острова = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
