package io.talgat.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/fair-candy-swap
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int n : aliceSizes) {
            sumA += n;
        }
        for (int n : bobSizes) {
            sumB += n;
        }
        int diff = (sumA - sumB) / 2;
        Set<Integer> setA = Arrays.stream(aliceSizes).boxed().collect(Collectors.toSet());
        int a = 0, b = 0;
        for (int n : bobSizes) {
            if (setA.contains(n + diff)) {
                a = n + diff;
                b = n;
                break;
            }
        }
        return new int[] {a, b};
    }
}
