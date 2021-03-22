package io.talgat.easy;

public class LongestSubstrBetweenTwoEqChar {
    public static void main(String[] args) {
        LongestSubstrBetweenTwoEqChar ls = new LongestSubstrBetweenTwoEqChar();
        String s = "aa";
        int res = ls.maxLengthBetweenEqualCharacters(s);
        System.out.println(res);

        String s1 = "abca";
        int res1 = ls.maxLengthBetweenEqualCharacters(s1);
        System.out.println(res1);

        String s2 = "cbzxy";
        int res2 = ls.maxLengthBetweenEqualCharacters(s2);
        System.out.println(res2);

        String s3 = "cabbac";
        int res3 = ls.maxLengthBetweenEqualCharacters(s3);
        System.out.println(res3);

    }

    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;

        for (int i = 1; i < s.length(); i++) {
            char ci = s.charAt(i);
            for (int j = 0; j < i; j++) {
                char cj = s.charAt(j);
                if (ci == cj && i - j - 1 > max) {
                    max = i - j -1;
                }
            }
        }

        return max;
    }
}
