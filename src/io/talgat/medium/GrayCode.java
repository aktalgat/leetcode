package io.talgat.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/gray-code
 */
public class GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                int newValue = result.get(j) + (1 << i);
                result.add(newValue);
            }
        }
        return result;
    }
}
