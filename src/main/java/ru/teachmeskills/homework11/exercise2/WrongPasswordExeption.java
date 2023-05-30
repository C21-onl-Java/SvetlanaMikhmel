package ru.teachmeskills.homework11.exercise2;

public class WrongPasswordExeption extends Exception {
    public WrongPasswordExeption() {
    }

    public WrongPasswordExeption(String message) {
        super(message);
    }
}
