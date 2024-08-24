package org.InterfaceDemo;

public class InterfaceImpl {
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 15);
        System.out.println(s.area());
        System.out.println(s.circumference());
    }
}
