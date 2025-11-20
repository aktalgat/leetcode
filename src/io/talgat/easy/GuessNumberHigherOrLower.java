package io.talgat.easy;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower
 */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            }
            if (g == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private int guess(int num) {
        return 0;
    }
}
