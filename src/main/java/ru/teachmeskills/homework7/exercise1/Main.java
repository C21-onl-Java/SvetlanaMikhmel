package ru.teachmeskills.homework7.exercise1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(5), new Rectangle(4, 6),
                new Triangle(6, 6, 6), new Circle(7), new Rectangle(8, 5)
        };
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getPerimeter();
        }
        System.out.println("Сумма периметров равна: " + sum);

    }
}
