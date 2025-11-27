package io.talgat.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/most-common-word
 */
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        String maxWord = "";
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        for (String w : map.keySet()) {
            if (set.contains(w)) continue;
            if (map.get(w) > max) {
                max = map.get(w);
                maxWord = w;
            }
        }
        return maxWord;
    }
}
