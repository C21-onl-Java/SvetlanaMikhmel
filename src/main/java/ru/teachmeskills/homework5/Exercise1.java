package ru.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    /*  Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (строки, столбцы, глубина: ");
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        int size3 = scanner.nextInt();
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        Random random = new Random();
        int[][][] array = new int[size1][size2][size3];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size3; k++) {
                    array[i][j][k] = random.nextInt(20);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Массив с каждым увеличенным элементом на " + num + " :");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size3; k++) {
                    array[i][j][k] += num;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}