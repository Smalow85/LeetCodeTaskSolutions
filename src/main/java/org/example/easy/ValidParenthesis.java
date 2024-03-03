package org.example.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Map<String, String> parenthesis = Map.of("(", ")",
                "[", "]",
                "{", "}");
        Map<String, String> parenthesisClosing = Map.of(")", "(",
                "]", "[",
                "}", "{");

        Map<String, Integer> result = new HashMap<>();

        String[] symbols = s.split("");
        for (String str : symbols) {
            if (parenthesis.containsKey(str)) {
                if (result.get(str) != null) {
                    int current = result.get(str);
                    result.put(str, ++current);
                } else {
                    result.put(str, 1);
                }
            }
            if (parenthesisClosing.containsKey(str)) {
                String opening = parenthesisClosing.get(str);
                if (result.get(opening) == null) {
                    return false;
                } else {
                    int current = result.get(opening);
                    result.put(opening, --current);
                }
            }

        }
        System.out.println(result);
        return result.values().stream().noneMatch(i -> i > 0);
    }

    public static boolean isValidUsingStack(String s) {
        Map<String, String> parenthesis = Map.of("(", ")",
                "[", "]",
                "{", "}");
        Map<String, String> parenthesisClosing = Map.of(")", "(",
                "]", "[",
                "}", "{");
        Stack<String> stack = new Stack<>();
        for (String str : s.split("")) {
            if (parenthesis.containsKey(str)) {
                stack.add(str);
            } else {
                String opening = parenthesisClosing.get(str);
                if (!stack.isEmpty() && stack.peek().equals(opening)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
