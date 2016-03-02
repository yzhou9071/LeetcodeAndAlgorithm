package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N89_GrayCode {
	//http://www.cnblogs.com/springfor/p/3889222.html
	//https://zh.wikipedia.org/wiki/%E6%A0%BC%E9%9B%B7%E7%A0%81
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
