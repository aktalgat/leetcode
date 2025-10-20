package io.talgat.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k
 */
public class SubarraySumEqualsK {

    public static void main(String[] args) {
        SubarraySumEqualsK sut = new SubarraySumEqualsK();
        int[] input = new int[] {1, 2, 3};
        int k = 3;
        System.out.println("Result: " + sut.subarraySum2(input, k));
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }
        return count;
    }

    public int subarraySum2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int count = 0;
        for (int n : nums) {
            prefix += n;
            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
