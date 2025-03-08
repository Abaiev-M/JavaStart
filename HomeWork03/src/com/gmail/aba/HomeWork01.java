package com.gmail.aba;

/*
Написать программу которая считает 4 целых числа с клавиатуры и выведет на экран самое
большое из них.
*/

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int maxNumber;

        System.out.println("Input number 1: ");
        num1 = sc.nextInt();
        System.out.println("Input number 2: ");
        num2 = sc.nextInt();
        System.out.println("Input number 3: ");
        num3 = sc.nextInt();
        System.out.println("Input number 4: ");
        num4 = sc.nextInt();

        maxNumber = num1;
        if (maxNumber < num2) {
            maxNumber = num2;
        }
        if (maxNumber < num3) {
            maxNumber = num3;
        }
        if (maxNumber < num4) {
            maxNumber = num4;
        }

        System.out.println("Max number = " + maxNumber);
    }
}
