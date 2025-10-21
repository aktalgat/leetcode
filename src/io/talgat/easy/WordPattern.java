package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-pattern
 */
public class WordPattern {

    public static void main(String[] args) {
        WordPattern sut = new WordPattern();
        var pattern = "abba";
        var s = "dog cat cat dog";
        System.out.println("Result: " + sut.wordPattern(pattern, s));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        if (pattern.length() != words.length) return false;
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (patternMap.containsKey(c)) {
                if (!patternMap.get(c).equals(w)) return false;
            } else {
                patternMap.put(c, w);
            }
            if (wordMap.containsKey(w)) {
                if (!wordMap.get(w).equals(c)) return false;
            } else {
                wordMap.put(w, c);
            }
        }
        return true;
    }
}
