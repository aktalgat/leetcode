package io.talgat.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome sut = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean res = sut.isPalindrome(s);
        System.out.println("res = " + res);
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }

    // two pointers
    public boolean isPalindrome2(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while ()
        }
        return true;
    }
}
