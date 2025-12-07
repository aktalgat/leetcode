package io.talgat.easy;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.stream().map(c -> c.toString()).collect(Collectors.joining(""));
    }

    public String removeDuplicates2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
