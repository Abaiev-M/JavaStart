package com.gmail.aba;
/*
Есть девятиэтажный дом, в котором 5 подъездов. Номер подъезда начинается с единицы. На
одном этаже 4 квартиры. Напишите программу которая, получит номер квартиры с клавиатуры, и
выведет на экран, на каком этаже, какого подъезда расположена эта квартира. Если такой
квартиры нет в этом доме, то нужно сообщить об этом пользователю.
*/

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalOfEntrances = 5;
        int totalOfFloors = 9;
        int totalOfApartments = 4;

        System.out.print("Enter apartment number: ");
        int numOfApartment = sc.nextInt();

        if (numOfApartment > 180 || numOfApartment < 1) {
            System.out.println("There is no such apartment.");
            return;
        }

        System.out.println("apartment number: " + numOfApartment);
        int numOfEntrance = ((numOfApartment - 1) / 36) + 1;
        System.out.println("entrance number: " + numOfEntrance);

        int numInEntrance = (numOfApartment - 1) % 36 + 1;
        int numOfFloor = (numInEntrance - 1) / 4 + 1;
        System.out.println("floor on which the apartment is located: " + numOfFloor);

        sc.close();

    }
}
