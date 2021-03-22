package io.talgat.medium;

public class LongestPalindromicSubstr {

    public static void main(String[] args) {
        LongestPalindromicSubstr ls = new LongestPalindromicSubstr();
        String s = "bababd";
        String isPal = ls.longestPalindrome(s);
        System.out.println(isPal);
        String s1 = "cbbd";
        String res = ls.longestPalindrome(s1);
        System.out.println(res);
    }

    public String longestPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return s;
        }

        int len = s.length();
        String ans = "";
        int max = 0;
        boolean[][] res = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                boolean con = s.charAt(i) == s.charAt(j);
                res[j][i] = i - j > 2 ? con && res[j + 1][i - 1] : con;

                if (res[j][i] && i - j + 1 > max) {
                    max = i - j + 1;
                    ans = s.substring(j, i + 1);
                }
            }
        }
        return ans;
    }
}
