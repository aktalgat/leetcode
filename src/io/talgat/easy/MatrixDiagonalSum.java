package io.talgat.easy;

/**
 * https://leetcode.com/problems/matrix-diagonal-sum
 */
public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }
                if (i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        if (mat.length % 2 != 0) {
            int c = mat.length / 2;
            sum -= mat[c][c];
        }
        return sum;
    }
}
