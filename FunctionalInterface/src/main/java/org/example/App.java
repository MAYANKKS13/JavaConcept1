package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App {

    public List<String> findPattern(List<String> inputList) {
        Predicate<String> startsWithI = s -> s.startsWith("I");

        List<String> resultList = new ArrayList<>();

        for (String str : inputList) {
            if (startsWithI.test(str) && !resultList.contains(str)) {
                resultList.add(str);
            }
        }

        if (resultList.isEmpty()) {
            resultList.add("- the list is empty");
        }

        return resultList;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        App obj = new App();

        List<String> input1 = List.of("Icecream", "Water", "Ice", "Gas", "Ice");
        List<String> result1 = obj.findPattern(input1);
        System.out.println("Sample Input:");
        System.out.println(input1);
        System.out.println("Expected Output:");
        System.out.println(result1);

        List<String> input2 = List.of("Java", "C", "C++", "Java", "C");
        List<String> result2 = obj.findPattern(input2);
        System.out.println("Sample Input:");
        System.out.println(input2);
        System.out.println("Expected Output:");
        System.out.println(result2);

        List<String> input3 = List.of();
        List<String> result3 = obj.findPattern(input3);
        System.out.println("Sample Input:");
        System.out.println(input3);
        System.out.println("Expected Output:");
        System.out.println(result3);
    }
}
