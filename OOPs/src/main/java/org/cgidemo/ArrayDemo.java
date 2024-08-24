package org.cgidemo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int value = 10;
        for(int i = 0; i < 3; i++) {
            arr[i] = value;
            value = value + 10;
        }
        System.out.println(Arrays.stream(arr).toArray());
    }
}
