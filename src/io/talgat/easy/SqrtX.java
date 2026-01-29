package io.talgat.easy;

/**
 * https://leetcode.com/problems/sqrtx
 */
public class SqrtX {

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (sqr == x) {
                return mid;
            }
            if (sqr < x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
