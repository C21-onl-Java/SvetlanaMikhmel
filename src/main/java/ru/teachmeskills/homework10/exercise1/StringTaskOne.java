package ru.teachmeskills.homework10.exercise1;

public class StringTaskOne {

    public static String showTwoFirstBlocks(String text) {
        String[] splitText = text.split("-");
        return splitText[0] + splitText[2];
    }

    public static String showAsteriks(String text) {
        String[] splitText = text.split("-");
        return text.replace(splitText[1], "***").replace(splitText[3], "***");
    }

    public static String showOnlyLetters(String text) {
        String[] splitText = text.split("-");
        return String.join("/", splitText[1], splitText[3],
                String.valueOf(splitText[4].charAt(1)),
                String.valueOf(splitText[4].charAt(3)));
    }

    public static StringBuilder showCapslock(String text) {
        StringBuilder stringBuilder = new StringBuilder("Letters:" + showOnlyLetters(text).toUpperCase());

        return stringBuilder;
    }

    public static boolean showABC(String text) {
        return text.toLowerCase().contains("abc");
    }

    public static boolean show555(String text) {
        return text.startsWith("555");
    }

    public static boolean showEnds(String text) {
        return text.endsWith("1a2b");
    }

}