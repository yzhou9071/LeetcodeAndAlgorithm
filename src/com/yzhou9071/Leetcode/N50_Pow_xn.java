package com.yzhou9071.Leetcode;

public class N50_Pow_xn {
	public double myPow(double x, int n) {
		if(x == 0)
			return 0;
		if(n == 0
				|| x == 1)
			return 1;
		
		double ret = 1;
		int pow = n>0?n:-n;
		for(double mem=x;pow>0;pow>>=1){
			if((pow & 1) != 0)
				ret *= mem;
			mem *= mem;
		}
		
        return n>0?ret:1/ret;
    }
}
