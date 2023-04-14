package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    /*Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.*/
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}