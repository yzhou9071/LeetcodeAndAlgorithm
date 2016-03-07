package com.yzhou9071.Leetcode;

public class N66_PlusOne {
	public int[] plusOne(int[] digits) {
        if(digits.length <= 0)
        	return digits;
        
        int len = digits.length;
        int last = 1;
        for(int i=len-1;i>=0;i--){
        	int tmp = digits[i] + last;
    		digits[i] = tmp % 10;
        	if(tmp / 10 == 0)
        		return digits;
        }
        
        int[] ret = new int[len+1];
        ret[0] = 1;
        return ret;
    }
}
