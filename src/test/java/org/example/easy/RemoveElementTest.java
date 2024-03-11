package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        int [] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        int [] expected = new int[] {0,1,4,0,3};

        int res = RemoveElement.removeElement(nums, val);

        assertEquals(5, res);
    }
}