package ru.teachmeskills.homework3;

import java.util.Scanner;

public class Exercise8 {
    //Напишите программу, где пользователь вводит любое целое
    //положительное число. А программа суммирует все числа от 1 до
    //введенного пользователем числа.
    //Для ввода числа воспользуйтесь классом Scanner.
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительно число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i;
        int sum = 0;
        if (num > 0) {
            for (i = 1; i <= num; i++)
                sum = sum + i;
            System.out.println("Сумма чисел в диапазоне от 1 до " + num + " = " + sum);
        } else {
            System.out.println("Вы ввели неверное число");
        }
    }
}
