package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        String[] strs = new String[] {"flower", "flob", "florencia"};

        assertEquals("flo", LongestCommonPrefix.longestCommonPrefix(strs));
    }

}