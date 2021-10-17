package sef.module6.activity;

public class Square extends Shape {
    private double side;

    Square(){}

    public double calculateArea() {
        double area = side * side;
        return area;

    }

    public double calculatePerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }
}