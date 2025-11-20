package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element
 */
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement sut = new MajorityElement();
        int[] nums = new int[] {3,2,3};
        System.out.println("Result: " + sut.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int max = 0;
        int result = 0;
        for (int n : map.keySet()) {
            if (map.get(n) > max) {
                max = map.get(n);
                result = n;
            }
        }
        return result;
    }
}
