package io.talgat.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences
 */
public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split("\\s+");
        String[] arr2 = s2.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : arr2) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}
