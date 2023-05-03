package ru.teachmeskills.homework6.exercise2;

public class Computer {
    private double cost;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer() {
    }

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(double cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getCost() {
        return cost;
    }

    public String getModel() {
        return model;
    }

    public Ram getRam() {
        return ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
