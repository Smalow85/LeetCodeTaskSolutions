package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusOneTest {

    @Test
    public void testPlusOne() {
       int[] res = PlusOne.plusOne(new int[] {1, 2, 3});
       assertEquals(res[res.length - 1], 4);
    }

    @Test
    public void testPlusOne_2() {
        int[] res = PlusOne.plusOne(new int[] {1, 2, 9});
        assertEquals(res[res.length - 1], 0);
        assertEquals (res[res.length - 2], 3);
    }

    @Test
    public void testPlusOne_3() {
        int[] res = PlusOne.plusOne(new int[] {9, 9, 9});
        assertEquals(res.length, 4);
        assertEquals(res[res.length - 1], 0);
        assertEquals(res[0], 1);
    }
}