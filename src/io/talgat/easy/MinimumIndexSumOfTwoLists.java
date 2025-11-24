package io.talgat.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists
 */
public class MinimumIndexSumOfTwoLists {

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists sut = new MinimumIndexSumOfTwoLists();
        String[] list1 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        System.out.println("Result: " + Arrays.toString(sut.findRestaurant(list1, list2)));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);
                if (sum < minSum) {
                    result.clear();
                    result.add(list2[i]);
                    minSum = sum;
                } else if (sum == minSum) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
