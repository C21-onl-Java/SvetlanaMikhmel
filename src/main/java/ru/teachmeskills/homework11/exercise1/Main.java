package ru.teachmeskills.homework11.exercise1;

public class Main {
    public static void main(String[] args) {
        String numDocument = "1234-ABd-4678-dif-9g0h";
        StringTaskOneOne stringTaskOneOne = new StringTaskOneOne();
        System.out.println(stringTaskOneOne.showTwoFirstBlocks(numDocument));
        System.out.println(stringTaskOneOne.showAsteriks(numDocument));
        System.out.println(stringTaskOneOne.showOnlyLetters(numDocument));
        System.out.println(stringTaskOneOne.showCapslock(numDocument));
        try {
            System.out.println(stringTaskOneOne.showABC(numDocument));
        } catch (ABCExeption e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(stringTaskOneOne.show555(numDocument));
        } catch (StartWith555Exeptoin e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(stringTaskOneOne.showEnds(numDocument));
        } catch (EndWith1a2bExeption e) {
            System.err.println(e.getMessage());
        }

    }
}
