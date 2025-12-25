package io.talgat.easy;

/**
 * https://leetcode.com/problems/remove-palindromic-subsequences
 */
public class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        if (s == null || s.isEmpty()) return 0;
        boolean isPalindrome = true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome ? 1 : 2;
    }
}
