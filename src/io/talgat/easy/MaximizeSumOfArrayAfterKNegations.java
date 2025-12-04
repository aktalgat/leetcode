package io.talgat.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations
 */
public class MaximizeSumOfArrayAfterKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            if (Math.abs(nums[i]) < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        if (k > 0 && min != 0 && k % 2 != 0) {
            nums[minIndex] = -1 * nums[minIndex];
        }
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }
}
