package io.talgat.easy;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int res1 = obj.search(new int[] {-1,0,3,5,9,12}, 9);
        System.out.println(res1);

        int res2 = obj.search(new int[] {-1,0,3,5,9,12}, 2);
        System.out.println(res2);
    }

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                l = m + 1;
            }
            if (nums[m] > target) {
                r = m - 1;
            }
        }
        return -1;
    }
}
