package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        int[] res = RemoveDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        int[] expected = new int[]{0, 1, 2, 3, 4};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], res[i]);
        }
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] res = RemoveDuplicates.removeDuplicates(new int[]{1,1,2});
        int[] expected = new int[]{1, 2};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], res[i]);
        }
    }
}