package org.example;

public class doSortingQUICK {
    private boolean flag = false;

    public void sort(int[] nums, String[] names, int low, int high) {
        if (low < high) {
            int pi = partition(nums, names, low, high);
            sort(nums, names, low, pi - 1);
            sort(nums, names, pi + 1, high);
        }
        else {
            if(!flag) {
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(names[i] + " - " + nums[i]);
                }
                flag = true;
            }
        }
    }
    public static int partition(int[] nums, String[] names, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(nums[j] < pivot) {
                i++;
               swap(nums, names, i, j);
            }
        }
        swap(nums, names, i + 1, high);
        return (i + 1);

    }
    public static void swap(int[] nums, String[] names, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;

        String tempName = names[low];
        names[low] = names[high];
        names[high] = tempName;
    }
}
