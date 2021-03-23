package io.talgat.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();

        String s1 = "()";
        System.out.println(v.isValid(s1));

        String s2 = "()[]{}";
        System.out.println(v.isValid(s2));

        String s3 = "(]";
        System.out.println(v.isValid(s3));

        String s4 = "([)]";
        System.out.println(v.isValid(s4));

        String s5 = "{[]}";
        System.out.println(v.isValid(s5));
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') {
                stack.push(cur);
            } else if (cur == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (cur == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (cur == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
