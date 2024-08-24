package org.example;

import org.example.StringArray;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] names = {"Mayank", "Shubham", "Abhishek", "Ayush", "Akashhh"};
        StringArray.display(names);
        StringArray.displayReverse(names);
        StringArray.noOfCharacters(names);
        StringArray.firstCharacter(names);
        System.out.println(StringArray.count(names));
        System.out.println("Maximum character name: " + StringArray.nameHavingMaxCharacter(names));

        System.out.println();
        System.out.println();
        int[] nos = {1, 2, 3, 11, 5, 6, 7, 8};
        System.out.println("Sum of all numbers of array: " + IntArray.sumAll(nos));
        System.out.print("Even numbers are: ");
        IntArray.evenNumbers(nos);
        System.out.println();
        System.out.println("Average of all numbers: " + IntArray.average(nos));
        System.out.println("Prime numbers in array are: ");
        IntArray.primeNumbers(nos);



    }
}
