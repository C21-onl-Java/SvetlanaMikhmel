package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    /*Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.*/
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();
        int[] array = new int[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 49 + 1);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное число массива равно " + array[0]);
        System.out.println("Максимальное число массива равно " + array[lengthArray - 1]);
        System.out.println("Среднее значение чисел массива равно " + sum / lengthArray);
    }
}