package io.talgat.easy;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        ImplementStrStr imp = new ImplementStrStr();
        int res1 = imp.strStr("hello", "ll");
        System.out.println("Result " + res1);

        int res2 = imp.strStr("aaaaa", "bba");
        System.out.println("Result " + res2);

        int res3 = imp.strStr("", "");
        System.out.println("Result " + res3);

        int res4 = imp.strStr("mississippi", "issip");
        System.out.println("Result " + res4);
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();

        int j = 0;
        for (int i = 0; i < haystackArray.length; i++) {
            if (haystackArray[i] == needleArray[j]) {
                int i1 = i;
                while (i1 < haystackArray.length && j < needleArray.length) {
                    if (haystackArray[i1] != needleArray[j]) {
                        break;
                    }
                    i1++;
                    j++;
                }
                if (j == needleArray.length) {
                    return i;
                }
                j = 0;
            }
        }

        return -1;
    }
}
