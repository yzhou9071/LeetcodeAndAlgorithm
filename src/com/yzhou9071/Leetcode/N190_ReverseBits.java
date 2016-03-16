package com.yzhou9071.Leetcode;

public class N190_ReverseBits {
	public int reverseBits(int n) {
        int ret = 0;
        for(int i=0;i<32;i++)
        	ret = (ret<<1) + ((n>>i)&1);
        return ret;
    }
}
