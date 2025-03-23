package com.gmail.aba;
/*
Напишите метод который вернет максимальное число из массива целых чисел.
*/

public class HomeWork01 {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 6, 5, -1, 4};

        System.out.println(returnMaxNumber(array));
    }

    static int returnMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
