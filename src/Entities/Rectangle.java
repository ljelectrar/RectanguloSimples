package Entities;

public class Rectangle {
    public double height;
    public double width;

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return (2 * (width + width)) + (2 * (height + height));
    }

    public double diagonal() {
         double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
         return diagonal;
    }
}
