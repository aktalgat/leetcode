package io.talgat.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger rm = new RomanToInteger();
        String s = "XV";
        int res = rm.romanToInt(s);
        System.out.println(res);
    }

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        Map<String, String> prev = new HashMap<>();
        prev.put("V", "I");
        prev.put("X", "I");
        prev.put("L", "X");
        prev.put("C", "X");
        prev.put("D", "C");
        prev.put("M", "C");

        int sum = 0, i = s.length();

        while (i > 0) {
            String cur = s.substring(i - 1, i);
            sum += map.get(cur);
            if (i - 2 >= 0) {
                String pr = s.substring(i - 2, i - 1);
                if (prev.get(cur) != null && prev.get(cur).equals(pr)) {
                    sum -= map.get(pr);
                    i--;
                }
            }
            i--;
        }
        return sum;
    }
}
