package io.talgat.easy;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String st = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = st.length() - 1; i >= 0; i--) {
            sb.append(st.charAt(i));
        }
        return st.equals(sb.toString());
    }
}
