package io.talgat.easy;

/**
 * https://leetcode.com/problems/add-strings
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum = 0, carry = 0;
        while (i >= 0 || j >= 0) {
            int n1 = 0;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            }
            int n2 = 0;
            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
            }
            sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
