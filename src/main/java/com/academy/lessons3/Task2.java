package com.academy.lessons3;

public class Task2 {
    public static void main(String[] args) {


        String str = "Traveling, Dead Sea, Mediterranean , Blue Cost, Pacific Ocean, Marmara Sea, Red Sea";
        String[] words = str.split("[,\\s]");
        int count = 0;
        System.out.println(str);

        for (int i = 0;i<words.length;i++){
            if (words[i].endsWith("ea")){
                System.out.println(words[i]);
                count++;
            }
        }
        System.out.println(count);

    }
}
