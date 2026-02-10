package io.talgat.easy;

/**
 * https://leetcode.com/problems/symmetric-tree
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        boolean leftMirror = isMirror(left.left, right.right);
        boolean rightMirror = isMirror(left.right, right.left);
        return leftMirror && rightMirror;
    }
}
