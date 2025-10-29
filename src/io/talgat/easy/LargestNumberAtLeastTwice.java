package io.talgat.easy;

/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others
 */
public class LargestNumberAtLeastTwice {

    public static void main(String[] args) {
        LargestNumberAtLeastTwice sut = new LargestNumberAtLeastTwice();
        int[] nums = new int[] {3,6,1,0};
        System.out.println("Result: " + sut.dominantIndex(nums));
    }

    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        boolean isTwice = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (int n : nums) {
            if (n != max && n * 2 > max) {
                isTwice = false;
                break;
            }
        }
        return isTwice ? maxIndex : -1;
    }
}
