package org.example;

import javax.sound.midi.Soundbank;

public class doSorting {
    public void sort(int[] nums, String[] names) {
        for(int i = 0; i < nums.length; i++) {
            int index = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[index] > nums[j]) {
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            String tempName = names[index];
            names[index] = names[i];
            names[i] = tempName;
            System.out.println(names[i] + " - " + nums[i]);
        }
    }
}
