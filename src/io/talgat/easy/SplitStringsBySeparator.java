package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/split-strings-by-separator
 */
public class SplitStringsBySeparator {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            for (char c : w.toCharArray()) {
                if (c == separator) {
                    if (!sb.isEmpty()) {
                        result.add(sb.toString());
                    }
                    sb.setLength(0);
                } else {
                    sb.append(c);
                }
            }
            if (!sb.isEmpty()) {
                result.add(sb.toString());
            }
            sb.setLength(0);
        }
        return result;
    }
}
