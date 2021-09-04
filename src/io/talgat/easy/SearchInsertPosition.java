package io.talgat.easy;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int res1 = obj.searchInsert(new int[] { 1,3,5,6 }, 5);
        System.out.println("Result " + res1);

        int res2 = obj.searchInsert(new int[] { 1,3,5,6 }, 2);
        System.out.println("Result " + res2);

        int res3 = obj.searchInsert(new int[] { 1,3,5,6 }, 7);
        System.out.println("Result " + res3);

        int res4 = obj.searchInsert(new int[] { 1,3,5,6 }, 0);
        System.out.println("Result " + res4);

        int res5 = obj.searchInsert(new int[] { 1 }, 0);
        System.out.println("Result " + res5);
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    //binary search
}
