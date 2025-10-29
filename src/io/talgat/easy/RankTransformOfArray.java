package io.talgat.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array
 */
public class RankTransformOfArray {
    
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], i + 1);
        }
        return Arrays.stream(arr).map(a -> map.get(a)).toArray();
    }
}
