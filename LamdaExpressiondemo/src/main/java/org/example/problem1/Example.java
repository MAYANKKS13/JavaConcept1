package org.example.problem1;


interface MyFunction {
    public String myCompanyName();
}
public class Example {
    public static void main(String[] args) {
        MyFunction mF = () -> {return "CGI";};
        System.out.println(mF.myCompanyName());

    }
}
