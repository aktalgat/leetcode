package io.talgat.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int curStart = intervals[i][0];
            int curEnd = intervals[i][1];
            if (curStart <= end) {
                end = Math.max(end, curEnd);
            } else {
                list.add(new int[] {start, end});
                start = curStart;
                end = curEnd;
            }
        }
        list.add(new int[] {start, end});
        return list.toArray(new int[list.size()][]);
    }
}
