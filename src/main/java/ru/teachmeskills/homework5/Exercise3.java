package ru.teachmeskills.homework5;

import java.util.Arrays;

public class Exercise3 {
    /*
    Умножение двух матриц
Создайте два массива целых чисел размером 3х3 (две матрицы).
Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0
     */
    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] array3 = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                for (int k = 0; k < 3; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }
    }
}
