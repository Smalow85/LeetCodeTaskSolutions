package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    public void addBinaryTest_1() {
        String a = "110";
        String b = "1";
        String res = AddBinary.addBinary(a, b);
        assertEquals("111", res);
    }

    @Test
    public void addBinaryTest_2() {
        String a = "0";
        String b = "0";
        String res = AddBinary.addBinary(a, b);
        assertEquals("0", res);
    }

    @Test
    public void addBinaryTest_3() {
        String a = "10";
        String b = "10";
        String res = AddBinary.addBinary(a, b);
        assertEquals("100", res);
    }
}