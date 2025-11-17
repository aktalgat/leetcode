package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *  https://leetcode.com/problems/contains-duplicate-ii
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int d = Math.abs(i - map.get(nums[i]));
                if (d <= k) return true;
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
