package io.talgat.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/degree-of-an-array
 */
public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            count.put(n, count.getOrDefault(n, 0) + 1);
            if (!first.containsKey(n)) {
                first.put(n, i);
            }
            last.put(n, i);
        }
        int degree = Collections.max(count.values());
        int minLength = nums.length;
        for (int n : count.keySet()) {
            if (count.get(n) == degree) {
                int length = last.get(n) - first.get(n) + 1;
                minLength = Math.min(minLength, length);
            }
        }
        return minLength;
    }
}
