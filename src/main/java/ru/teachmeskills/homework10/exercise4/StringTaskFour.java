package ru.teachmeskills.homework10.exercise4;

import java.util.Arrays;

public class StringTaskFour {
    public static void showMirrorWord(String text, int num) {
        String[] textSplit = text.split(" ");
        if (num > textSplit.length || num < 0) {
            System.out.println("Введено некорректное значение");
        } else {
            StringBuilder stringBuilder = new StringBuilder(textSplit[num]);
            if (stringBuilder.reverse().toString().equals(textSplit[num])) {
                System.out.println(textSplit[num] + " - является полиндромом");
            } else {
                System.out.println(textSplit[num] + " не является полиндромом");
            }
        }
    }
}
