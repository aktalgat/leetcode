package io.talgat.easy;

/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers
 */
public class SumOfRootToLeafBinaryNumbers {

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode node, int current) {
        if (node == null) return 0;
        current = (current << 1) | node.val;
        if (node.left == null && node.right == null) {
            return current;
        }
        return dfs(node.left, current) + dfs(node.right, current);
    }
}
