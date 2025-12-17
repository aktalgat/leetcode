package io.talgat.easy;

/**
 * https://leetcode.com/problems/day-of-the-year
 */
public class DayOfYear {

    public int dayOfYear(String date) {
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        int[] days = new int[] {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        //leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            days[1] += 1;
        }

        int result = day;
        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }
        return result;
    }
}
