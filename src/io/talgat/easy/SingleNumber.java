package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/single-number
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : map.keySet()) {
            if (map.get(n) == 1) {
                res = n;
                break;
            }
        }
        return res;
    }

    public int singleNumber2(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;
    }
}
