package ru.teachmeskills.homework9.exercise1;

public class Vector2D {
    private double x;
    private double y;
    String DESCRIPTION_2D = "Это вектор для двумерной системы координат";

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y);
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

    public static void getArrayVector(int n) {
        Vector2D[] vectors = new Vector2D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector2D(Math.random(), Math.random());
            System.out.println(vectors[i]);
        }
    }

    public boolean compareVector(Vector2D vector) {
        return super.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y + " " + DESCRIPTION_2D;
    }
}