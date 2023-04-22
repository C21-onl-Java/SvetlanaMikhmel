package ru.teachmeskills.homework6.exercise2;

public class Hdd {
    private String nameHdd;
    private String capacity;
    private Hddtype type;

    public enum Hddtype {
        External, Interior
    }

    public Hdd() {
        this.nameHdd = "Western Digital WD1005FBYZ";
        this.capacity = "1 Тб";
        this.type = Hddtype.Interior;

    }

    public Hdd(String nameHdd, String capacity, Hddtype type) {
        this.nameHdd = nameHdd;
        this.capacity = capacity;
        this.type = type;
    }

    public String getNameHdd() {
        return nameHdd;
    }

    public String getCapacity() {
        return capacity;
    }

    public Hddtype getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "nameHdd='" + nameHdd + '\'' +
                ", capacity='" + capacity + '\'' +
                ", type=" + type +
                '}';
    }
}
