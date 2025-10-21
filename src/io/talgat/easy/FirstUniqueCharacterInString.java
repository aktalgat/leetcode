package io.talgat.easy;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string
 */
public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        int[] indexes = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (indexes[c - 'a'] == 0) {
                indexes[c - 'a'] = i + 1;
            } else {
                indexes[c - 'a'] = -1;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (indexes[i] != 0 && indexes[i] != -1 && indexes[i] < min) {
                min = indexes[i];
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min - 1;
    }
}
