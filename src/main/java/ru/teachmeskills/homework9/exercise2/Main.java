package ru.teachmeskills.homework9.exercise2;

public class Main {
    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D();
        Vector2D vector2 = new Vector2D();
        Vector3D vector3 = new Vector3D();
        Vector3D vector4 = new Vector3D();
        vector1.getDifference();
        System.out.println(vector1.getLength());
        System.out.println(vector3.equals(vector4));
        System.out.println(vector1.toString());
        System.out.println(vector3.toString());
        vector2.getArrayVector(4, 5);
    }
}
