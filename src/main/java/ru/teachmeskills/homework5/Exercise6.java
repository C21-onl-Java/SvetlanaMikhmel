package ru.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    /*
    Создайте двумерный массив целых чисел. Отсортируйте элементы в
строках двумерного массива по возрастанию.
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
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < row; i++) {
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
