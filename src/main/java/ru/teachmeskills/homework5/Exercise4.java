package ru.teachmeskills.homework5;

import java.util.Arrays;

public class Exercise4 {
    /*
     Создайте двумерный массив целых чисел. Выведите на консоль сумму
всех элементов массива.
     */
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 9 + 1);
                sum += array[i][j];
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Сумма всех элементов массива равна: " + sum);
    }
}
