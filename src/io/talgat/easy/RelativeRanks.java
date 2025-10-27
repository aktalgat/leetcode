package io.talgat.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/relative-ranks
 */
public class RelativeRanks {

    public static void main(String[] args) {
        RelativeRanks sut = new RelativeRanks();

    }

    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int[][] arr = new int[score.length][2];

        for (int i = 0; i < score.length; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < score.length; i++) {
            int index = arr[i][1];
            if (i == 0) result[index] = "Gold Medal";
            else if (i == 1) result[index] = "Silver Medal";
            else if (i == 2) result[index] = "Bronze Medal";
            else result[index] = String.valueOf(i + 1);
        }

        return result;
    }
}
