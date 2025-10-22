package io.talgat.easy;

/**
 * https://leetcode.com/problems/repeated-substring-pattern/description/
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        String s2 = s + s;
        String trimmed = s2.substring(1, s2.length() - 1);
        return trimmed.contains(s);
    }
}
