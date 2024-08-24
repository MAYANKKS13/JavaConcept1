package org.example;

public interface IMessageable {
    public String doSomething(String name);
    public static String hello(String name) {
        return  name;
    }

    public default String hello1(String name) {
        return  name;
    }

}



