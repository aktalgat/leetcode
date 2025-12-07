package io.talgat.easy;

/**
 * https://leetcode.com/problems/left-and-right-sum-differences
 */
public class LeftAndRightSumDifferences {

    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return result;
    }
}
