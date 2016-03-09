package com.yzhou9071.Leetcode;

public class N172_FactorialTraillingZeroes {
	public int trailingZeroes(int n) {
        int ret = 0;
        while(n >= 5){
        	n /= 5;
        	ret += n;
        }
        return ret;
    }
}
