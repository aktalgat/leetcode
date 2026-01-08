package io.talgat.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int startIndex, int remain, List<Integer> path, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (remain < 0) {
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(candidates, i, remain - candidates[i], path, result);
            path.remove(path.size() - 1);
        }
    }
}
