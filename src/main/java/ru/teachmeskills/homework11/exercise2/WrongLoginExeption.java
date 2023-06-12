package ru.teachmeskills.homework11.exercise2;

public class WrongLoginExeption extends Exception {
    public WrongLoginExeption() {
    }

    public WrongLoginExeption(String message) {
        super(message);
    }
}
