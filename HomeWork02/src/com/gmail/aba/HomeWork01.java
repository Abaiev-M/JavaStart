package com.gmail.aba;

//Написать программу которая вычислит и выведет на экран площадь треугольника если
//известны его стороны (sideA = 0.3, sideB = 0.4, sideC = 0.5). Для вычисления
//использовать формулу Герона.
public class HomeWork01 {

    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;

        double p = (sideA + sideB + sideC) / 2;
        double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

        System.out.println("Triangle area: " + s);
    }
}
