package ru.teachmeskills.homework6.exercise3;

public class CashMachine {
    private int amountOfNote100;
    private int amountOfNote50;
    private int amountOfNote20;
    private int note100 = 100;
    private int note50 = 50;
    private int note20 = 20;


    public CashMachine(int amountOfNote100, int amountOfNote50, int amountOfNote20) {
        this.amountOfNote100 = amountOfNote100;
        this.amountOfNote50 = amountOfNote50;
        this.amountOfNote20 = amountOfNote20;
    }


    public int getBalance() {
        int allSum = (amountOfNote100 * note100) + (amountOfNote50 * note50) + (amountOfNote20 * note20);
        return allSum;
    }

    public void addMoney(int amountOfNote100, int amountOfNote50, int amountOfNote20) {
        this.amountOfNote100 += amountOfNote100;
        this.amountOfNote50 += amountOfNote50;
        this.amountOfNote20 += amountOfNote20;
        int addSum = (amountOfNote100 * note100) + (amountOfNote50 * note50) + (amountOfNote20 * note20);
        System.out.println("Сумма добавления составляет: " + addSum);
    }

    public boolean withdrawMoney(int sum) {
        int num100 = 0;
        int num50 = 0;
        int num20 = 0;
        if (sum > getBalance() || sum % 10 != 0 || sum / 10 % 10 == 1 || sum / 10 % 10 == 3 || sum / 10 % 10 == 8) {
            System.out.println("Недостаточно средств на счету или отсутствуют нужные купюры для выдачи");
            return false;
        }
        while (sum > 0) {
            if (amountOfNote100 > 0 && sum >= note100) {
                sum -= note100;
                amountOfNote100--;
                num100++;
            } else if (amountOfNote50 > 0 && sum >= note50) {
                sum -= note50;
                amountOfNote50--;
                num50++;
            } else if (amountOfNote20 > 0 && sum >= note20) {
                sum -= note20;
                amountOfNote20--;
                num20++;
            }
        }
        System.out.println(" Сумма выдана следуюшими купюрами: amountOfNote100=" + num100 +
                ", amountOfNote50=" + num50 +
                ", amountOfNote20=" + num20);
        return true;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "amountOfNote100=" + amountOfNote100 +
                ", amountOfNote50=" + amountOfNote50 +
                ", amountOfNote20=" + amountOfNote20 +
                '}';
    }
}
