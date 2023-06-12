package ru.teachmeskills.homework11.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            StaticClass.enterAccount("As m", "fhffffeeeeeffhhfjfjf", "fhffffeeeeeffhhfjfjf");
        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.err.println(e.getMessage());
        }

        try {
            StaticClass.enterAccount("Asfjfjf", "gggggg", "gggggg");
        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.err.println(e.getMessage());
        }

        try {
            StaticClass.enterAccount("Asfjfjf", "gggggg11", "gggggg");
        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.err.println(e.getMessage());
        }
        try {
            StaticClass.enterAccount("Asfjfjf", "gggggg11", "gggggg11");
        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.err.println(e.getMessage());
        }
    }
}