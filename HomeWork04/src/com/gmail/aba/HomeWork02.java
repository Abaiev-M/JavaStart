package com.gmail.aba;

/*
Напечатайте таблицу умножения на 5. Предпочтительно печатать 1 x 5 = 5, 2 x 5 = 10, а не просто
5, 10 и т. д.
*/
public class HomeWork02 {
    public static void main(String[] args) {
        var numFive = 5;
        var result = 1;

        for (int n = 1; n <= 10; n++) {
            result = numFive * n;
            System.out.println(numFive + " * " + n + " = " + result);
        }
    }
}
