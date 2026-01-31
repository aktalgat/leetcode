package io.talgat.medium;

import java.util.Stack;

/**
 * https://leetcode.com/problems/simplify-path
 */
public class SimplifyPath {

    static void main() {
        SimplifyPath ss = new SimplifyPath();
        String str = "/home/user/Documents/../Pictures";
        System.out.println(ss.simplifyPath(str));
    }

    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : arr) {
            switch (s) {
                case "" -> {
                    continue;
                }
                case ".." -> {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
                case "." -> {
                }
                default -> stack.push(s);
            }
        }
        return "/" + String.join("/", stack);
    }
}
