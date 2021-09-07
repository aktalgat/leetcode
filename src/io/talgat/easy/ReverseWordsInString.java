package io.talgat.easy;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] array = s.split("\\s");
        char tmp;
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            int l = 0, r = charArray.length - 1;
            while (l <= r) {
                tmp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = tmp;
                l++;
                r--;
            }
            array[i] = new String(charArray);
        }

        return String.join(" ", array);
    }
}
