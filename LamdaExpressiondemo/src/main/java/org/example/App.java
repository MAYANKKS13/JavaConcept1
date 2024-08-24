package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        List<String> list = Arrays.asList("MAyank", "RItesh", "Sandeep");
        list.forEach((str) -> {
            System.out.println(str);
        });


       IMessageable m = new IMessageable() {
           @Override
           public String doSomething(String name) {
               return "Hello " + name;
           }
       };


        String result = IMessageable.hello("Ritesh");
        System.out.println(result);
        System.out.println(m.hello1("Swapnil"));
        System.out.println(m.doSomething("Myank"));
        System.out.println( "Hello World!" );
    }
}
