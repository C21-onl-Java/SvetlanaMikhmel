package ru.teachmeskills.homework3;

import java.util.Scanner;

public class Exercise5 {
    // По введенному номеру определить цвет радуги (1 –
    //красный, 4 – зеленый и т. д.).
    public static void main(String[] args) {
        System.out.println("Введите номер полосы в радуге: ");
        Scanner scanner = new Scanner(System.in);
        int numColor = scanner.nextInt();
        switch (numColor) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фазан");
                break;
            default: {
                System.out.println("Error");
            }
        }
    }
}
