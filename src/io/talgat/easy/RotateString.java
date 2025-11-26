package io.talgat.easy;

/**
 * https://leetcode.com/problems/rotate-string
 */
public class RotateString {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
