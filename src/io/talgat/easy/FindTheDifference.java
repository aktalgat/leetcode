package io.talgat.easy;

/**
 * https://leetcode.com/problems/find-the-difference
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;
        for (char c : s.toCharArray()) sumS += c;
        for (char c : t.toCharArray()) sumT += c;
        return (char)(sumT - sumS);
    }
}
