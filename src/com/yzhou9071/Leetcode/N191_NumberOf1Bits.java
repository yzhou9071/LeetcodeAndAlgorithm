package com.yzhou9071.Leetcode;

public class N191_NumberOf1Bits {
	public int hammingWeight(int n) {
        int nums = 0;
        for(int i=0;i<32;i++){
        	if(((n>>i) & 1) == 1)
        		nums++;
        }
        
        return nums;
    }
}
