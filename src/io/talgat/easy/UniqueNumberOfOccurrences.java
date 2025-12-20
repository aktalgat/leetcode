package io.talgat.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences
 */
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int n : map.keySet()) {
            if (set.contains(map.get(n))) {
                return false;
            } else {
                set.add(map.get(n));
            }
        }
        return true;
    }
}
