package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public String stringSorter(List<String> stringList, String sortingOrder) {
        // Check if input parameters are valid
        if (stringList == null || sortingOrder == null || stringList.isEmpty() || sortingOrder.trim().isEmpty()) {
            return "Given stringList or sortingOrder is empty, null or blank space";
        }

        // Check if sortingOrder is valid ('asc' or 'desc')
        if (!sortingOrder.equalsIgnoreCase("asc") && !sortingOrder.equalsIgnoreCase("desc")) {
            return "No sorting order present for given string '" + sortingOrder + "', 'asc' for ascending order sort and 'desc' for descending order sort";
        }

        // Check for empty or blank space values in stringList
        for (String str : stringList) {
            if (str == null || str.trim().isEmpty()) {
                return "The list contains an empty or blank space value";
            }
        }

        // Convert immutable List to a mutable ArrayList
        List<String> mutableList = new ArrayList<>(stringList);

        // Perform sorting based on sortingOrder using lambda expression
        Collections.sort(mutableList, (s1, s2) -> {
            if (sortingOrder.equalsIgnoreCase("asc")) {
                return s1.compareTo(s2);
            } else {
                return s2.compareTo(s1);
            }
        });

        // Return sorted list as string representation
        return mutableList.toString();
    }

    public static void main(String[] args) {
        App obj = new App();

        // Test cases as per the example provided
        List<String> input1 = List.of("Kennedy", "Apple", "John");
        String result1 = obj.stringSorter(input1, "asc");
        System.out.println("Sample Input:");
        System.out.println(input1 + ", \"asc\"");
        System.out.println("Expected Output:");
        System.out.println(result1);

        List<String> input2 = List.of("Kennedy", "Apple", "John");
        String result2 = obj.stringSorter(input2, "sort");
        System.out.println("Sample Input:");
        System.out.println(input2 + ", \"sort\"");
        System.out.println("Expected Output:");
        System.out.println(result2);

        List<String> input3 = List.of("Kennedy", "");
        String result3 = obj.stringSorter(input3, "Desc");
        System.out.println("Sample Input:");
        System.out.println(input3 + ", \"Desc\"");
        System.out.println("Expected Output:");
        System.out.println(result3);

        List<String> input4 = List.of("Kennedy", "Apple", "John");
        String result4 = obj.stringSorter(input4, null);
        System.out.println("Sample Input:");
        System.out.println(input4 + ", null");
        System.out.println("Expected Output:");
        System.out.println(result4);
    }
}
