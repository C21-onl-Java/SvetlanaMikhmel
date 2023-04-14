package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    /*Реализуйте алгоритм сортировки пузырьком.*/
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length - 1; j++) {
            for (int k = array.length - 1; k > j; k--) {
                if (array[k - 1] > array[k]) {
                    int temp = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
