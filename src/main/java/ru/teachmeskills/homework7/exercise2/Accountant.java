package ru.teachmeskills.homework7.exercise2;

public class Accountant implements Post {
    private String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void printPost() {
        System.out.println(name);
    }
}
