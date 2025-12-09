package io.talgat.medium;

import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii
 */
public class RemoveAllAdjacentDuplicatesInStringII {

    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] ==c) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            } else {
                stack.push(new int[] {c, 1});
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int[] it : stack) {
            sb.append(String.valueOf((char) it[0]).repeat(it[1]));
        }
        return sb.toString();
    }
}
