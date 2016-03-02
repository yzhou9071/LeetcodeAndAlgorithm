package com.yzhou9071.Leetcode;

public class N70_ClimbingStairs {
	//http://blog.csdn.net/kenden23/article/details/17377869
	public int climbStairs(int n) {
		int[] tmp = new int[3];
		tmp[0] = 1;
		tmp[1] = 1;
		for(int i=2;i<=n;i++){
			tmp[i%3] = tmp[(i-2)%3] + tmp[(i-1)%3];
		}
		
		return tmp[n%3];
    }
}
