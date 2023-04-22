package ru.teachmeskills.homework6;

public class Main {
    /* Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную
карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.*/

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("BY23AKBB05503399499", 500);
        CreditCard creditCard2 = new CreditCard("BY22ABBC4474747474", 300);
        CreditCard creditCard3 = new CreditCard("BY26ABBC1450095433", 1000);
        creditCard1.addMoney(500);
        creditCard2.addMoney(400);
        creditCard3.withdrawMoney(900);
        System.out.println("Текущее состояние карточки1 составляет: " + creditCard1.getSum());
        System.out.println("Текущее состояние карточки2 составляет:" + creditCard2.getSum());
        System.out.println("Текущее состояние карточки3 составляет:" + creditCard3.getSum());
    }
}
