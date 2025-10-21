package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        IsomorphicStrings sut = new IsomorphicStrings();
        //String s = "badc";
        String s = "egcd";
        //String t = "baba";
        String t = "adfd";
        System.out.println("Result: " + sut.isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (mapS.containsKey(cs)) {
                if (mapS.get(cs) != ct) return false;
            } else {
                mapS.put(cs, ct);
            }
            if (mapT.containsKey(ct)) {
                if (mapT.get(ct) != cs) return false;
            } else {
                mapT.put(ct, cs);
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arrS = new int[256];
        int[] arrT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int cs = s.charAt(i);
            int ct = t.charAt(i);
            if (arrS[cs] != arrT[ct]) return false;
            arrS[cs] = i + 1;
            arrT[ct] = i + 1;
        }
        return true;
    }
}
