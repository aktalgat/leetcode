package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/occurrences-after-bigram
 */
public class OccurrencesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                list.add(words[i + 2]);
            }
        }
        return list.toArray(new String[0]);
    }
}
