package io.talgat.easy;

/**
 * https://leetcode.com/problems/smallest-even-multiple
 */
public class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
}
