package io.talgat.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            if (set.contains(n) && !list.contains(n)) {
                list.add(n);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
