package ru.teachmeskills.homework9.exercise2;

public class Vector3D extends Vector {
    public Vector3D() {
        super(3);
    }

    static void getArrayVector(int n) {
        Vector3D[] vectors = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector3D();
            System.out.println(vectors[i]);
        }
    }
}
