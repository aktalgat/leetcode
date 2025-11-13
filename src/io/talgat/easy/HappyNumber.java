package io.talgat.easy;

/**
 * https://leetcode.com/problems/happy-number
 */
public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber sut = new HappyNumber();
        int n = 199;
        System.out.println("Result: " + sut.isHappy(n));
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private int sumOfSquare(int x) {
        int sum = 0;
        while (x > 0) {
            int d = x % 10;
            sum += d * d;
            x /= 10;
        }
        return sum;
    }
}
