package com.yzhou9071.Leetcode;

public class N231_PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n-1)) == 0);
    }
}
