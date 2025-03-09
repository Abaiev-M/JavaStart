package com.gmail.aba;

import java.util.Scanner;

/*
Выведите на экран прямоугольник из *. Причем высота и ширина прямоугольника вводятся с
клавиатуры. Например ниже представлен прямоугольник с высотой 4 и шириной 5.
*****
*   *
*   *
*****

*/
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input width: ");
        int width = sc.nextInt();
        System.out.print("Input height: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

