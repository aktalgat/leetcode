package io.talgat.medium;

/**
 * https://leetcode.com/problems/divide-two-integers
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long result = 0;
        while (a >= b) {
            long temp = b;
            long m = 1;
            while ((temp << 1) <= a) {
                temp = temp << 1;
                m = m << 1;
            }
            a -= temp;
            result += m;
        }

        return isNegative ? (int) -result : (int) result;
    }
}
