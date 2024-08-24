package org.example;

import org.cgidemo.Dog;

public class InheritanceMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        System.out.println(d.color);
        d.eat();
    }
}
