package io.talgat.easy;

public class LicenseKeyFormatting {

    public static void main(String[] args) {
        LicenseKeyFormatting sut = new LicenseKeyFormatting();
        var input = "2-4A0r7-4k";
        int k = 4;
        System.out.println("Result: " + sut.licenseKeyFormatting(input, k));
    }

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        var s2 = s.replace("-", "").toUpperCase();
        for (int i = s2.length() - 1; i >= 0; i--) {
            sb.append(s2.substring(i, i + 1));
            count++;
            if (count == k && i != 0) {
                sb.append("-");
                count = 0;
            }
        }
        return sb.reverse().toString();
    }
}
