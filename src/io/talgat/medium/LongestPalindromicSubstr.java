package io.talgat.medium;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubstr {

    public static void main(String[] args) {
        LongestPalindromicSubstr ls = new LongestPalindromicSubstr();
        String s = "bababdhhhhhhfffff";
        String isPal = ls.longestPalindrome1(s);
        System.out.println(isPal);
        String s1 = "cbbd";
        String res = ls.longestPalindrome1(s1);
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

    public String longestPalindrome1(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            String len1 = extractAroundCenter(s, i, i);
            if (len1.length() > max.length()) {
                max = len1;
            }
            String len2 = extractAroundCenter(s, i, i + 1);
            if (len2.length() > max.length()) {
                max = len2;
            }
        }
        return max;
    }

    private String extractAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
