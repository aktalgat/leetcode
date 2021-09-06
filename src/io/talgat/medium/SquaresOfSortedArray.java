package io.talgat.medium;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] res = new int[nums.length];
        int resIndex = nums.length - 1;

        while (start <= end) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                res[resIndex--] = nums[start] * nums[start];
                start++;
            } else {
                res[resIndex--] = nums[end] * nums[end];
                end--;
            }
        }

        return res;
    }
}
