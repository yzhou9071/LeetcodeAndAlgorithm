package com.yzhou9071.Leetcode;

public class N309_BestTimeBuySellCD {
	public int maxProfit(int[] prices) {
		int len = prices.length;
        if(len <= 0)
        	return 0;
        
        int[] sells = new int[len];
        int[] cooldown = new int[len];
        
        sells[0] = 0;
        cooldown[0] = 0;
        
        for(int i=1;i<len;i++){
        	sells[i] = Math.max(sells[i-1]+prices[i]-prices[i-1],cooldown[i-1]);
        	cooldown[i] = Math.max(sells[i-1], cooldown[i-1]);
        }
        
        return Math.max(sells[len-1], cooldown[len-1]);		
    }
}
