package io.talgat.medium;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater cs = new ContainerWithMostWater();
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        int res = cs.maxArea(height);
        System.out.println(res);

        int[] height1 = new int[] {2,1};
        int res1 = cs.maxArea(height1);
        System.out.println(res1);
    }

    public int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                int y = Math.min(height[i], height[j]);
                int x = i - j;
                int volume = x * y;
                if (volume > max) {
                    max = volume;
                }
            }
        }

        return max;
    }
}
