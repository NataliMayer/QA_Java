package com.academy.lessons3;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {34, 5, 6, 12, 0};
        System.out.print(Arrays.toString(array));

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

        }
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.binarySearch(array,4));
    }
}


