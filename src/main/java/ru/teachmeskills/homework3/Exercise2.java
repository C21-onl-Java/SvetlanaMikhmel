package ru.teachmeskills.homework3;

import java.util.Scanner;

public class Exercise2 {
    // Написать программу для вывода названия поры года по номеру
    //месяца.
    //При решении используйте оператор if-else-if.
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <=8) {
                System.out.println("Summer");
            } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Error");

    }
    }
}
