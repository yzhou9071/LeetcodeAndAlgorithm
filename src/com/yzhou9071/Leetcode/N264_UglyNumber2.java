package com.yzhou9071.Leetcode;

public class N264_UglyNumber2 {
    public int nthUglyNumber(int n) {
        if(n<=0)
        	return 0;
        
        int[] ret = new int[n+1];
        ret[0] = 1;
        int pos2 = 0, pos3 = 0, pos5 = 0;
        for(int i=1;i<=n;i++){
        	ret[i] = Math.min(Math.min(ret[pos2]*2,ret[pos3]*3), ret[pos5]*5);
        	if(ret[pos2]*2 == ret[i]) pos2++;
        	if(ret[pos3]*3 == ret[i]) pos3++;
        	if(ret[pos5]*5 == ret[i]) pos5++;
        }
        return ret[n-1];
    }
}
