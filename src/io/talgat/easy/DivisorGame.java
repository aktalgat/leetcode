package io.talgat.easy;

/**
 * https://leetcode.com/problems/divisor-game
 */
public class DivisorGame {

    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    // DP
    public boolean divisorGame2(int n) {
        boolean[] dp = new boolean[n + 1];
        dp[1] = false;

        for (int i = 2; i <= n; i++) {
            for (int x = 1; x < i; x++) {
                if (i % x == 0 && !dp[i - x]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
