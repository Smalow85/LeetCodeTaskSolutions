package org.example.easy;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] splitted = s.split(" ");
        return splitted[splitted.length - 1].length();
    }
}
