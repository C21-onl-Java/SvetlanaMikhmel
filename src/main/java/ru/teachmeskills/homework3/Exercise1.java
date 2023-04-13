package ru.teachmeskills.homework3;

import java.util.Scanner;

public class Exercise1 {
    //Написать программу для вывода названия поры года по номеру
    //месяца.
    //При решении используйте оператор switch-case.
    public static void main(String[] args) {
        System.out.print("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }

    }
}
