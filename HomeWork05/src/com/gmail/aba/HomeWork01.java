package com.gmail.aba;

import java.util.Arrays;

/*
Дан массив целых чисел вида — {0,5,2,4,7,1,3,19}. Написать программу для подсчета количества
нечетных чисел в нем.
*/
public class HomeWork01 {
    public static void main(String[] args) {
        int[] array = {0,5,2,4,7,1,3,19};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count += 1;
            }
        }
        System.out.println("The number of odd numbers " + count);

    }
}
