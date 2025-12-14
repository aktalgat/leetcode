package io.talgat.easy;

/**
 * https://leetcode.com/problems/number-of-equivalent-domino-pairs
 */
public class NumberOfEquivalentDominoPairs {

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int result = 0;
        for (int[] d : dominoes) {
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int key = a * 10 + b;
            result += count[key];
            count[key]++;
        }
        return result;
    }
}
