package org.example;

public class StringArray {

    public static void display(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void displayReverse(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            String reverse  = "";
            for(int j = arr[i].length()-1; j >= 0; j--) {
                reverse = reverse + arr[i].charAt(j);
            }
            System.out.println(arr[i] +" : "+ reverse);
        }
    }

    public static void noOfCharacters(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            for(int j = 0; j < arr[i].length()-1; j++) {
                count++;
            }
            System.out.println(arr[i] +" : "+ count);
        }
    }

    public static void firstCharacter(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " : " + arr[i].charAt(0));
        }
    }

    public static int count(String[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                count--;
            }
            count++;
        }
        return count;
    }

    public static String nameHavingMaxCharacter(String[] arr) {
        String result = null;
        int max = -1;
        for(int i = 0; i < arr.length; i++) {
            int count  = 0;
            for(int j = 0; j < arr[i].length(); j++) {
                count++;
            }
            if(count > max) {
                max = count;
                result = arr[i];
            }
        }
        return result;
    }


}
