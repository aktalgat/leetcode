package io.talgat.medium;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2SortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int sum = 0;
        while (l <= r) {
            sum = numbers[l] + numbers[r];
            if (sum == target) {
                break;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[] {l + 1, r + 1};
    }
}
