package ru.teachmeskills.homework10.exercise2;

public class StringTaskTwo {

    public static void showMinSimWord(String text) {
        String[] textSplit = text.split(" ");
        String shortWord = null;
        String longWord = null;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < textSplit.length; i++) {
            if (max >= textSplit[i].length()) {
                shortWord = textSplit[i];
                max = textSplit.length;
            }
            if (min <= textSplit[i].length()) {
                longWord = textSplit[i];
                min = textSplit.length;
            }
        }
        System.out.println(shortWord + " - самое короткое слово");
        System.out.println(longWord + " - самое длинное слово");

    }
}