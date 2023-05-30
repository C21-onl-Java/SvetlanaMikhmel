package ru.teachmeskills.homework10.exercise3;

import java.util.Arrays;

public class StringTaskThree {
    public static void showMinDifSimbWord(String text) {
        String[] textSplit = text.split(" ");
        System.out.println(Arrays.toString(textSplit));
        int lenghFirstWord = textSplit[0].length();
        String minSimbWord = "";


        for (int i = 0; i < textSplit.length; i++) {
            String simbol = String.valueOf(textSplit[i].charAt(0));
            int count = 0;
            for (int j = 0; j < textSplit[i].length(); j++) {
                String simbol2 = String.valueOf(textSplit[i].charAt(j));
                if (!simbol.equals(simbol2)) {
                    count++;
                }
            }
            if (lenghFirstWord > count) {
                minSimbWord = textSplit[i];
                lenghFirstWord = count;
            }
        }
        System.out.println(minSimbWord);
    }
}


