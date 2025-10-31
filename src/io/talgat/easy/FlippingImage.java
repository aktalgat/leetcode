package io.talgat.easy;

/**
 * https://leetcode.com/problems/flipping-an-image
 */
public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        int col = 0, row = 0;
        for (int i = 0; i < image.length; i++) {
            for (int j = image[i].length -1; j >= 0; j--) {
                result[col][row++] = image[i][j];
            }
            col++;
            row = 0;
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                result[i][j] = result[i][j] == 0 ? 1 : 0;
            }
        }

        return result;
    }
}
