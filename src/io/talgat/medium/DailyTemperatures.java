package io.talgat.medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures
 */
public class DailyTemperatures {

    public static void main(String[] args) {
        DailyTemperatures sut = new DailyTemperatures();
        int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
        System.out.println("Result: " + Arrays.toString(sut.dailyTemperatures(temperatures)));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
}
