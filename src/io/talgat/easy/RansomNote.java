package io.talgat.easy;

/**
 * https://leetcode.com/problems/ransom-note
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            counts[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (counts[c - 'a'] == 0) {
                return false;
            } else {
                counts[c - 'a']--;
            }
        }
        return true;
    }
}
