package io.talgat.easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        var sut = new LengthOfLastWord();
        String input = "luffy is still joyboy";
        int res = sut.lengthOfLastWord(input);

        System.out.println(res);
    }

    public int lengthOfLastWord(String s) {
        String[] arr = s.split("\s");

        return arr[arr.length - 1].length();
    }
}
