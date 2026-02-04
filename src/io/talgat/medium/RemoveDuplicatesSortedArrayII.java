package io.talgat.medium;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
 */
public class RemoveDuplicatesSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int write = 2;
        for (int read = 2; read < nums.length; read++) {
            if (nums[read] != nums[write - 2]) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}
