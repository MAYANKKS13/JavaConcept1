package org.example.problem2;

interface IncrementByFive {
    public int incrementByFive(int num);
}
public class Calculate {
    public static void main(String[] args) {
        IncrementByFive iF = (num) -> {return num + 5;};

        System.out.println(iF.incrementByFive(13));
    }
}
