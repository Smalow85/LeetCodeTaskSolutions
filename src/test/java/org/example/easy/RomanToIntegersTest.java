package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegersTest {

    @Test
    public void testRomanToInteger() {
        String roman = "XLI";
        assertEquals(41, RomanToIntegers.romanToInteger(roman));

        String roman2 = "MCMXCIV";
        assertEquals(1994, RomanToIntegers.romanToInteger(roman2));
    }
}