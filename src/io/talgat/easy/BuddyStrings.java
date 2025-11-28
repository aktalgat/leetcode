package io.talgat.easy;

/**
 * https://leetcode.com/problems/buddy-strings
 */
public class BuddyStrings {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            int[] arr = new int[26];
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
                if (arr[c - 'a'] >= 2) {
                    return true;
                }
            }
            return false;
        }
        int a = -1, b = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (a == -1) {
                    a = i;
                } else if (b == -1) {
                    b = i;
                } else {
                    return false;
                }
            }
        }
        if (a != -1 && b != -1) {
            return s.charAt(a) == goal.charAt(b) && s.charAt(b) == goal.charAt(a);
        }
        return false;
    }
}
