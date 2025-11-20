package io.talgat.easy;

/**
 * https://leetcode.com/problems/valid-perfect-square
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;
            if (sq == num) return true;
            if (sq < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
