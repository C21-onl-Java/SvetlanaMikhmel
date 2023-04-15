package ru.teachmeskills.homework4;

import java.util.Arrays;

public class Exercise4 {
    /* Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны). */
    public static void main(String[] args) {
        int[] array1 = {2, 5, 3, 15, 28};
        int[] array2 = {1, 5, 7, 15, 56};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        if (sum1 > sum2) {
            System.out.println("Среднее арифметическое массива array1 больше среднего арифметического массива array2");
        } else if (sum1 == sum2) {
            System.out.println("Средние арифметические двух массивов равны");
        } else {
            System.out.println("Среднее арифметическое массива array2 больше среднего арифметического массива array1");
        }
    }
}
