package ru.teachmeskills.homework8.exercise1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(444444, "Apple", 120);
        Phone phone2 = new Phone(55555, "Samsung", 120);
        Phone phone3 = new Phone(66666, "Nokia");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.recieveCall("Sveta");
        System.out.println(phone1.getNumber());
        phone2.recieveCall("Sveta", 55555555);
        phone3.sendMessage("44444444", "555555555", "66666666");


    }
}
