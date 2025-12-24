package io.talgat.easy;

/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero
 */
public class FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int idx = 0;
        for (int i = 1; i <= n / 2; i++) {
            arr[idx++] = i;
            arr[idx++] = -i;
        }
        if (n % 2 == 1) {
            arr[idx] = 0;
        }
        return arr;
    }
}
