package io.talgat.easy;

/**
 * https://leetcode.com/problems/verifying-an-alien-dictionary
 */
public class VerifyingAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        int[] pos = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            pos[c - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            if (!isSorted(word1, word2, pos)) {
                return false;
            }
        }
        return true;
    }

    public boolean isSorted(String w1, String w2, int[] pos) {
        int len = Math.min(w1.length(), w2.length());
        for (int j = 0; j < len; j++) {
            char c1 = w1.charAt(j);
            char c2 = w2.charAt(j);
            if (c1 != c2) {
                return pos[c1 - 'a'] < pos[c2 - 'a'];
            }
        }
        return w1.length() <= w2.length();
    }
}
