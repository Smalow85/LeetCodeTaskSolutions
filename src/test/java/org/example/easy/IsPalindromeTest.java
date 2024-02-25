package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    public void testIsPalindrome_true() {
        assertTrue(IsPalindrome.isPalindrome(12321));
    }

    @Test
    public void testIsPalindrome_false() {
        assertFalse(IsPalindrome.isPalindrome(12312));
    }
}