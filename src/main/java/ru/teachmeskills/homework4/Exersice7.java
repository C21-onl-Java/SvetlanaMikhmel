package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Comparator;

public class Exersice7 {
    /* Создайте массив строк. Заполните его произвольными именами
людей.
Отсортируйте массив.
Результат выведите на консоль.*/
    public static void main(String[] args) {
        String[] arrayName = {"Настя", "Аня", "Никита", "Дима", "Оля", "Света", "Валера", "Коля" };
        Arrays.sort(arrayName, Comparator.naturalOrder()); //по возрастанию
        System.out.println(Arrays.toString(arrayName));
        Arrays.sort(arrayName, Comparator.reverseOrder()); //по убыванию
        System.out.println(Arrays.toString(arrayName));
    }
}
