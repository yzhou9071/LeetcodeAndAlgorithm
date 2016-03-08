package com.yzhou9071.Leetcode;

public class N313_SuperUglyNumber {
	public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ret = new int[n];
        int[] index = new int[primes.length];
        
        ret[0] = 1;
        for(int i=1;i<n;i++)
        	ret[i] = getMin(index,ret,primes);
        
        return ret[n-1];        
    }
	private int getMin(int[] index, int[] ret,int[] primes){
		int ugly = Integer.MAX_VALUE;
		for(int i=0;i<primes.length;i++)
			ugly = Math.min(ugly,ret[index[i]]*primes[i]);
		for(int i=0;i<primes.length;i++){
			if(ret[index[i]]*primes[i] <= ugly)
				++index[i];
		}
		return ugly;
	}
}
