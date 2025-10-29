package io.talgat.easy;

public class ImageSmoother {

    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                int sum = img[i][j];
                int count = 1;
                if (i > 0) {
                    sum += img[i - 1][j];
                    count++;
                }
                if (j > 0) {
                    sum += img[i][j - 1];
                    count++;
                }
                if (i != img.length - 1) {
                    sum += img[i + 1][j];
                    count++;
                }
                if (j != img[i].length - 1) {
                    sum += img[i][j + 1];
                    count++;
                }
                if (i > 0 && j > 0) {
                    sum += img[i - 1][j - 1];
                    count++;
                }
                if (i > 0 && j != img[i].length - 1) {
                    sum += img[i - 1][j + 1];
                    count++;
                }
                if (i != img.length - 1 && j > 0) {
                    sum += img[i + 1][j - 1];
                    count++;
                }
                if (i != img.length - 1 && j != img[i].length - 1) {
                    sum += img[i + 1][j + 1];
                    count++;
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}
