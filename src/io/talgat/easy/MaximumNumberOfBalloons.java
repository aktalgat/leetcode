package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-number-of-balloons
 */
public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        Map<Character, Integer> balloon = new HashMap<>();
        balloon.put('b', 1);
        balloon.put('a', 1);
        balloon.put('l', 2);
        balloon.put('o', 2);
        balloon.put('n', 1);
        for (Character c : balloon.keySet()) {
            if (!map.containsKey(c)) {
                return 0;
            }
            int count = map.get(c) / balloon.get(c);
            min = Math.min(min, count);
        }
        return min;
    }

    public int maxNumberOfBalloons2(String text) {
        int[] frequency = new int[26];
        for (char c : text.toCharArray()) {
            frequency[c - 'a']++;
        }
        int b = frequency['b' - 'a'];
        int a = frequency['a' - 'a'];
        int l = frequency['l' - 'a'] / 2;
        int o = frequency['o' - 'a'] / 2;
        int n = frequency['n' - 'a'];
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
