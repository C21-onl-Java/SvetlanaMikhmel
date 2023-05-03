package ru.teachmeskills.homework6.exercise2;

public class Ram {
    private String nameRam, capacity;

    public Ram() {
        this.nameRam = "Dram";
        this.capacity = "4 Гб";
    }

    public Ram(String nameRam, String capacity) {
        this.nameRam = nameRam;
        this.capacity = capacity;
    }

    public String getNameRam() {
        return nameRam;
    }

    public String getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "nameRam='" + nameRam + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
