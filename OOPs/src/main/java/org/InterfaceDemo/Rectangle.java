package org.InterfaceDemo;

public class Rectangle implements Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length*breadth;
    }
    public double circumference() {
        return 2*(length + breadth);
    }
}
