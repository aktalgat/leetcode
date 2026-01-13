package io.talgat.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        byte[] used = new byte[nums.length];
        backtrack(0, nums, used, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, byte[] used, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1) {
                continue;
            }
            used[i] = 1;
            path.add(nums[i]);
            backtrack(i, nums, used, path, result);
            path.removeLast();
            used[i] = 0;
        }
    }
}
