package com.yzhou9071.Leetcode;

import java.util.Arrays;

public class N279_PerfectSquares {
	public int numSquares(int n) {
        if(n <= 0)
        	return 0;
        
        int[] ret = new int[n+1];
        Arrays.fill(ret, Integer.MAX_VALUE);
        for(int i=1;i*i<=n;i++)
        	ret[i*i] = 1;
        for(int i=1;i<=n;i++){
        	for(int j=1;i+j*j<=n;j++)
        		ret[i+j*j] = Math.min(ret[i]+1, ret[i+j*j]);
        }
        
        return ret[n];
    }
}
