package com.gmail.aba;

import java.util.Scanner;

/*
Реализуйте метод рисующий на экране прямоугольник из звездочек «*» — его параметрами будут
целые числа которые описывают длину и ширину такого прямоугольника.
 */
public class HomeWork02 {
    public static void main(String[] args) {
        int width = 4;
        int height = 6;

        createRectangle(width, height);

    }

    static void createRectangle(int height, int width) {
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
    }
}
