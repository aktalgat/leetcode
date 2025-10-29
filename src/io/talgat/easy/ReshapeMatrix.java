package io.talgat.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reshape-the-matrix
 */
public class ReshapeMatrix {

    public static void main(String[] args) {
        ReshapeMatrix sut = new ReshapeMatrix();
        int[][] mat = new int[][] {{1,2},{3,4}};
        System.out.println("Result: " + Arrays.deepToString(sut.matrixReshape(mat, 1, 4)));
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int a = mat.length;
        int b = mat[0].length;
        if (a * b != r * c) return mat;

        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;
    }
}
