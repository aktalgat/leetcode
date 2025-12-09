package io.talgat.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/minimize-string-length
 */
public class MinimizeStringLength {

    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
