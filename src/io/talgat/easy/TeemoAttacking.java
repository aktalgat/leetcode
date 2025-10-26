package io.talgat.easy;

/**
 * https://leetcode.com/problems/teemo-attacking
 */
public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        int count = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            count += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        return count + duration;
    }
}
