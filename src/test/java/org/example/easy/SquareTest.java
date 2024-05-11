package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void mySqrtTest() {
        int x = 101;
        int res = Square.mySqrt(x);
        assertEquals(10, res);
    }

    @Test
    public void mySqrtTest_0() {
        int x = 0;
        int res = Square.mySqrt(x);
        assertEquals(0, res);
    }

    @Test
    public void mySqrtTest_1() {
        int x = 1;
        int res = Square.mySqrt(x);
        assertEquals(1, res);
    }
}