package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N241_DifferentWaysAddParentheses {
	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> ret = new ArrayList<Integer>();
		if(input.equals("") || input == null)
			return ret;
		
		if(!input.contains("+")
				&& !input.contains("-")
				&& !input.contains("*")){
			ret.add(Integer.valueOf(input));
			return ret;
		}
		
		for(int i=0;i<input.length();i++){
			char operator = input.charAt(i);
			if(operator=='+'
					|| operator=='-'
					|| operator=='*'){
				List<Integer> leftList = diffWaysToCompute(input.substring(0, i));
				List<Integer> rightList = diffWaysToCompute(input.substring(i+1, input.length()));
			
				for(int left: leftList){
					for(int right: rightList){
						switch(operator){
						case '+':ret.add(left+right);break;
						case '-':ret.add(left-right);break;
						case '*':ret.add(left*right);break;
						}
					}
				}
			}
		}
		return ret;
    }
}
