package org.example;

public class doSortingonNames {
    public  void  sort(int[] nums, String[] names) {
        for(int i = 0; i < names.length - 1; i++) {
            for(int j = 0; j < names.length - i - 1; j++) {
                if(names[j].compareTo(names[j + 1]) > 0) {
                    String name = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = name;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.println(names[i] +" - " + nums[i]);
        }

    }

}
