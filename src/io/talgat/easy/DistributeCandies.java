package io.talgat.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/distribute-candies
 */
public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = Arrays.stream(candyType).boxed().collect(Collectors.toSet());
        return Math.min(candyType.length / 2, set.size());
    }
}
