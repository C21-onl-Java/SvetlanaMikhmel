package ru.teachmeskills.homework3;

public class Exercise6 {
    // При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    //При решении используйте операцию инкремента (++).
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++)
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

