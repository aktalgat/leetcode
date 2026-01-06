package io.talgat.medium;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        if (nums.length == 0) return result;
        int left = 0;
        int right = nums.length - 1;
        int leftIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) {
                leftIndex = mid;
            }
        }
        if (leftIndex == -1) return result;
        left = 0;
        right = nums.length - 1;
        int rightIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                rightIndex = mid;
            }
        }
        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;
    }
}
