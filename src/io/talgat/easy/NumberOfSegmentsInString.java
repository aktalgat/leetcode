package io.talgat.easy;

/**
 * https://leetcode.com/problems/number-of-segments-in-a-string
 */
public class NumberOfSegmentsInString {

    public int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        boolean isWord = false;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        return count;
    }
}
