package com.academy.lessons02;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {1, -5, 10, 25, 80, 3};
       printArray(array);
        System.out.println("****");
        System.out.println("Min:" + minimum(array));
        System.out.println("Max:" + maximun(array));


        //вложеие
        int[] [] array2D = {
                {5,8,3},
                {6,-1,11},
                {1,100,25,36,50},
                {0,7}
        };

        System.out.println(array2D[2][3]);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array2D));

        int min2d = array2D[0][0];
        int max2d = array2D[0][0];

        for (int i = 0;i < array2D.length;i++){
            for (int k = 0; k < array2D[i].length; k++){
                System.out.println(array2D[i][k]);
                if (min2d > array2D[i][k]){
                    min2d = array2D[i][k];
                }
                if (max2d < array2D[i] [k]){
                    max2d = array2D[i] [k];
                }
            }
            //System.out.println(Arrays.toString(array2D[i]));
        }
        System.out.println("min2d "+ min2d);
        System.out.println("max2d " + max2d);

        int number = 4;
        Integer number2 = 24;
        String str2 = number2.toString();
        String str = Integer.toString(number);
        System.out.println(str);
        System.out.println("str2");
        array = reserve(array);
        System.out.println(Arrays.toString(array));



        }
        public static void printArray(int[]array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

                int min = array[0];
                for (int i1 = 1; i < array.length; i++) {
                    if (array[i] < min)
                        min = array[i];

                }
            }
        }
        public static int minimum(int[]array) {
            int min =array[0];
            for (int i = 1;i<array.length;i++){
                if (array[i] <min)
                    min = array[i];
            }
                   return min;
                }


        public static int maximun(int[]array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];

            }
            return max;
        }
        public static int[] reserve (int[]array){
        for (int i = 0, j = array.length - 1;i<j;i++,j--){
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }

}