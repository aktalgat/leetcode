package io.talgat.medium;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii
 */
public class SearchRotatedSortedArrayII {
    // brute force
    public boolean search(int[] nums, int target) {
        for (int n : nums) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }

    // binary search
    public boolean search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
