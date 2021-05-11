package io.talgat.easy;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones j = new JewelsAndStones();

        String jewels = "aA", stones = "aAAbbbb";
        int result = j.numJewelsInStones(jewels, stones);
        System.out.println(result);

        jewels = "z"; stones = "ZZ";
        result = j.numJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (jewels.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}
