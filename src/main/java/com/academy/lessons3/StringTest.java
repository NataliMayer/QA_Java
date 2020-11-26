package com.academy.lessons3;

public class StringTest {
    public static void main(String[] args) {

        String str = "Traveling, Dead Sea, Mediterranean , Blue Cost, Pacific Ocean";
        String[] words = str.split(", ");
        int count = 0;
        System.out.println(str);


        for (int i = 0;i<words.length;i++){
            if (words[i].startsWith("D")){
                System.out.println(words[i]);
                count++;

            }

        }
        System.out.println(count );

    }
}