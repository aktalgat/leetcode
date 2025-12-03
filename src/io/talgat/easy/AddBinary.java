package io.talgat.easy;

/**
 * https://leetcode.com/problems/add-binary
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >=0 || j >= 0) {
            int a1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int b1 = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = a1 + b1 + carry;
            carry = sum / 2;
            sb.append(sum % 2);
            i--;
            j--;
        }
        if (carry == 1) sb.append(carry);
        return sb.reverse().toString();
    }
}
