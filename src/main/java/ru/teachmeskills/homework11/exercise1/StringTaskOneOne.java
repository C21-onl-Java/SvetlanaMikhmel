package ru.teachmeskills.homework11.exercise1;

public class StringTaskOneOne {
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

    public static boolean showABC(String text) throws ABCExeption {
        if (text.toLowerCase().contains("abc")) {
            return true;
        }
        throw new ABCExeption("Номер документа не содержит последовательность АВС");
    }

    public static boolean show555(String text) throws StartWith555Exeptoin {
        if (text.startsWith("555")) {
            return true;
        }
        throw new StartWith555Exeptoin("Номер документа не начинается с последовательности 555");
    }

    public static boolean showEnds(String text) throws EndWith1a2bExeption {
        if (text.endsWith("1a2b")) {
            return true;
        }
        throw new EndWith1a2bExeption("Номер документа не заканчивается на последовательность 1a2b");
    }
}
