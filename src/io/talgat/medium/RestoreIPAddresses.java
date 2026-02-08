package io.talgat.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/restore-ip-addresses
 */
public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(s, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int pos, int part, List<String> path, List<String> result) {
        int remaining = s.length() - pos;
        int partsLeft = 4 - part;
        if (remaining < partsLeft || remaining > partsLeft * 3) {
            return;
        }
        if (part == 4) {
            if (pos == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }
        for (int len = 1; len <= 3; len++) {
            if (pos + len > s.length()) break;
            if (len > 1 && s.charAt(pos) == '0') break;
            int val = 0;
            for (int i = pos; i < pos + len; i++) {
                val = val * 10 + (s.charAt(i) - '0');
            }
            if (val > 255) continue;
            path.add(s.substring(pos, pos + len));
            backtrack(s, pos + len, part + 1, path, result);
            path.removeLast();
        }
    }
}
