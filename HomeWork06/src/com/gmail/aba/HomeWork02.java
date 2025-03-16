package com.gmail.aba;

import java.util.Arrays;
import java.util.Scanner;

/*
Вводится строка из слов, разделенных пробелами. Найти самое длинное слово и вывести его на
экран.
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String longestWord = "";
        String[] words = sc.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }

        System.out.println(longestWord);
    }
}
