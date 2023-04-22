package ru.teachmeskills.homework6.exercise3;

public class Main {
    public static void main(String[] args) {
        CashMachine atm549 = new CashMachine(10, 5, 20);
        System.out.println("Сумма на счету: " + atm549.getBalance());
        atm549.addMoney(2, 5, 7);
        System.out.println("Сумма на счету: " + atm549.getBalance());
        atm549.withdrawMoney(300);
        atm549.withdrawMoney(345);
        System.out.println(atm549.toString());
    }
}
