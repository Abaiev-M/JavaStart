package com.gmail.aba;

/*
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. Дано: a,
b, c – стороны предполагаемого треугольника. Напишите программу, которая укажет, существует ли
такой треугольник или нет.
*/
public class HomeWork03 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 1;

        if (a < 1 || b < 1 || c < 1) {
            System.out.println("java.lang.NullPointerException");
            return;
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The triangle exists");
        } else {
            System.out.println("The triangle does not exist");
        }
    }
}
