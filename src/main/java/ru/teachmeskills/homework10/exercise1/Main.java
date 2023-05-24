package ru.teachmeskills.homework10.exercise1;

public class Main {
    public static void main(String[] args) {
        String numDocument = "1234-ABC-5678-dif-9g0h";
        StringTaskOne stringTaskOne = new StringTaskOne();
        System.out.println(stringTaskOne.showTwoFirstBlocks(numDocument));
        System.out.println(stringTaskOne.showAsteriks(numDocument));
        System.out.println(stringTaskOne.showOnlyLetters(numDocument));
        System.out.println(stringTaskOne.showCapslock(numDocument));
        System.out.println(stringTaskOne.showABC(numDocument));
        System.out.println(stringTaskOne.show555(numDocument));
        System.out.println(stringTaskOne.showEnds(numDocument));

    }
}
