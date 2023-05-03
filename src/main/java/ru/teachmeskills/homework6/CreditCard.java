package ru.teachmeskills.homework6;

public class CreditCard {
    private String num;
    private double sum;


    public CreditCard() {
    }

    public CreditCard(String num, double sum) {
        this.num = num;
        this.sum = sum;
    }

    public void addMoney(double sum) {
        this.sum += sum;
    }

    public void withdrawMoney(double sum) {
        if (this.sum < sum) {
            System.out.println("Недостаточно средств на счету");
        } else this.sum -= sum;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "num='" + num + '\'' +
                ", sum=" + sum +
                '}';
    }
}
