package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-harmonious-subsequence
 */
public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {
        LongestHarmoniousSubsequence sut = new LongestHarmoniousSubsequence();
    }

    public int findHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int maxLen = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int len = map.get(key) + map.get(key + 1);
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
