package org.example.easy;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (s.length() == 0) {
            return false;
        }
        int max = s.length() - 1;
        for (int i = 0; i < max; i++) {
            if (s.charAt(i) != s.charAt(max - i)) {
                return false;
            }
        }
        return true;
    }
}
