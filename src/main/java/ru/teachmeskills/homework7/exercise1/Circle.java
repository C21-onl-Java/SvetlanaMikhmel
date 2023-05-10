package ru.teachmeskills.homework7.exercise1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
