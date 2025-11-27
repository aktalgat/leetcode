package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/positions-of-large-groups
 */
public class PositionsOfLargeGroups {

    public static void main(String[] args) {
        PositionsOfLargeGroups sut = new PositionsOfLargeGroups();
        String s = "abbxxxxzyy";
        String s1 = "aaa";
        int a = 67;
        System.out.println("Result: " + sut.largeGroupPositions(s1));
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int start = 0;
        int count  = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
             if (s.charAt(i) == c) {
                 count++;
            } else {
                if (count > 2) {
                    list.add(List.of(start, i - 1));
                }
                start = i;
                count = 1;
                c = s.charAt(i);
            }
        }
        if (count > 2) {
            list.add(List.of(start, s.length() - 1));
        }
        return list;
    }
}
