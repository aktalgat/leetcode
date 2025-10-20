package io.talgat.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        int[] a1 = new int[] {-1,0,1,2,-1,-4};
        System.out.println(t.threeSum2(a1));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right  = nums.length - 1;
            int rest = 0 - nums[i];
            while (left < right) {
                if (nums[left] + nums[right] < rest) {
                    left++;
                } else if (nums[left] + nums[right] > rest) {
                    right--;
                } else {
                    if (right == nums.length - 1 || nums[right] != nums[right + 1]) {
                        List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                        result.add(list);
                    }
                    left++;
                    right--;
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // skip similar i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            int rest = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum < rest) {
                    left++;
                } else if (sum > rest) {
                    right--;
                } else {
                    // found where sum = 0
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip similar left и right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }

        return result;
    }
}
