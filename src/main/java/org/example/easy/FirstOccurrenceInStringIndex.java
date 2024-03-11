package org.example.easy;

public class FirstOccurrenceInStringIndex {

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        String temp = haystack;
        for (int i = 0; i < haystack.length(); i++) {
           if (temp.startsWith(needle)) {
               return i;
           } else {
               temp = haystack.substring(i + 1, haystack.length());
           }
        }
        return -1;
    }
}
