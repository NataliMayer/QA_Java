package com.academy.lessons3;

public class Task3 {
    public static void main(String[] args) {
        String str = "Cat,Dog,Hamster,raccoon";
        String name = str.substring(4,7);
        System.out.println(str);
        System.out.println(name);
        char someChar = 'e';
        int count = 0;

        for (int i = 0;i <str.length();i++){
            if (str.charAt(i)==someChar){
                count++;
            }
        }
        System.out.println(count);

    }
}
