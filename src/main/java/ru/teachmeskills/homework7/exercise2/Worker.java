package ru.teachmeskills.homework7.exercise2;

public class Worker implements Post {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void printPost() {
        System.out.println(name);
    }
}
