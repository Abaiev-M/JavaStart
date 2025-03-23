package com.gmail.aba;
/*
Напишите метод который реализует линейный поиск элемента в массиве целых чисел. Если такой
элемент в массиве есть то верните его индекс, если нет то метод должен возвращать число - «-1».
 */
public class HomeWork03 {
    public static void main(String[] args) {
        int[] array = { -2, 0, 3, 5, 7, 9, 11, 15, 18, 21 };
        int el = 21;

        System.out.println(linearSearch(array, el));
    }

    public static int linearSearch(int[] seq, int element) {
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
