package io.talgat.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/unique-binary-search-trees-ii
 */
public class UniqueBinarySearchTreesII {
    Map<String, List<TreeNode>> memo = new HashMap<>();

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return List.of();
        }
        return build(1, n);
    }

    private List<TreeNode> build(int lo, int hi) {
        String key = lo + "-" + hi;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        List<TreeNode> result = new ArrayList<>();
        if (lo > hi) {
            result.add(null);
            return result;
        }
        for (int root = lo; root <= hi; root++) {
            List<TreeNode> left = build(lo, root - 1);
            List<TreeNode> right = build(root + 1, hi);
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode rootNode = new TreeNode(root);
                    rootNode.left = leftNode;
                    rootNode.right = rightNode;
                    result.add(rootNode);
                }
            }
        }
        memo.put(key, result);
        return result;
    }
}
