package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array
 */
public class ElementAppearingMoreThan25InSortedArray {

    public int findSpecialInteger(int[] arr) {
        int percent = arr.length / 4;
        System.out.println(percent);
        int result = arr[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > percent) {
                return e.getKey();
            }
        }
        return result;
    }

    // O(n)
    public int findSpecialInteger2(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > arr.length / 4) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        return arr[0];
    }
}
