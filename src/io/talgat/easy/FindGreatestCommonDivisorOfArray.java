package io.talgat.easy;

/**
 * https://leetcode.com/problems/find-greatest-common-divisor-of-array
 */
public class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        int a = max;
        int b = min;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
