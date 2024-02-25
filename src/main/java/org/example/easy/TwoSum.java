package org.example.easy;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i,k};
                }
            }
        }
        return new int[]{};
    }
}
