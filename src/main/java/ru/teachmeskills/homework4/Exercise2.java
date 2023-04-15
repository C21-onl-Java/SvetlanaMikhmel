package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    /* Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.*/
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 10, 3, 6, 7, 4};
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numIter = 0;
        int newI = 0;
        for (int i = 0; i < array.length; i++)
            if (number == array[i]) {
                numIter++;
            }
        int newArrayLength = array.length - numIter;
        int[] newArray = new int[newArrayLength];
        if (numIter > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != number) {
                    newArray[newI] = array[i];
                    newI++;
                }
            }
            System.out.println("Новый массив " + Arrays.toString(newArray));
        } else {
            System.out.println("Данное число не содержится в массиве");
        }
    }
}