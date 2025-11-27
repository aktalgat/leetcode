package io.talgat.easy;

/**
 * https://leetcode.com/problems/number-of-lines-to-write-string
 */
public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int lineCount = 1;
        int curWidth = 0;
        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            if (curWidth + width > 100) {
                lineCount++;
                curWidth = width;
            } else {
                curWidth += width;
            }
        }
        return new int[] {lineCount, curWidth};
    }
}
