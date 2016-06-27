package com.yzhou9071.Leetcode;

public class N342_PowerOfFour {
	public boolean isPowerOfFour(int num) {
        if(num<=0 || num>Integer.MAX_VALUE)
        	return false;
        
        return ((num & (num - 1)) == 0)
        		&& ((num & 0x55555555) == num);
    }
}
