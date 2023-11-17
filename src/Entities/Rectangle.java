package Entities;

public class Rectangle {
    public double height;
    public double width;

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return width + width + height + height;
    }

    public double diagonal() {
         return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

    }
}
