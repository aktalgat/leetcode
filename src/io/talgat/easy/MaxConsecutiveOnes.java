package io.talgat.easy;

/**
 * https://leetcode.com/problems/max-consecutive-ones
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cons = 0;
        for (int n : nums) {
            if (n == 1) {
                cons++;
            } else {
                max = Math.max(max, cons);
                cons = 0;
            }
        }
        return Math.max(max, cons);
    }
}
