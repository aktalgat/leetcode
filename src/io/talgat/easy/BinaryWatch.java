package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-watch
 */
public class BinaryWatch {

    public static void main(String[] args) {
        BinaryWatch sut = new BinaryWatch();
        int turnedOn = 1;
        System.out.println("Result: " + sut.readBinaryWatch(turnedOn));
    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return result;
    }
}
