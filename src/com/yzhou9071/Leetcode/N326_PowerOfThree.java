package com.yzhou9071.Leetcode;

public class N326_PowerOfThree {
	public boolean isPowerOfThree(int n) {
        if(n<=0 || n>Integer.MAX_VALUE)
        	return false;
        return Math.pow(3, (int)(Math.log(Integer.MAX_VALUE)/Math.log(3))) % n == 0;
    }
}
