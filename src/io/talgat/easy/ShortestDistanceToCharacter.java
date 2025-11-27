package io.talgat.easy;

/**
 * https://leetcode.com/problems/shortest-distance-to-a-character
 */
public class ShortestDistanceToCharacter {

    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int dist = Integer.MAX_VALUE / 2;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                dist = 0;
            } else {
                dist++;
            }
            result[i] = dist;
        }
        dist = Integer.MAX_VALUE / 2;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                dist = 0;
            } else {
                dist++;
            }
            result[i] = Math.min(result[i], dist);
        }
        return result;
    }
}
