package io.talgat.easy;

/**
 * https://leetcode.com/problems/arranging-coins
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        long left = 1;
        long right = n;
        long ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins = mid * (mid + 1) / 2;
            if (coins == n) {
                return (int) mid;
            }
            if (coins < n) {
                ans = mid;      // mid подходит — пробуем больше
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
}
