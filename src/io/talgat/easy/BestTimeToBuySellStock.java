package io.talgat.easy;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */
public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        BestTimeToBuySellStock sut = new BestTimeToBuySellStock();
        int[] prices = new int[] {7,1,5,3,6,4};
        int res = sut.maxProfit(prices);
        System.out.println("res = " + res);
    }

    public int maxProfit(int[] prices) {
        int tempProfit = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < tempProfit) {
                tempProfit = price;
            }
            if (price - tempProfit > maxProfit) {
                maxProfit = price - tempProfit;
            }
        }
        return maxProfit;
    }
}
