package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    @Test
    public void testIsValid() {
        String s = "((()[]{}))";
        assertTrue(ValidParenthesis.isValid(s));
    }

    @Test
    public void testIsValid2() {
        String s = "()";
        assertTrue(ValidParenthesis.isValid(s));
    }

    @Test
    public void testIsValid3() {
        String s = "(){]";
        assertFalse(ValidParenthesis.isValid(s));
    }

    @Test
    public void testIsValid4() {
        String s = "(){]";
        assertFalse(ValidParenthesis.isValidUsingStack(s));
    }

    @Test
    public void testIsValid5() {
        String s = "]";
        assertFalse(ValidParenthesis.isValidUsingStack(s));
    }
}