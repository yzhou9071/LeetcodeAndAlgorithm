package com.yzhou9071.Leetcode;

public class N7_ReverseInteger {
	public static int reverse(int x) {
        long ret = 0;
        while(x != 0){
        	ret = ret*10 + x%10;
        	x /= 10;
        }
        return (ret >= Integer.MIN_VALUE && ret <= Integer.MAX_VALUE) ? (int)ret : 0;
    }
}
