package ru.teachmeskills.homework7.exercise2;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Direktor("Director");
        Post post2 = new Worker("Worker");
        Post post3 = new Accountant("Accountant");

        post1.printPost();
        post2.printPost();
        post3.printPost();


    }
}
