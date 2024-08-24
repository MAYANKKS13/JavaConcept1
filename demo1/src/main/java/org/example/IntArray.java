package org.example;

public class IntArray {
    public static int sumAll(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void evenNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0) {
                System.out.print(nums[i] +" ");
            }
        }
    }

    public static int average(int[] nums) {
       return sumAll(nums)/ nums.length;
    }

    public static boolean checkPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(checkPrime(nums[i])) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
