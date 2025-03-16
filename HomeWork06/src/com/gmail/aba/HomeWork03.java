package com.gmail.aba;

/*
Выведите на экран 10 строк со значением числа Пи. Причем в первой строке должно быть 2 знака
после запятой, во второй 3, в третьей 4 и т. д.
 */
public class HomeWork03 {
    public static void main(String[] args) {
        double pi = Math.PI;

        for (int i = 2; i <= 11; i++) {
            System.out.println(i-1 + ") " + String.format("%." + i + "f", pi));
        }

    }
}
