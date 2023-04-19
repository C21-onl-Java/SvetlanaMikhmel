package ru.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    /*
    Создайте двумерный массив. Выведите на консоль диагонали массива.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер строк и столбцов для массива: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Диагональ 1: ");
        for (int i = 0; i < row; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        System.out.println("Диагональ 2: ");
        for (int i = row - 1, x = 0; i >= 0 && x < row; i--, x++) {
            System.out.print(array[x][i] + " ");
        }
    }
}