package io.talgat.easy;

/**
 * https://leetcode.com/problems/ugly-number
 */
public class UglyNumber {

    public static void main(String[] args) {
        UglyNumber sut = new UglyNumber();
        int n = 6;
        System.out.println("Result: " + sut.isUgly(n));
    }

    public boolean isUgly(int n) {
        if (n < 0) return false;
        if (n == 1) return true;
        int r = n;
        while (r % 2 == 0) {
            r = r / 2;
        }
        while (r % 3 == 0) {
            r = r / 3;
        }
        while (r % 5 == 0) {
            r = r / 5;
        }
        return r == 1;
    }
}
