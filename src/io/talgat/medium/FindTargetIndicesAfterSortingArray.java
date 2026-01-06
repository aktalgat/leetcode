package io.talgat.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-target-indices-after-sorting-array
 */
public class FindTargetIndicesAfterSortingArray {

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }
}
