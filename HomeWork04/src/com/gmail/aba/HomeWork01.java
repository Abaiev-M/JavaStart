package com.gmail.aba;

/*
Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16). Факториал
числа это произведение всех чисел от этого числа до 1. Например 5!=5*4*3*2*1=120
*/

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        var n = sc.nextInt();
        var factorial = 1;

        if (4 < n && n < 16) {
            for (;n >= 1;) {
                factorial *= n;
                n -= 1;
            }
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println("factorial: " + factorial);
        sc.close();
    }
}
