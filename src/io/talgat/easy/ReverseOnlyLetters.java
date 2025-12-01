package io.talgat.easy;

/**
 * https://leetcode.com/problems/reverse-only-letters
 */
public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            char l = arr[left];
            if (!Character.isLetter(l)) {
                left++;
                continue;
            }
            char r = arr[right];
            if (!Character.isLetter(r)) {
                right--;
                continue;
            }
            arr[left] = r;
            arr[right] = l;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
