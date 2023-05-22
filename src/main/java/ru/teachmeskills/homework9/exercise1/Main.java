package ru.teachmeskills.homework9.exercise1;

public class Main {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(4.5, 5.6);
        Vector2D vector2 = new Vector2D(6.5, 3.6);
        System.out.println(vector1.getLength());
        System.out.println(vector1.compareVector(vector2));
        vector1.getDifference();
        vector1.getScalarMultiple();
        System.out.println(vector1.equals(vector2));
        System.out.println(vector1.toString());
        System.out.println();
        Vector3D vector3 = new Vector3D(3.4, 5.6, 2.6);
        Vector3D vector4 = new Vector3D(3.4, 5.6, 2.6);
        System.out.println(vector3.getLength());
        System.out.println(vector3.compareVector(vector4));
        vector3.getDifference();
        vector3.getScalarMultiple();
        System.out.println(vector3.equals(vector4));
        System.out.println(vector3.toString());


    }
}
