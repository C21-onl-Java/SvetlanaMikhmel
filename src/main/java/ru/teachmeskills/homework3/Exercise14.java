package ru.teachmeskills.homework3;

public class Exercise14 {
    // Напишите программу, которая выводит на консоль таблицу умножения.
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            for (int j = 0; j<=10; j++)
                System.out.println("i"+" * " + "j"+" = " + i*j);
            System.out.println(" ");
        }
    }
}
