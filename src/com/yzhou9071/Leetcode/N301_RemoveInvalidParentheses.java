package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N301_RemoveInvalidParentheses {
	public List<String> removeInvalidParentheses(String s) {
        List<String> ret = new ArrayList<String>();
        removeInvalid(ret,new char[]{'(',')'},s,0,0);
        return ret;
    }
	private void removeInvalid(List<String> ret, char[] param,String s, int left, int right){
		int stack = 0;
        for(int i=left;i<s.length();i++){
        	if(s.charAt(i) == param[0])
        		++stack;
        	if(s.charAt(i) == param[1])
        		--stack;
        	if(stack >= 0)
        		continue;
        	for(int j=right;j<=i;j++){
        		if(s.charAt(j) == param[1] 
        				&& (j==right || s.charAt(j-1)!=param[1]))
        			removeInvalid(ret,param,s.subSequence(0, j)+s.substring(j+1,s.length()),i,j);
        	}
        	return ;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if(param[0] == '(')
        	removeInvalid(ret,new char[]{')','('},reversed,0,0);
        else
        	ret.add(reversed);
	}
}
