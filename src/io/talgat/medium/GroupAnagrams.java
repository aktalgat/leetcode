package io.talgat.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams sut = new GroupAnagrams();
        String[] strs = new String[] { "eat","tea","tan","ate","nat","bat" };
        System.out.println("Res: " + sut.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] counts = new int[26];
            for (char c : s.toCharArray()) {
                counts[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i)).append(counts[i]);
                }
            }
            map.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
