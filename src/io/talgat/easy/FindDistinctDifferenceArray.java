package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-the-distinct-difference-array
 */
public class FindDistinctDifferenceArray {

    public int[] distinctDifferenceArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> prefix = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            prefix.put(n, prefix.getOrDefault(n, 0) + 1);
            freq.put(n, freq.get(n) - 1);
            if (freq.get(n) == 0) {
                freq.remove(n);
            }
            result[i] = prefix.size() - freq.size();
        }
        return result;
    }
}
