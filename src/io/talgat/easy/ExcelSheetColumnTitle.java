package io.talgat.easy;

/**
 * https://leetcode.com/problems/excel-sheet-column-title
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remain = columnNumber % 26;
            sb.append((char) ('A' + remain));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
