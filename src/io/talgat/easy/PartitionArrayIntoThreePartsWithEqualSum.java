package io.talgat.easy;

/**
 * https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum
 */
public class PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int count = 0;
        int current = 0;
        int part = sum / 3;
        for (int i = 0; i < arr.length; i++) {
            current += arr[i];
            if (current == part) {
                count++;
                current = 0;
                if (count == 2 && i < arr.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
