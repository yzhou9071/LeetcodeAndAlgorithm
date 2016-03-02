package com.yzhou9071.Leetcode;

import java.util.ArrayList;

public class N202_HappyNumber {
	public boolean isHappy(int n) {
		if(n <= 0)
        	return false;
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(true){
        	int sum = 0;
        	int tmp = 0;
        	while(n > 0){
        		tmp = n % 10;
        		sum += tmp*tmp;
        		n /= 10;
        	}
        	n = sum;
        	if(sum == 1)
        		return true;
        	if(res.contains(sum))
        		return false;
        	else
        		res.add(sum);
        }
    }
}
