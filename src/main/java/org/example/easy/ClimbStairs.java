package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
    public static int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    private static int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }
}
