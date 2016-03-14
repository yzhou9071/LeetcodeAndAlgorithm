package com.yzhou9071.Leetcode;

public class N201_BitwiseAndOfNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
        int index = 0;
		while(m != n){
			m >>=1;
			n>>=1;
			++index;
		}
		return m<<index;
    }
}
