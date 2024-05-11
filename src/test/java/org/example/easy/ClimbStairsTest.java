package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbStairsTest {

    @Test
    public void testClimbStairs() {
        int res = ClimbStairs.climbStairs(3);
        assertEquals(3, res);
    }

    @Test
    public void testClimbStairs_1() {
        int res = ClimbStairs.climbStairs(1);
        assertEquals(1, res);
    }
}