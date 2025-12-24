package io.talgat.easy;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int max = -1;
        int cur = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            cur = arr[i];
            arr[i] = max;
            max = Math.max(max, cur);
        }
        return arr;
    }
}
