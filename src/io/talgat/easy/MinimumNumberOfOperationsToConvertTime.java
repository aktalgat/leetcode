package io.talgat.easy;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-convert-time
 */
public class MinimumNumberOfOperationsToConvertTime {

    public int convertTime(String current, String correct) {
        int currentMin = toMinutes(current);
        int correctMin = toMinutes(correct);
        int diff = correctMin - currentMin;
        int count = 0;
        int[] steps = new int[] {60, 15, 5, 1};
        for (int step : steps) {
            count += diff / step;
            diff %= step;
        }
        return count;
    }

    private int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
