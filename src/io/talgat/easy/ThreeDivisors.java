package io.talgat.easy;

/**
 * https://leetcode.com/problems/three-divisors
 */
public class ThreeDivisors {

    public boolean isThree(int n) {
        long sqrt = (long) Math.sqrt(n);
        if (sqrt * sqrt != n) {
            return false;
        }
        if (sqrt < 2) {
            return false;
        }
        for (int i = 2; i * i <= sqrt; i++) {
            if (sqrt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
