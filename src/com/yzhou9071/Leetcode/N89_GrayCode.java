package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N89_GrayCode {
	public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        if(n == 0){
        	res.add(0);
        	return res;
        }
        
        res = grayCode(n-1);
        for(int i=res.size()-1;i>=0;i--)
        	res.add(1<<(n-1) | res.get(i));
        
        return res;
    }
}
