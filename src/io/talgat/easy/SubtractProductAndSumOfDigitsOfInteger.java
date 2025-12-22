package io.talgat.easy;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
 */
public class SubtractProductAndSumOfDigitsOfInteger {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int t = n % 10;
            product *= t;
            sum += t;
            n /= 10;
        }

        return product - sum;
    }
}
