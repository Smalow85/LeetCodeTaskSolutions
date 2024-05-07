package org.example.easy;

import java.util.Arrays;

public class AddBinary {

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        char [] aArr = a.toCharArray();
        char [] bArr = b.toCharArray();
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += aArr[i] - '0';
                i--;
            }
            if (j >= 0) {
                sum += bArr[j] - '0';
                j--;
            }

            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if (carry > 0) {
            res.append(carry);
        }
        res.reverse();
        return res.toString();
    }
}
