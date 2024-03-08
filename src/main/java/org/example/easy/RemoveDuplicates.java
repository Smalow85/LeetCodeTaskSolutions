package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {
        int count = 0;
        int [] result = new int[nums.length];
        Map<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!res.containsKey(nums[i])) {
                result[count] = nums[i];
                nums[count] = nums[i];
                count++;
                res.put(nums[i], nums[i]);
            }
        }
        return result;
    }
}
