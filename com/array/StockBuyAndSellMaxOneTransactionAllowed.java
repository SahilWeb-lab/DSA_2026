package com.array;

public class StockBuyAndSellMaxOneTransactionAllowed {

//	Naive Approach:
//	public static int maximumProfit(int prices[]) {
//		int res = 0;
//		for(int i = 0; i < prices.length; i++) {
//			for(int j = i + 1; j < prices.length; j++) {
//				res = Math.max(res, prices[j] - prices[i]);
//			}
//		}
//		
//        return res;
//    }
//	
	
//	Expected Approach:
	public static int maximumProfit(int prices[]) {
		int n = prices.length, minPrice = prices[0], res = 0;
		for(int i = 1; i < n; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			res = Math.max(res, prices[i] - minPrice);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int prices[] = {7, 10, 1, 3, 6, 9, 2};
		int maximumProfit = maximumProfit(prices);
		System.out.println(maximumProfit);
	}

}
