package ru.teachmeskills.homework7.exercise2;

public class Direktor implements Post {
    private String name;

    public Direktor(String name) {
        this.name = name;
    }

    @Override
    public void printPost() {
        System.out.println(name);
    }
}
