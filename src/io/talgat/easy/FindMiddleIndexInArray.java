package io.talgat.easy;

/**
 * https://leetcode.com/problems/find-the-middle-index-in-array
 */
public class FindMiddleIndexInArray {

    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
