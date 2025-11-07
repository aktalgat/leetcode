package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers
 */
public class SelfDividingNumbers {

    public static void main(String[] args) {
        SelfDividingNumbers sut = new SelfDividingNumbers();
        int left = 1; int right = 22;
        System.out.println("Result: " + sut.selfDividingNumbers(left, right));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) result.add(i);
        }
        return result;
    }

    public boolean isSelfDividing(int number) {
        String s = String.valueOf(number);
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            if (n == 0) return false;
            if (number % n != 0) return false;
        }
        return true;
    }
}
