package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/keyboard-row
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (String word : words) {
            boolean all = true;
            if (first.contains(word.substring(0, 1).toLowerCase())) {
                for (int i = 0; i < word.length(); i++) {
                    if (!first.contains(word.substring(i, i + 1).toLowerCase())) {
                        all = false;
                    }
                }
                if (all) {
                    list.add(word);
                }
            }
            all = true;
            if (second.contains(word.substring(0, 1).toLowerCase())) {
                for (int i = 0; i < word.length(); i++) {
                    if (!second.contains(word.substring(i, i + 1).toLowerCase())) {
                        all = false;
                    }
                }
                if (all) {
                    list.add(word);
                }
            }
            all = true;
            if (third.contains(word.substring(0, 1).toLowerCase())) {
                for (int i = 0; i < word.length(); i++) {
                    if (!third.contains(word.substring(i, i + 1).toLowerCase())) {
                        all = false;
                    }
                }
                if (all) {
                    list.add(word);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
