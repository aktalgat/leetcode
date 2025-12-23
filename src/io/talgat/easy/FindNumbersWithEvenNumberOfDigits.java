package io.talgat.easy;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits
 */
public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0;
        int length = 0;
        for (int n : nums) {
            length = (int) Math.log10(n) + 1;
            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
