package ru.teachmeskills.homework3;

public class Exercise10 {
    // Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void main(String[] args) {
        int num = 0;
        int i;
        for (i = 0; i<10; i++) {
            System.out.print(num + " ");
            num-=5;

        }

    }
}
