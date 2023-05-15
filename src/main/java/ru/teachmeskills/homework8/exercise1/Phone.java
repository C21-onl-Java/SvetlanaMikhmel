package ru.teachmeskills.homework8.exercise1;

public class Phone {
    private int number;
    private String model;
    private int weight;


    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void recieveCall(String name) {
        System.out.println("Звонит - " + name);
    }

    public void recieveCall(String name, int num) {
        System.out.println("Звонит - " + name+ "\n" + num);
    }

    public void sendMessage(String... phoneNumber) {
        System.out.println("Сообщение будет отправлено на номера: ");
        for (int i = 0; i < phoneNumber.length; i++) {
            System.out.println(phoneNumber[i]);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

