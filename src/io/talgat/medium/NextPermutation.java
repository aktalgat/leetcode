package io.talgat.medium;

/**
 * https://leetcode.com/problems/next-permutation
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int p = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }
        if (p >= 0) {
            int t = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[p]) {
                    t = i;
                    break;
                }
            }
            int temp = nums[t];
            nums[t] = nums[p];
            nums[p] = temp;
        }
        reverse(nums, p + 1, nums.length - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        int temp;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
