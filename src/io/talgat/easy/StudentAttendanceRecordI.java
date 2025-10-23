package io.talgat.easy;

/**
 * https://leetcode.com/problems/student-attendance-record-i
 */
public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        int absent = 0;
        boolean isLate = false;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == 'A') absent++;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == 'L' && arr[i] == 'L' && arr[i + 1] == 'L') {
                isLate = true;
                break;
            }
        }

        return absent < 2 && !isLate;
    }
}
