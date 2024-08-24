package org.cgidemo;

public class Rectangle {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    private int breadth;

    public Rectangle() {
    }

    public int area() {
        return length*breadth;
    }

    public int perimeter(int l, int b) {
        return 2*(l+b);
    }
}
