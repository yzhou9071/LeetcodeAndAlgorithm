package com.yzhou9071.Leetcode;

public class N123_BestTimeBuySellStock2 {
	public int maxProfit(int[] prices) {
        if(prices.length <= 0)
        	return 0;
        
        int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        int sell1 = 0, sell2 = 0;
        for(int i=0;i<prices.length;i++){
        	buy1 = buy1>(-prices[i]) ? buy1 : (-prices[i]);
        	sell1 = sell1>(buy1+prices[i]) ? sell1 : (buy1+prices[i]);
        	buy2 = buy2>(sell1-prices[i]) ? buy2 : (sell1-prices[i]);
        	sell2 = sell2>(buy2+prices[i]) ? sell2 : (buy2+prices[i]);
        }
        return sell2;
    }
}
