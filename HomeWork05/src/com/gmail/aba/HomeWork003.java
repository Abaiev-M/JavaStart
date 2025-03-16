package com.gmail.aba;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив случайных чисел (размером 15 элементов). Создайте второй массив в два раза
больше, первые 15 элементов должны быть равны элементам первого массива, а остальные
элементы заполнить удвоенных значением начальных. Например:
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}
*/
public class HomeWork003 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOne = new int[15];
        int[] arrayTwo = new int[30];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(1, 10);;
            arrayTwo[i] = arrayOne[i];
        }
        for (int i = 15; i < arrayTwo.length; i ++) {
            arrayTwo[i] = arrayOne[i - 15] * 2;
        }
        System.out.println("First array: " + Arrays.toString(arrayOne));
        System.out.println("Second array: " + Arrays.toString(arrayTwo));
    }
}
