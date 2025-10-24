package io.talgat.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/goat-latin
 */
public class GoatLatin {

    public static void main(String[] args) {
        GoatLatin sut = new GoatLatin();
        var input = "I speak Goat Latin";
        System.out.println("Result: " + sut.toGoatLatin(input));
    }

    public String toGoatLatin(String sentence) {
        Set<Character> vowelSet = new HashSet();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');
        String[] words = sentence.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (s.isEmpty()) continue;
            if (vowelSet.contains(s.charAt(0))) {
                sb.append(s);
            } else {
                sb.append(s.substring(1)).append(s.substring(0, 1));
            }
            sb.append("ma");
            for (int j = 0; j < i + 1; j++) sb.append("a");
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
