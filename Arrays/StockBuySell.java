package com.Gfg.Arrays;

public class StockBuySell {

	// Given an array of prices for a stock for n days. WAP to maximize the profit.
	// I/P: arr[] = {1, 5, 3, 8, 12}
	// O/P: 13 => buy at 1, sell at 5 and again buy at 3, sell at 12.

	public static void main(String[] args) {
		int[] price = { 1, 5, 3, 8, 12 };
//		System.out.println(getMaxProfitNaive(price, 0, price.length - 1));
		System.out.println(getMaxProfitEfficient(price, price.length));
	}

	// If price is increasing keep adding it to the profit (Cumulative sum)
	private static int getMaxProfitEfficient(int[] price, int n) {
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (price[i] > price[i - 1])
				profit += (price[i] - price[i - 1]);
		}
		return profit;
	}

	@SuppressWarnings("unused")
	private static int getMaxProfitNaive(int[] price, int start, int end) {
		if (end <= start)
			return 0;
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (price[j] > price[i]) {
					int currProfit = price[j] - price[i] + getMaxProfitNaive(price, start, i - 1)
							+ getMaxProfitNaive(price, j + 1, end);
					profit = Integer.max(profit, currProfit);
				}
			}
		}
		return profit;
	}

}
