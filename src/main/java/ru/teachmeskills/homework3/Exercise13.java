package ru.teachmeskills.homework3;

import java.util.Scanner;

public class Exercise13 {
    //За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    //Напишите программу, в которую пользователь вводит сумму вклада и
    //количество месяцев. А банк вычисляет конечную сумму вклада с учетом
    //начисления процентов за каждый месяц.
    //Для вычисления суммы с учетом процентов используйте цикл for. Пусть
    //сумма вклада будет представлять тип float.
    public static void main(String[] args) {
        System.out.print("Введите сумму вклада: ");
        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int month = scanner.nextInt();
        for (int i = 0; i < month; i++) {
            sum = sum + (sum * 0.07f);
        }
        System.out.println("Итоговая сумма, подлежащая выплате с учетом процентов = " + " " + sum);


    }
}
