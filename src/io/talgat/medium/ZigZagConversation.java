package io.talgat.medium;

/**
 * https://leetcode.com/problems/zigzag-conversion/
*/
public class ZigZagConversation {

    public static void main(String[] args) {
        ZigZagConversation zigZagConversation = new ZigZagConversation();
        String input = "AB";
        int rows = 1;
        String result = zigZagConversation.convert(input, rows);

        System.out.println(result);
    }

    public String convert(String s, int numRows) {
        if (s.length() == 0) return s;
        if (numRows == 1) return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        int n = 0;
        boolean a = true;

        for (int i = 0; i < s.length(); i++) {
            if (sbs[n] == null) sbs[n] = new StringBuilder();
            sbs[n].append(s.charAt(i));
            n = a ? n + 1 : n - 1;
            if (a && n == numRows - 1) a = false;
            if (!a && n == 0) a = true;
        }
        for (int i = 1; i < numRows; i++) {
            if (sbs[i] != null && sbs[i].length() > 0) {
                sbs[0].append(sbs[i]);
            }
        }

        return sbs[0].toString();
    }
}
