package ru.teachmeskills.homework9.exercise1;

public class Vector3D {
    private double x;
    private double y;
    private double z;
    String DESCRIPTION_2D = "Это вектор для трехмерной системы координат";

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public void getScalarMultiple() {
        System.out.println("Скалярное произведение");
    }

    public void getSum() {
        System.out.println("Сумма векторов");
    }

    public void getDifference() {
        System.out.println("Разность векторов");
    }

    public static void getArrayVector(int n) {
        Vector3D[] vectors = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector3D(Math.random(), Math.random(), Math.random());
            System.out.println(vectors[i]);
        }
    }

    public boolean compareVector(Vector3D vector) {
        return super.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z + DESCRIPTION_2D;
    }
}

