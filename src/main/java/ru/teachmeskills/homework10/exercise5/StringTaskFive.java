package ru.teachmeskills.homework10.exercise5;

import java.util.Arrays;

public class StringTaskFive {
    public static void showRepeatSimbols(String text) {
        String[] textSplit = text.split("");
        for (String simbol : textSplit) {
            System.out.print(simbol.repeat(2));
        }
    }
}

