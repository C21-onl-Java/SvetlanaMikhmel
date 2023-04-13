package ru.teachmeskills.homework3;

public class Exercise12 {
    //Выведите на экран первые 11 членов последовательности Фибоначчи.
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int sum;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i < 9; i++) {
            sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
