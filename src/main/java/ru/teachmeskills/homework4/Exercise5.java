package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    /*  Создайте массив из n случайных целых чисел и выведите его на экран.
Размер массива пусть задается с консоли и размер массива может быть
больше 5 и меньше или равно 10.
Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввёл не подходящее число, то программа должна
просить пользователя повторить ввод.
Создайте второй массив только из чётных элементов первого массива,
если они там есть, и вывести его на экран.*/
    public static void main(String[] args) {
        boolean corValue = true;
        while (corValue) {
            System.out.println("Введите длину массива: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            if (size > 5 && size <= 10) {
                int[] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * 99 + 1);
                }
                System.out.println(Arrays.toString(array));
                int newArrayLenght = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        newArrayLenght++;
                    }
                }
                int[] newArray = new int[newArrayLenght];
                for (int i = 0; i < newArrayLenght; i++) {
                    newArray[i] = array[i];
                }
                System.out.println(Arrays.toString(newArray));
                corValue = false;
            } else if (size <= 5 || size > 10) {
                System.out.println("Неверное значение");
            }
        }
    }
}


