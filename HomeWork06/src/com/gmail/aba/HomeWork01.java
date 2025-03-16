package com.gmail.aba;

import java.util.Scanner;

/*
Считайте строку текста с клавиатуры. Подсчитайте сколько раз в нем встречается символ «b».
*/
public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countB = 0;
        System.out.println("Input Text");
        String text = sc.nextLine();

        char[] symbols = text.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i]=='b') {
                countB ++;
            }
        }

        System.out.println(countB);
    }
}
