package com.gmail.aba;

import java.util.Arrays;
import java.util.Scanner;

/*
Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры) и
возможности заполнения каждого его элемента вручную. Выведите этот массив на экран.
*/
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number for element: " + i);
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }
}
