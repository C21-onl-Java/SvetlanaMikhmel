package ru.teachmeskills.homework6.exercise2;

public class Hdd {
    private String nameHdd;
    private String capacity;
    private HddType type;

    public enum HddType {
        External, Interior
    }

    public Hdd() {
        this.nameHdd = "Western Digital WD1005FBYZ";
        this.capacity = "1 Тб";
        this.type = HddType.Interior;

    }

    public Hdd(String nameHdd, String capacity, HddType type) {
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

    public HddType getType() {
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
