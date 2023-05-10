package ru.teachmeskills.homework7.exercise1;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getSquare() {
        return width * height;
    }
}
