package com.gmail.aba;


//Один литр топлива стоит 1.2$. Ваш автомобиль тратит на 100 км пути 8 литров топлива.
//Вы собрались в поездку в соседний город. Расстояние до этого города составляет 120
//км. Вычислите и выведите на экран сколько вам нужно заплатить за топливо для
//поездки.
public class HomeWork03 {
    public static void main(String[] args) {

        double fuelPrice = 1.2;
        int fuel = 8;
        int distance = 120;

        double totalExpense = (double) (fuel * distance) / 100;
        double totalCost = totalExpense * fuelPrice;

        System.out.println("Total fuel cost: " + totalCost);
    }

}
