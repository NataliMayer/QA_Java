package com.academy.lessons4;

public class StringEx {
    public static void main(String[] args) {
        String str = "Hello world! : hello";
        //str.length()str.charAt(0)
        int count = 0;
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'o')
                count++;
        }

        System.out.println(count);

    }
}
