package ru.teachmeskills.homework9.exercise2;

public class Vector2D extends Vector {

    public Vector2D() {
        super(2);
    }

    static void getArrayVector(int n) {
        Vector2D[] vectors = new Vector2D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector2D();
            System.out.println(vectors[i]);
        }
    }
}


