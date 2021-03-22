package io.talgat.medium;

public class StringToInteger {
    public static void main(String[] args) {
        StringToInteger si = new StringToInteger();
        String s = "0-1";
        int result = si.myAtoi(s);
        System.out.println(result);
        String s1 = "  0000000000012345678";
        int result1 = si.myAtoi(s1);
        System.out.println(result1);
        String s2 = "  -42";
        int result2 = si.myAtoi(s2);
        System.out.println(result2);
        String s3 = "-13+2";
        int result3 = si.myAtoi(s3);
        System.out.println(result3);
        String s4 = "123-";
        int result4 = si.myAtoi(s4);
        System.out.println(result4);
    }

    public int myAtoi(String str) {
        String s = str.trim();
        if (s.isEmpty()) return 0;
        StringBuilder sb = new StringBuilder();
        boolean isMinus = false, isPlus = false, isNoneZero = false, isZeroStart = s.charAt(0) == '0';
        int n = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') { n = i; break;}
        }
        String s1 = s.substring(n);
        if (s1.isEmpty()) return 0;

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (Character.isDigit(c)) {
                if (c != '0') {
                    sb.append(c);
                    isNoneZero = true;
                } else {
                    if (isNoneZero) sb.append(c);
                }
            } else if (c == '-') {
                if (isPlus || isMinus || sb.length() != 0) break;
                isMinus = true;
            } else if (c == '+') {
                if (isMinus || isPlus || sb.length() != 0) break;
                isPlus = true;
            } else {
                break;
            }
        }
        if (sb.length() == 0) return 0;
        if (isZeroStart && (isMinus || isPlus)) return 0;

        long res;
        if (sb.length() <= 12) {
            res = Long.parseLong(sb.toString());
        } else {
            return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        res = isMinus ? res * -1 : res;
        if (res >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (res <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) res;
    }
}
