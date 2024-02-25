package org.example.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] arr = new int[]{1,6,4,5};
        int target = 9;
        int[] res = TwoSum.twoSum(arr, target);
        Assertions.assertEquals(2, res[0]);
        Assertions.assertEquals(3, res[1]);
    }
}