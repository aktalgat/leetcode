package io.talgat.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string
 */
public class ReverseVowelsOfString {

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char[] arr = s.toCharArray();
        while (left < right) {
            if (!vowels.contains(arr[left])) {
                left++;
            }
            if (!vowels.contains(arr[right])) {
                right--;
            }
            if (vowels.contains(arr[left]) && vowels.contains(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
}
