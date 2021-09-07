package io.talgat.easy;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        char tmp;
        while (l <= r) {
            tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}
