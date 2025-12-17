package io.talgat.easy;

/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters
 */
public class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {
        int[] arr = counts(chars);
        int result = 0;
        for (String w : words) {
            int[] ct = counts(w);
            boolean ok = true;
            for (char c : w.toCharArray()) {
                if (ct[c - 'a'] > arr[c - 'a']) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                result += w.length();
            }
        }
        return result;
    }

    private int[] counts(String word) {
        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c - 'a']++;
        }
        return arr;
    }
}
