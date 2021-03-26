package io.talgat.easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesInArray {

    public static void main(String[] args) {
        RemoveDuplicatesInArray r = new RemoveDuplicatesInArray();
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(r.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length - 1];

        return j;
    }
}
