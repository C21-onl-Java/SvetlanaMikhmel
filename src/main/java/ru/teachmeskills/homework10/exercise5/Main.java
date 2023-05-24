package ru.teachmeskills.homework10.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое слово");
        String text = scanner.nextLine();
        StringTaskFive newText = new StringTaskFive();
        newText.showRepeatSimbols(text);
    }
}
