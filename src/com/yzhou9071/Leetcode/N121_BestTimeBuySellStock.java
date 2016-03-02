package com.yzhou9071.Leetcode;

public class N121_BestTimeBuySellStock {
	public int maxProfit(int[] prices) {
		if(prices.length <= 0)
			return 0;
		int max = 0;
		int buys = prices[0];
		for(int i=1;i<prices.length;i++){
			if(prices[i]<buys)
				buys = prices[i];
			else
				max = (prices[i]-buys-max > 0)?(prices[i]-buys):max;
		}
		
		return max;
    }
}
