package ru.teachmeskills.homework3;

import java.util.Scanner;

public class Exercise3 {
    // Напишите программу, которая будет принимать на вход число и на
    //выход будет выводить сообщение четное число или нет.
    //Для определения четности числа используйте операцию получения
    //остатка от деления - операция выглядит так: '% 2').
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " - четное число");
        } else {
            System.out.println(num + " - нечетное число");
        }
    }
}
