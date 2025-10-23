package io.talgat.easy;

/**
 * https://leetcode.com/problems/robot-return-to-origin
 */
public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L' ) left++;
            if (c == 'R') right++;
            if (c == 'U') up++;
            if (c == 'D') down++;
        }
        return left == right && up == down;
    }
}
