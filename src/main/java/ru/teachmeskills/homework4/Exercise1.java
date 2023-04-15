package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    /* Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).*/
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 9, 13, 25, 37};
        System.out.print("Введите любое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int pos1 = Arrays.binarySearch(array, number);
        if (pos1 < 0) {
            System.out.println("Данное число не входит в массив");
        } else {
            System.out.println("Данное число входит в массив под индексом " + pos1);
        }
    }
}

