package org.cgidemo;

public class StringDemo {
    public static void main(String[] args) {
        String msg = "Hi I am Anil";
        String name = "Anil";
        if(msg.contains(name)) {
            System.out.println("Welcome " + name);
        }
        else {
            System.out.println("Better luck next time");
        }

        String result = "";
        for(int i = msg.length() - 1; i >= 0; i--) {
            result = result + msg.charAt(i);
        }
        System.out.println(result);


        String demo = "ravi";
        String result1 = demo.substring(0,1).toUpperCase() + demo.substring(1);
        System.out.println(result1);


    }


}
