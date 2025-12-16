package io.talgat.easy;

/**
 * https://leetcode.com/problems/distribute-candies-to-people
 */
public class DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int give = 1;
        int i = 0;
        while (candies > 0) {
            int idx = i % num_people;
            int cur = Math.min(give, candies);
            res[idx] += cur;
            candies -= cur;
            give++;
            i++;
        }
        return res;
    }
}
