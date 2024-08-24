package org.example;

public class doSortingwithInsertion {
    public void sort(int[] nums, String[] names) {
        for(int i = 1; i < nums.length; i++) {
            int value = nums[i];
            String name = names[i];
            int j = i - 1;
            while (j >= 0 && value < nums[j]) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = value;
            names[j + 1] = name;
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.println(names[k]+" - "+nums[k]);
        }

    }
}
