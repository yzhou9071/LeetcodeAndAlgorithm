package com.yzhou9071.Leetcode;

public class N204_CountPrimes {
	public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n+1];
        for(int i=0;i<n;i++)
        	isPrimes[i] = true;
        
        for(int i=2;i*i<n;i++){
        	if(isPrimes[i]){
        		for(int j=i*2;j<n;j+=i){
        			isPrimes[j] = false;
        		}
        	}
        }
        
        int ret = 0;
        for(int i=2;i<n;i++){
        	if(isPrimes[i])
        		++ret;
        }
		
		return ret;
    }
}
