package io.talgat.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lc = new LongestCommonPrefix();
        String[] strs = new String[] { "flower","flow","flight" };
        String res = lc.longestCommonPrefix(strs);
        System.out.println(res);

        String[] strs1 = new String[] { "dog","racecar","car" };
        String res1 = lc.longestCommonPrefix(strs1);
        System.out.println(res1);

        String[] strs2 = new String[] { "a" };
        String res2 = lc.longestCommonPrefix(strs2);
        System.out.println(res2);
    }

    public String longestCommonPrefix(String[] strs) {
        /*if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;*/

        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
