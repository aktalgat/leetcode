package io.talgat.easy;

/**
 * https://leetcode.com/problems/detect-capital
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase()) &&
                        word.substring(1).equals(word.substring(1).toLowerCase()));
    }
}
