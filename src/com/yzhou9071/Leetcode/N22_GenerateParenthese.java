package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N22_GenerateParenthese {
	//https://zh.wikipedia.org/wiki/%E5%8D%A1%E5%A1%94%E5%85%B0%E6%95%B0
	//http://blog.csdn.net/linhuanmars/article/details/19873463
	public List<String> generateParenthesis(int n) {
		List<String> parentheses = new ArrayList<String>();
		if(n == 0)
			return parentheses;
		
		helper(parentheses,"",n,n);
		return parentheses;
    }
	private void helper(List<String> res, String str,
			int left, int right){
		if(right == 0)
			res.add(str);
		
		if(left > 0)
			helper(res,str + "(",left-1,right);
		
		if(left < right)
			helper(res,str + ")",left,right-1);
	}
}
