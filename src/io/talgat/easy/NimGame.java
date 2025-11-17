package io.talgat.easy;

/**
 * https://leetcode.com/problems/nim-game
 */
public class NimGame {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
