package io.talgat.medium;

public class IntegerToRoman {

    public static void main(String[] args) {
        IntegerToRoman ir = new IntegerToRoman();
        int num = 58;
        String res = ir.intToRoman(num);
        System.out.println(res);
    }

    public String intToRoman(int num) {
        int[] nums = new int[] { 1000, 500, 100, 50, 10, 5, 1 };
        String[] strs = new String[] { "M", "D", "C", "L", "X", "V", "I" };
        int[] prevs = new int[] { 100, 100, 10, 10, 1, 1, 0 };
        String[] prevStrs = new String[] { "C", "C", "X", "X", "I", "I", "" };


        StringBuilder sb = new StringBuilder();
        int i = num, j = 0;
        while (i > 0) {
            if (i >= nums[j]) {
                i -= nums[j];
                sb.append(strs[j]);
            } else {
                if ((i / (nums[j] - prevs[j])) == 1) {
                    i -= (nums[j] - prevs[j]);
                    sb.append(prevStrs[j]);
                    sb.append(strs[j]);
                }
                if (nums[j] != 1) j++;
            }
        }

        return sb.toString();
    }
}
