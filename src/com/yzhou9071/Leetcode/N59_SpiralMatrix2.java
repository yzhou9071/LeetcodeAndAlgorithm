package com.yzhou9071.Leetcode;

public class N59_SpiralMatrix2 {
	public int[][] generateMatrix(int n) {
		if(n < 0)
			return null;
		
		int[][] ret = new int[n][n];
		int num = 0;
		for(int level=0;level<n/2;level++){
			for(int i=level;i<n-1-level;i++)
				ret[level][i] = ++num;
			for(int i=level;i<n-1-level;i++)
				ret[i][n-level-1] = ++num;
			for(int i=n-1-level;i>level;i--)
				ret[n-1-level][i] = ++num;
			for(int i=n-1-level;i>level;i--)
				ret[i][level] = ++num;
		}
		if(n%2 == 1)
			ret[n/2][n/2] = ++num;
		return ret;
    }
}
