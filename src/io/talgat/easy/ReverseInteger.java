package io.talgat.easy;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        String st = String.valueOf(x).replace("-", "");
        StringBuilder sb = new StringBuilder();
        int result = 0;
        for (int i = st.length() - 1; i >= 0; i--) {
            sb.append(String.valueOf(st.charAt(i)));
        }
        try {
            result = Integer.parseInt(sb.toString());
        } catch (NumberFormatException ex) {
            result = 0;
        }
        return isNegative ? -1 * result : result;
    }
}
