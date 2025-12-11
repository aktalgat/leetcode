package io.talgat.easy;

/**
 * https://leetcode.com/problems/duplicate-zeros
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        int i = arr.length - 1;
        int j = arr.length - 1 + zeros;
        while (i < j) {
            if (j < arr.length) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                j--;
                if (j < arr.length) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }
}
