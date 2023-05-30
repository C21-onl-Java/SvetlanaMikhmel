package ru.teachmeskills.homework9.exercise2;

import java.util.Arrays;

public abstract class Vector {
    private int description;
    private double[] coordinates;

    public Vector(int description) {
        this.description = description;
        this.coordinates = new double[description];
        for (int i = 0; i < description; i++) {
            coordinates[i] = Math.round(Math.random() * 10);
        }
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < description; i++) {
            sum += coordinates[i] * coordinates[i];
        }
        return Math.sqrt(sum);
    }

    public void getScalarMultiple() {
        System.out.println("Скалярное произведение");
    }

    public void getSum() {
        System.out.println("Сумма векторов ");
    }

    public void getDifference() {
        System.out.println("Разность векторов ");
    }

    static void getArrayVector(int n, int description) {
        for (int i = 0; i < n; i++) {
            double[] coordinates = new double[description];
            for (int j = 0; j < description; j++) {
                coordinates[i] = Math.round(Math.random() * 10);
            }
            System.out.println(Arrays.toString(coordinates));
        }

    }

    public boolean compareVector(Vector vector) {
        return super.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "description=" + description +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}

