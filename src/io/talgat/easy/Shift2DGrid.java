package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total  = m * n;
        k = k % total;

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int oldIndex = (i * n + j - k + total) % total;
                int oldRow = oldIndex / n;
                int oldCol = oldIndex % n;
                row.add(grid[oldRow][oldCol]);
            }
            result.add(row);
        }
        return result;
    }
}
