package io.talgat.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combinations
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int n, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < n + 1; i++) {
            path.add(i);
            backtrack(i + 1, k, n, path, result);
            path.removeLast();
        }
    }
}
