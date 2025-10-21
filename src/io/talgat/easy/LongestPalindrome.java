package io.talgat.easy;

/**
 * https://leetcode.com/problems/longest-palindrome
 */
public class LongestPalindrome {
    
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] frequencies = new int[128];
        for (char c : s.toCharArray()) {
            frequencies[c]++;
        }
        int length = 0;
        boolean hasOdd = false;
        for (int f : frequencies) {
            length += (f / 2) * 2;
            if (f % 2 == 1) hasOdd = true;
        }
        if (hasOdd) length += 1;
        return length;
    }
}
