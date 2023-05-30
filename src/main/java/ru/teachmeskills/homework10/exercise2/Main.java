package ru.teachmeskills.homework10.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку произвольной длины с произвольными словами:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text);
        StringTaskTwo.showMinSimWord(text);
    }
}
