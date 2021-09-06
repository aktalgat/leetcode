package io.talgat.medium;

/**
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        int mid = k % nums.length;
        reverse(nums, 0, nums.length - mid - 1);
        reverse(nums, nums.length - mid, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        int tmp = 0;
        while (start < end) {
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
