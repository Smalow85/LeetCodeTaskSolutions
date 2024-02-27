package org.example.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();

        /*StringBuilder res = new StringBuilder();
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        for (int j = 0; j < minLength; j++) {
            String temp = String.valueOf(strs[0].charAt(j));
            for (int k = 1; k < strs.length; k++) {
                if (!String.valueOf(strs[k].charAt(j)).equals(temp)) {
                    temp = "";
                }
            }
            if (temp.length() > 0) {
                res.append(temp);
            } else {
                break;
            }
        }
        return res.toString();*/
    }
}
